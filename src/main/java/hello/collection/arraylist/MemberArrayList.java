package hello.collection.arraylist;

import hello.collection.Member;

import java.util.ArrayList;
import java.util.Iterator;

public class MemberArrayList {
    private ArrayList<Member> arrayList;

    public MemberArrayList() {
        arrayList = new ArrayList<Member>();
    }

    public void addMember(Member member) {  // 회원을 추가하는 메서드
        arrayList.add(member);
    }

    public boolean removeMember(int memberId) {
        Iterator<Member> ir = arrayList.iterator();  // iterator 반환
        while (ir.hasNext()) {                          // 요소가 있는 동안
            Member member = ir.next();                  // 다음 회원을 반환 받음
            int tempId = member.getMemberId();
            if  (tempId == memberId) {
                arrayList.remove(member);
                return true;
            }
        }
        // 끝날 때까지 삭제하려는 값을 찾지 못한 경우
        System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }

    public void showAllMember() {
        for (Member member : arrayList) {
            System.out.println(member);
        }
        System.out.println();
    }
}
