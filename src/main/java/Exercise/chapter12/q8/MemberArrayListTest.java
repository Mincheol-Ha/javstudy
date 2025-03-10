package exercise.chapter12.q8;

import hello.collection.Member;

public class MemberArrayListTest {
    public static void main(String[] args) {
        MemberArrayList memberArrayList = new MemberArrayList();

        Member memberLee = new Member(1001, "이나영");
        Member memberSon = new Member(1002, "손흥민");
        Member memberPark = new Member(1003, "박진주");
        Member memberKim = new Member(1004, "김도희");

        memberArrayList.addMember(memberLee);
        memberArrayList.addMember(memberSon);
        memberArrayList.addMember(memberPark);
        memberArrayList.addMember(memberKim);

        memberArrayList.showAllMember();

        memberArrayList.removeMember(memberPark.getMemberId());
        memberArrayList.showAllMember();

        memberArrayList.insertMember(memberKim, 3);
        memberArrayList.showAllMember();
    }

}
