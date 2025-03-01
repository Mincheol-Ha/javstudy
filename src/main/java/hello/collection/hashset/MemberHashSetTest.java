package hello.collection.hashset;

import hello.collection.Member;

public class MemberHashSetTest {
    public static void main(String[] args) {
        MemberHashSet memberHashSet = new MemberHashSet();

        Member memberLee = new Member(1001, "이나영");
        Member memberKim = new Member(1002, "김건우");
        Member memberHa = new Member(1003, "하민철");

        memberHashSet.addMember(memberLee);
        memberHashSet.addMember(memberKim);
        memberHashSet.addMember(memberHa);
        memberHashSet.showAllMember();

        Member memberHong = new Member(1003, "홀길동");
        memberHashSet.addMember(memberHong);
        memberHashSet.showAllMember();
    }
}
