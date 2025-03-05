package hello.stream;

import java.util.ArrayList;
import java.util.List;

public class TravleTest {
    public static void main(String[] args) {
        TravleCustomer coustomerLee = new TravleCustomer("이미나", 40, 100);
        TravleCustomer coustomerKim = new TravleCustomer("김도희", 20, 100);
        TravleCustomer coustomerPark = new TravleCustomer("박슬기", 13, 50);
        List<TravleCustomer> customerList = new ArrayList<>();
        customerList.add(coustomerLee);
        customerList.add(coustomerKim);
        customerList.add(coustomerPark);

        System.out.println("== 고객 명단 추가된 순서대로 출력 ==");
        customerList.stream().map(c -> c.getName()).forEach(s -> System.out.println(s));

        int total = customerList.stream().mapToInt(c -> c.getPrice()).sum();
        System.out.println("총 여행 비용은: " + total + "만 원입니다.");

        System.out.println(" == 20세 이상 고객 명단 정렬하여 출력 ==");
        customerList.stream().filter(c -> c.getAge() >= 20)
                .map(c -> c.getName()).sorted().forEach(s -> System.out.println(s));
    }
}
