package hello.inheritance;

public class VIPCustomer extends Customer {
    private int agentID;
    double saleRatio;

/*    public VIPCustomer() {
        customerGrade = " VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        System.out.println("VIP customer() 생성자 호출");
    }*/
    public VIPCustomer() {};

    public VIPCustomer(int customerID, String customerName, int agentID) {
        super(customerID, customerName);
        customerGrade = "VIP";
        bonusRatio = 0.05;
        saleRatio = 0.1;
        this.agentID = agentID;
        System.out.println("VIP Customer(int, String, int) 생성자 호출");

    }

    public int getAgnetID() {
        return agentID;
    }

    public String showVIPInfo() {
        return super.showCustomerInfo() + " 담당 상담원 아이디는 " + agentID + "입니다.";
    }

}
