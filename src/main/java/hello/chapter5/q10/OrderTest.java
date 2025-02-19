package hello.chapter5.q10;

public class OrderTest {
    public static void main(String[] args) {
        Order order = new Order();

        order.orderId = 202407310001L;
        order.customerId = "abc123";
        order.orderDate = "2024년 7월 31일";
        order.customerName = "홍길순";
        order.producId = "PD0345-12";
        order.shippingAddressl = "서울시 영등포구 여의도동 20번지";

        System.out.println("주문번호 = " + order.orderId);
        System.out.println("주문자 아이디 = " + order.customerId);
        System.out.println("주문 날짜 = " + order.orderDate);
        System.out.println("주문자 이름 = " + order.customerName);
        System.out.println("주문 상품 번호 = " + order.producId);
        System.out.println("배송 주소 = " + order.shippingAddressl);

    }
}
