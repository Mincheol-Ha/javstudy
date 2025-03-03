package hello.innerclass;

public class OutClass {
    private int num = 10; // 외부 클래스
    private static int sNum = 20; // 외부 클래스 private 변수
/*    private InClass inClass; // 외부 클래스 정적 변수

    public OutClass() {
        inClass = new InClass();
    }*/

    static class InStaticClass {  // 인스턴스 내부 클래스
        int inNum = 100;  // 내부 클래스의 인스턴스 변수
        static int sInNum = 200;  // 인스턴스 내부 클래스에 정적 변수(자바 16부터 허용)

        void inTest() {
           /* System.out.println("OutClass num = " +num + "(외부 클래스의 인스턴스 변수)");*/
            System.out.println("OutClass inNum = " + inNum + "(내부 클래스의 인스턴스 변수 사용)");
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sInNum = " + sInNum + "(인스턴스 내부 클래스의 정적 변수 사용)");
        }

        static void sTest() {  // 인스턴스 내부 클래스에 정적 메서드(자바 16부터 허용)
            /*System.out.println("인스턴스 내부 클래스의 정적 메서드 호츨");*/
            System.out.println("OutClass sNum = " + sNum + "(외부 클래스의 정적 변수 사용)");
            System.out.println("OutClass sInNum = " + sInNum + "(내부 클래스의 정적 변수 사용)");

        }


    }
/*
    public void usingClass() {
        inClass.inTest();
    }
*/

}
