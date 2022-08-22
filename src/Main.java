import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        doTask1();
        doTask2();
        doTask3();
    }

    public static void doTask1(){
        System.out.println("Task 1");
        int year = 2020;
        if (checkIsLeapYear(year)){
            System.out.printf("%d - високосный год\n", year);
        } else {
            System.out.printf("%d - не високосный год\n", year);
        }
    }

    public static void doTask2(){
        System.out.println("Task 2");
        System.out.println(suggestApp(1, 2021));
    }

    public static void doTask3(){
        System.out.println("Task 3");
        System.out.printf("Потребуется дней: %d", calcDeliveryDays(60));
    }

    public static boolean checkIsLeapYear(int year){
        if ((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return true;
        }
        else {
            return false;
        }
    }

    public static String suggestApp(int osType, int deviceYear){
        String appType;
        if (deviceYear < LocalDate.now().getYear()){
            appType = "облегченную";
        } else {
            appType = "обычную";
        }
        String osName;
        if (osType == 0){
            osName = "iOS";
        } else {
            osName = "Android";
        }
        return String.format("Установите %s версию приложения для %s", appType, osName);
    }

    public static int calcDeliveryDays(int distance){
        int minDistance = 20;
        int increaseDistance = 40;
        return (int) Math.floor(((double) distance + minDistance) / increaseDistance) + 1;
    }
}