import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Homework2 {
    public static void main(String[] args) {
        List<Integer> Data = new ArrayList<>();

        Scanner stdin = new Scanner(System.in);
        System.out.println("請輸入10位同學的成績:");
        for (int index = 0; index < 10; index++) {
            System.out.printf("第%d位:", index + 1);
            int UserInputInt = stdin.nextInt();
            // check is valid number
            if (UserInputInt < 0 || UserInputInt > 100) {
                System.out.println("分數需介於0~100，請再輸入一次");
                index --;
                continue;
            }
            // is valid, put data
            Data.add(UserInputInt);
        }
        // print result
        System.out.printf("分數介於90-100人數:%d人\n", Data.stream().filter(e -> e >= 90 && e <= 100).count());
        System.out.printf("分數介於80-89人數:%d人\n", Data.stream().filter(e -> e >= 80 && e <= 89).count());
        System.out.printf("分數介於70-79人數:%d人\n", Data.stream().filter(e -> e >= 70 && e <= 79).count());
        System.out.printf("分數介於60-69人數:%d人\n", Data.stream().filter(e -> e >= 60 && e <= 69).count());
        System.out.printf("分數介於0-59人數:%d人\n", Data.stream().filter(e -> e <= 59).count());
    }
}
