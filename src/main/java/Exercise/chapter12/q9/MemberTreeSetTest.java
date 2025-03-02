package Exercise.chapter12.q9;

import Exercise.chapter12.q9.Member;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet= new MemberTreeSet();

        Member memberLee = new Member(1003, "이나영");
        Member memberKim = new Member(1001, "김성령");
        Member memberHa = new Member(1002, "하민철");

        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberHa);
        memberTreeSet.addMember(memberLee);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
