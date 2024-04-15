import Model.hw04.test.BookingTest;
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;
import org.junit.runner.notification.Failure;

public class Homework4 {
    public static void main(String[] args) {
        Result result = JUnitCore.runClasses(BookingTest.class);
        for (Failure failure : result.getFailures()) {
            System.out.println(failure.toString());
        }
        if (result.wasSuccessful()) {
            System.out.println("All tests passed!");
        }
    }
}
