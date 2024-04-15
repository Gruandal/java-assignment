import Model.*;
import Model.ErrorHandler;

import java.util.Scanner;

public class Homework3 {
    public static void main(String[] args) {
        double[] x;
        double[] y;
        // test1-1 VectorCalculator.innerProduct
        try {
            System.out.println("請輸入正整數(Vector元素數量)");
            Scanner input = new Scanner(System.in);
            int range = input.nextInt();
            x = new double[range];
            y = new double[range];
            for (int index = 0; index < range; index ++) {
                System.out.println("input x vector element " + index);
                x[index] =  input.nextDouble();
            }
            for (int index = 0; index < range; index ++) {
                System.out.println("input y vector element " + index);
                y[index] =  input.nextDouble();
            }
            System.out.println("------ Test 1-1: VectorCalculator.innerProduct ------");
            System.out.println(VectorCalculator.innerProduct(x, y));
            // test1-2 norm2
            System.out.println("------ Test 1-2: innerProduct ------");
            System.out.println("Test Vector X: " + VectorCalculator.norm2(x));
            System.out.println("Test Vector Y: " + VectorCalculator.norm2(y));
            // test1-3 norm2
            System.out.println("------ Test 1-3: cosine ------");
            System.out.println(VectorCalculator.cosine(x, y));
            // test1-4 Cos to deg
            System.out.println("------ Test 1-4: deg ------");
            System.out.println(VectorCalculator.deg(x, y));
        }catch (Exception e) {
            ErrorHandler.print(e);
        }
    }
}
