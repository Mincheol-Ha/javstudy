package hello.chapter5.Function;

public class FunctionTest {
    //FunctionTest.java 코드레 사직 연산을 수행하는 함수를 모두 구현하고 결괏값을 출력
    public static void main(String[] args) {

        int num1 = 10;
        int num2 = 20;

        int result = addNum(num1, num2);
        System.out.println(num1 + " + " + num2 + " = " + result + "입니다.");

        result = substract(num1, num2);
        System.out.println(num1 + " - " + num2 + " = " + result + "입니다.");

        result = times(num1, num2);
        System.out.println(num1 + " * " + num2 + " = " + result + "입니다.");

        double value = divide(num1, num2);
        System.out.println(num1 + " / " + num2 + " = " + value + "입니다.");
    }
    public static int addNum(int n1, int n2) {
        int result = n1 + n2;
        return result;
    }
    public static int substract(int n1, int n2) {
        int result = n1 - n2;
        return result;
    }
    public static int times(int n1, int n2) {
        int result = n1 * n2;
        return result;
    }

    public static double divide(int n1, int n2) {
        double result = n1 / n2;
        return result;

    }

}
