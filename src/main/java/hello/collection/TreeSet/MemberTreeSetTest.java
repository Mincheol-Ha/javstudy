package hello.collection.TreeSet;

import hello.collection.Member;
import hello.collection.hashset.MemberHashSet;

public class MemberTreeSetTest {
    public static void main(String[] args) {
        MemberTreeSet memberTreeSet= new MemberTreeSet();

        Member memberLee = new Member(1001, "이나영");
        Member memberKim = new Member(1002, "김성령");
        Member memberHa = new Member(1003, "하민철");

        memberTreeSet.addMember(memberLee);
        memberTreeSet.addMember(memberKim);
        memberTreeSet.addMember(memberHa);
        memberTreeSet.showAllMember();

        Member memberHong = new Member(1003, "홍길동");
        memberTreeSet.addMember(memberHong);
        memberTreeSet.showAllMember();
    }
}
