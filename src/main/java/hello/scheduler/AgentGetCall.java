package hello.scheduler;

public class AgentGetCall implements  Scheduler{
    @Override
    public void getNextCall() {
        System.out.println("상담원이 다음 전화 요청");
    }

    @Override
    public void sendCallToAgent() {
        System.out.println("상담원이 전화 삼담을 가져갔습니다.");
    }
}
