package hello.collection.map.treemap;

import hello.collection.Member;

public class MemberTreeMapTest {
    public static void main(String[] args) {
        MemberTreeMap memberTreeMap = new MemberTreeMap();

        Member memberLee = new Member(1001, "이나연");
        Member memberSon = new Member(1002, "손흥민");
        Member memberKim = new Member(1003, "김민재");
        Member memberMoon = new Member(1004, "문성경");

        memberTreeMap.addMember(memberLee);
        memberTreeMap.addMember(memberSon);
        memberTreeMap.addMember(memberKim);
        memberTreeMap.addMember(memberMoon);

        memberTreeMap.showAllMembers();
        memberTreeMap.removeMember(1001);
        memberTreeMap.showAllMembers();
    }
}
