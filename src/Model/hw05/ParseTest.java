package Model.hw05;

public class ParseTest {
    public static void test() {
        ParseUrl parser = new ParseUrl();
        parser.parse("https://moodle.ntust.edu.tw/course/view.php?id=19803");
        System.out.println(parser);
    }
    public static void main(String[] args) {
        test();
    }
}