package Model;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Time {

    /**
     * 儲存此物件的時間
     */
    private LocalDateTime time;

    public Time(int hh, int mm, int ss) {
        // do something in beginning
        try {
            this.time = LocalDateTime.of(1, 1, 1, hh, mm, ss);
        }catch (Exception e) {
            this.printError(e);
        }
    }

    public Time(int hh, int mm) {
        this(hh, mm, 0);
    }

    public Time(int hh) {
        this(hh, 0, 0);
    }

    /**
     * 設定Hour
     * @param hh
     */
    public void setHour(int hh) {
        try {
            this.time = this.time.withHour(hh);
        }catch (Exception e) {
            this.printError(e);
        }
    }

    /**
     * 設定Minute
     * @param mm
     */
    public void setMinute(int mm){
        try {
            this.time = this.time.withMinute(mm);
        }catch (Exception e) {
            this.printError(e);
        }
    }

    /**
     * 設定Second
     * @param ss
     */
    public void setSecond(int ss) {
        try {
            this.time = this.time.withSecond(ss);
        }catch (Exception e) {
            this.printError(e);
        }
    }

    /**
     * 取得時間戳的 Hour 單位值
     * @return int
     */
    public int getHour() {
        return this.time.getHour();
    }

    /**
     * 取得時間戳的 Minute 單位值
     * @return int
     */
    public int getMinute() {
        return this.time.getMinute();
    }

    /**
     * 取得時間戳的 Second 單位值
     * @return int
     */
    public int getSecond() {
        return this.time.getSecond();
    }

    /**
     *判斷是否為上午(上午的定義：0~12點)
     * @return Boolean
     */
    public boolean isMorning() {
        // 回傳 當前 Hour 大於等於0點並且小於12點
        return this.getHour() >= 0 && this.getHour() < 12;
    }

    /**
     * 判斷是不是下午（下午的定義: 12點 ~ 18點以前）
     * @return boolean
     */
    public boolean isAfternoon() {
        return this.getHour() >= 12 && this.getHour() < 18;
    }

    /**
     *判斷是否為中午(中午的定義：12點整)
     * @return Boolean
     */
    public boolean isNoon() {
        return this.getHour() == 12 && this.getMinute() == 0 && this.getSecond() == 0;
    }

    /**
     * 判斷是否為傍晚(傍晚的定義：18~20點之間)
     * @return Boolean
     */
    public boolean isEvening() {
        return this.getHour() >= 18 && this.getHour() < 20;
    }

    /**
     * 回傳一個格式為 hh:mm:ss 的時間
     * @return String
     */
    public String toString() {
        return this.time.format(DateTimeFormatter.ofPattern("hh:mm:ss"));
    }

    /**
     * 遇到錯誤時印出錯誤資訊的處理function
     * @param e
     */
    private void printError(Exception e) {
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
        System.out.println("Error: " + e.toString());
        System.out.println("!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!!");
    }
}
