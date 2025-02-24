package hello.abstractex;

public class ComputerTest {
    public static void main(String[] args) {
        Computer c1 = new Computer(); // 추상 클래스틑 인스턴스로 생성될 수 없다.
        Computer c2 = new DeskTop();
        Computer c3 = new NoteBook(); // 추상 클래스틑 인스턴스로 생성될 수 없다.
        Computer c4 = new MyNoteBook();
    }
}
