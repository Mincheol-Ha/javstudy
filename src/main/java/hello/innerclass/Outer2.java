package hello.innerclass;

public class Outer2 {
    Runnable getRunnable(int i) {
        int num = 100;

        return new Runnable() {

            @Override
            public void run() {
                // num = 200; 오류 발생
                // i = 10;  오류발생
                System.out.println(i);
                System.out.println(num);
            }
        };  // < 클래스 끝에 ; 를 씀
    }

    Runnable runner = new Runnable() { // 익면 내부 클래스를 변수에 대입

        @Override
        public void run() {
            System.out.println("Runnable이 구현된 익명 클래스 변수");
        }
    };
}

