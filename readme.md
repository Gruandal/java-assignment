# Homework

- 作者: 吳幸儒
- 學號: B11209002

## Homework7

### 程式資料

- Access Point: /src/Homework7.java
- Book Class: /src/Model/hw07/Book.java
- Author Enum: /src/Model/hw07/Author.java
- Publisher Class: /src/Model/hw07/Publisher.java
- BookTest Class: /src/Model/hw07/test/BookTest.java

由於本次作業要求撰寫 BookTest 來測試 Book 與相關的依賴 ，故採用 junit 來測試，以便管理。

備註: junit 版本為 4.13.1，對應的 jar 檔案已經放在 /lib 資料夾下

![](./src/Images/截圖%202024-04-15%20下午7.47.40.png)


## Homework6

### 程式資料
- Access Point: /src/Homework6.java
- Date Class: /src/Model/hw06/Date.java
- Sex Enum: /src/Model/hw06/Sex.java
- Customer Class: /src/Model/hw06/Customer.java
- CustomerTest Class: /src/Model/hw06/test/CustomerTest.java
- CustomerTest test data: /src/Model/hw06/test/customers.txt

## Homework5

### 程式資料
- Access Point: /src/Homework5.java
- ParseUrl Class: /src/Model/hw05/ParseUrl.java
- ParseTest Class: /src/Model/hw05/ParseTest.java

## Homework4
由於本次作業要求撰寫 BookingTest 來測試 Booking 與 Customer 這兩個類是否正確，故採用 junit 來測試，以便管理。

備註: junit 版本為 4.13.1，對應的 jar 檔案已經放在 /lib 資料夾下

![](./src/Images/截圖%202024-03-25%20下午11.34.39.png)

### 程式資料
- Access Point: /src/Homework4.java
- Booking Class: /src/Model/hw04/Booking.java
- Customer Class: /src/Model/hw04/Customer.java
- BookingTest Class: /src/Model/hw04/test/BookingTest.java

## Homework3
本次作業由於涉及矩陣運算，為求運算穩定、減少「造輪子」等行為，因此使用 weka.core.matrix 的相關方式來達成。
請務必將 /lib/weka.jar 中的檔案用作項目的依賴項。

以 IDEA 舉例：
1. 点击右上角 文件->项目结构->模块->依赖
2. 选择窗口右边的 ‘+’ 按钮，点击 ’JARs或目录‘ ，选择weka.jar文件，点击确定

### 程式資料
- 核心邏輯: /src/Model/VectorCalculator.java
- 測試範例(測試程式): /src/Homework3.java

## Homework1

### 程式資料

- Time 物件: /src/Model/Time.java
- TimeTest 物件: /src/TimeTest.java

### 實作功能
-	Time 物件不同引數個數的建構式: Time(hh,mm,ss), Time(hh,mm), Time(hh)
-	toString()方法: 顯示為 hh:mm:ss 格式(注意：12小時制)
-	時分秒的get/set方法(需檢查傳入值的範圍)
     int getHour(), int getMinute(), int getSecond(), void setHour(int hh), void setMinute(int mm), void setSecond(int ss)
-	boolean isMorning(), boolean isAfternoon(), boolean isNoon(), boolean isEvening()方法

### 時間定義

>#### 格式
> 名稱: 開始時(:分)(:秒) ~ 結束時(:分)(:秒)
- Morning: 0 ~ 12
- Afternoon: 12 ~ 18
- Evening: 18 ~ 20
- Noon: 12:00:00 ~ 12:00:00




