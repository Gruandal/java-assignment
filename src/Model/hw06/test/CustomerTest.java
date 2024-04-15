package Model.hw06.test;

import static Model.Utils.*;

import Model.hw06.Customer;
import Model.hw06.Sex;
import Model.hw06.Date;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Objects;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CustomerTest {
    private ArrayList<Customer> testObj;

    public void setup() {
        this.testObj = new ArrayList<Customer>();
        // get test data
        String regex = "(.*),(MALE|FEMALE),(\\d{4}\\/[0-9]{2}\\/[0-9]{2}),([0-9]{10})";
        Pattern pattern = Pattern.compile(regex);
        for (String line : getFileContents("src/Model/hw06/test/customers.txt").split("\n")) {
            Matcher matcher = pattern.matcher(line);
            if (matcher.find()) {
                Sex sex = Objects.equals(matcher.group(2), "FEMALE") ? Sex.FEMALE : Sex.MALE;
                int[] dateStringGroup = Arrays.stream(matcher.group(3).split("/")).mapToInt(Integer::parseInt).toArray();
                Date date = new Date(dateStringGroup[0], dateStringGroup[1], dateStringGroup[2]);
                this.testObj.add(new Customer(matcher.group(1), sex, date, matcher.group(4)));
            }
        }
        // print out result
        for (Customer item : this.testObj) {
            print(item.toString());
        }
    }

    public static void main(String[] args) {
        CustomerTest tester = new CustomerTest();
        tester.setup();
    }
}
