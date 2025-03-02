package hello.collection.map.hashmap;

import hello.collection.Member;

public class MemberHashMapTest {
    public static void main(String[] args) {
        MemberHashMap memberHashMap = new MemberHashMap();

        Member memberLee = new Member(1001, "이나연");
        Member memberSon = new Member(1002, "손흥민");
        Member memberKim = new Member(1003, "김민재");
        Member memberMoon = new Member(1004, "문성경");

        memberHashMap.addMember(memberLee);
        memberHashMap.addMember(memberSon);
        memberHashMap.addMember(memberKim);
        memberHashMap.addMember(memberMoon);

        memberHashMap.showAllMembers();
        memberHashMap.removeMember(1001);
        memberHashMap.showAllMembers();
    }
}
