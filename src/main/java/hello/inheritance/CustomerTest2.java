package hello.inheritance;

public class CustomerTest2 {

    public static void main(String[] args) {
        VIPCustomer customerKim = new VIPCustomer(10020, "김유신", 12345);
/*        customerKim.setCustomerID(10020);
        customerKim.setCustomerName("김유신");*/
        customerKim.bounsPoint = 10000;
 //     System.out.println(customerKim.showCustomerInfo());
        System.out.println(customerKim.showVIPInfo());
    }
}
