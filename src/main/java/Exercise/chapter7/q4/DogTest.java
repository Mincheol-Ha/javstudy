package Exercise.chapter7.q4;

public class DogTest {

    public static void main(String[] args) {


        Dog[] dogs = new Dog[5];
        dogs[0] = new Dog("해피", "시츄");
        dogs[1] = new Dog("진돌", "진돗개");
        dogs[2] = new Dog("로로", "말티즈");
        dogs[3] = new Dog("통통", "허스키");
        dogs[4] = new Dog("복희", "닥스훈트");

        for(int i = 0; i < dogs.length; i++) {
            System.out.print(dogs[i].showDogInfo());
        }
        System.out.println("=== 향상된 for문 ===");
        for(Dog dog : dogs) {
            System.out.print(dog.showDogInfo());
        }


    }
}
