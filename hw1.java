package otus-homeworks-module1;
public class MethodsDemoApplication {
    public static void main(String[] args) {
        printHelloThreeTimes();
        sumAndPrint();
        printHelloThreeTimes();
    }

    public static void printHelloThreeTimes() {
        System.out.println("Hello");
        System.out.println("Hello");
        System.out.println("Hello");
    }
    public static void sumAndPrint() {
        int a = 10;
        int b = 20;
        int sum = a + b;
        System.out.println("Sum:" + sum);
    }
}