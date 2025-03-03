package hello.innerclass;

public class InnerTest {
    public static void main(String[] args) {
 /*       OutClass outClass = new OutClass();
        System.out.println("외부 클래스 이용하여 내부 클래스 기능 호출");
        outClass.usingClass( );
        System.out.println("인스턴스 내부 클래스 정적 변수 직접 호출 OutClass.InClass.sInNum = " + OutClass.InClass.sInNum);
        OutClass.InClass.sTest();*/

        OutClass.InStaticClass sInClass = new OutClass.InStaticClass();
        System.out.println("정적 내부 클래스 일반 메서드 호출");
        sInClass.inTest();
        System.out.println();
        System.out.println("정적 내부 클래스의 정적 메서드 호출");
        OutClass.InStaticClass.sTest();
   }
}
