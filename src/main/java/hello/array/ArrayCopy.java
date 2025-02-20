package hello.array;

public class ArrayCopy {
    public static void main(String[] args) {
        int[] array1 = {10, 20, 30, 40, 50};
        int[] array2 = {1, 2, 3, 4, 5};

                // 복사할 배열, 복사할 첫 위치, 대상 배열, 붙여 넣을 첫 위치, 복사할 요소 개수
        System.arraycopy(array1, 0, array2, 1, 4);
        for (int i = 0; i < array2.length; i++) {
            System.out.println(array2[i]);
        }
        // 복사 할 대상 배열의 전체 길이가 복사할 요소 개수보다 작다면 오류가 발생함.
        // 즉 위 예제에서는 요소 4개를 복사 했지만, 만일 요소 5개를 복사한다고 코드를 수정하면 오류
    }
}
