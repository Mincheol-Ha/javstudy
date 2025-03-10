package exercise.chapter6.q6;

public class Card {
    /*카드 회사에서 카드를 발급할 때마다 카드 고유 번호를 부여해 줍니다. 카드가 생성될 때마다 카드 번호가
    * 자동으로 1씩 증가할 수 있도록 카드 클래스를 만들어 프로그래밍 해보세요.*/

     private int cardNumber;
     private static int serialNum = 10000;

     Card() {
         serialNum++;
         cardNumber = serialNum;
     }

    public int getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(int cardNumber) {
        this.cardNumber = cardNumber;
    }
}