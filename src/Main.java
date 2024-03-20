public class Main {

    public static void determineTheYear(int year) {
       if (year >= 1584 && ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0))) {
           System.out.println(year + " Год является високосным");
       } else {
           System.out.println(year + " Год не является високосным");
       }
    }

    public static void main(String[] args) {

        //task 1
        System.out.println("Task 1");
        determineTheYear(2000);
        determineTheYear(1385);
        determineTheYear(1997);



    }
}
