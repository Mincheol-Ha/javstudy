package hello.lambda;

public class TestLambda {
    public static void main(String[] args) {
        PrintString lambdaStr = s -> System.out.println(s);
        lambdaStr.showString("hello lamda_1");
        showMyString(lambdaStr);

        PrintString reStr = returnString();
        reStr.showString("hello ");
    }
    public static void showMyString(PrintString p) {
        p.showString("hello lamda_2");
    }

    public static PrintString returnString() {
        return s -> System.out.println(s + "world");
    }
}
