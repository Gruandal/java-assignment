package Model.hw05;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ParseUrl {
    String protocol;
    String host;
    String path;
    String filename;
    String query;
    protected final String pattern = "(([^:/?#]+):)?(//([^/?#]*))?([^:\\/\\s]+)((\\/\\w+)*\\/)([\\w\\-\\.]+[^#?\\s]+)(.*)?(#[\\w\\-]+)?$";

    public ParseUrl() {
        this.protocol = "";
        this.host = "";
        this.path = "";
        this.filename = "";
        this.query = "";
    }

    public void parse(String urlString) {
        Pattern rule = Pattern.compile(this.pattern);
        Matcher result = rule.matcher(urlString);
        if (result.find()) {
            this.protocol = result.group(2);
            this.host = result.group(4) + result.group(5);
            this.path = result.group(6);
            this.filename = result.group(8);
            // 分析 query
            String query = result.group(9).substring(result.group(9).indexOf("?") + 1);
            for (String param : query.split("#")[0].split("&")) {
                String[] keyValue = param.split("=");
                if (this.query != "") {
                    this.query += ", ";
                }
                this.query += keyValue[0] + "=" + keyValue[1];
            }
        }
    }

    public String toString() {
        return "protocol: " + this.protocol + "\nhost: " + this.host + "\npath: "
                + this.path + "\nfilename: " + this.filename + "\nquery: " + this.query;
    }

    public static void main(String[] args) {
        ParseUrl obj = new ParseUrl();
        obj.parse("http://localhost:8080/mail/ntust/search.php?keywords=ruby&sister=wangzhenghong");
        System.out.println(obj);
    }
}

