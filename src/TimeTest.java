import Model.*;

public class TimeTest {
    public static void main(String[] args) throws Exception {
        Time[] timeList;
        timeList = new Time[3];
        timeList[0] = new Time(19, 9, 12);
        timeList[1] = new Time(12, 7);
        timeList[2] = new Time(6);
        timeList[0].setHour(25);
        for (Time currentObj : timeList) {

            // test toString ()
            System.out.println("------ Test: Time.toString() ------");
            System.out.println(currentObj.toString());

            // test isMorning()
            System.out.println("------ Test: Time.isMorning() ------");
            System.out.println("current time: " + currentObj.toString());
            System.out.println(currentObj.isMorning());

            // test isAfternoon()
            System.out.println("------ Test: Time.isAfternoon() ------");
            System.out.println("current time: " + currentObj.toString());
            System.out.println(currentObj.isAfternoon());

            // isEvening
            System.out.println("------ Test: Time.isEvening() ------");
            System.out.println("current time: " + currentObj.toString());
            System.out.println(currentObj.isEvening());

            // test setHour(12)
            System.out.println("------ Test: Time.setHour(12) ------");
            currentObj.setHour(12);

            // test getHour()
            System.out.println("------ Test: Time.getHour() ------");
            System.out.println("current time: " + currentObj.toString());
            System.out.println(currentObj.getHour());

            // test isNoon()
            System.out.println("------ Test: Time.isNoon() ------");
            System.out.println(currentObj.isNoon());

            // test setMinute(30)
            System.out.println("------ Test: Time.setMinute(30) ------");
            currentObj.setMinute(30);

            // test getMinute()
            System.out.println("------ Test: Time.getMinute() ------");
            System.out.println("current time: " + currentObj.toString());
            System.out.println(currentObj.getMinute());

            // test setSecond(30)
            System.out.println("------ Test: Time.setSecond(30) ------");
            currentObj.setSecond(29);

            // test getSecond()
            System.out.println("------ Test: Time.getSecond() ------");
            System.out.println("current time: " + currentObj.toString());
            System.out.println(currentObj.getSecond());

            // test over range error
            // Over Hour
            System.out.println("------ Test: Error Detect(try to set hour as 25) ------");
            currentObj.setHour(25);
            // Over Minute
            System.out.println("------ Test: Error Detect(try to set minute as 66) ------");
            currentObj.setMinute(66);
            // Over Second
            System.out.println("------ Test: Error Detect(try to set minute as -1) ------");
            currentObj.setMinute(-1);

            System.out.println("============== Test End ==============");
        }
    }
}
