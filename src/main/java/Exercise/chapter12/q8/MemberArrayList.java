package exercise.chapter12.q8;

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

    public void insertMember(Member member, int position) {
        if(position < 0 || position > arrayList.size()+1) {
            System.out.println("지정된 자리에 추가할 수 없습니다.");
            return;
        }
        arrayList.add(position-1, member);
    }

    public boolean removeMember(int memberId) {

        for(int i = 0; i < arrayList.size(); i++) {
            Member member = arrayList.get(i);
            int tempId = member.getMemberId();
            if(tempId == memberId) {
                arrayList.remove(i);
                return true;
            }
        }

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
