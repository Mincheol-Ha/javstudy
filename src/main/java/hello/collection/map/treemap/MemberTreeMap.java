package hello.collection.map.treemap;

import hello.collection.Member;

import java.util.HashMap;
import java.util.Iterator;
import java.util.TreeMap;

public class MemberTreeMap {
    private TreeMap<Integer, Member> treeMap;

    public MemberTreeMap() {
        treeMap = new TreeMap<Integer, Member>();

    }
    public void addMember(Member member) {

        treeMap.put(member.getMemberId(), member);
        }

        public boolean removeMember(int memberId) {
        if (treeMap.containsKey(memberId)) {
            treeMap.remove(memberId);
            return true;
        }
            System.out.println(memberId + "가 존재하지 않습니다.");
        return false;
    }
    public void showAllMembers() {
        Iterator<Integer> ir = treeMap.keySet().iterator();
        while (ir.hasNext()) {
            int key = ir.next();
            Member member = treeMap.get(key);
            System.out.println(member);
        }
        System.out.println();
    }
}
