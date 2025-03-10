package exercise.chapter5.q11;

public class Person {

    // Person 클래스에 이미 추가된 생성자 외에 이름, 키 ,몸무게를 매개변수로 받는 생성자를 추가하세요.
    // 그리고 PersonTest.java에서 추가된 생성자를 사용하여 인스턴스를 생성해 보세요.

    String name;
    float heigth;
    float weight;

    public Person() {}

    public Person(String pname) {
        name = pname;
    }
    public Person(String pname, float pheight, float pweight) {
        name = pname;
        heigth = pheight;
        weight = pweight;
    }
}
