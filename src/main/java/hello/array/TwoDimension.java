package hello.array;

public class TwoDimension {
    /* int[][] arr = new int[2][3];
       자료형  배열이름      행 개수, 열 개수
     */
    public static void main(String[] args) {
        int[][] arr = {{1, 2, 3}, {4, 5, 6}}; // 이차원 배열 선언과 동시에 초기화

        // i는 행을, j는 열을 가르킨다.
        // 전체 배열 길이인 arr.length는 행의 개수를, 각 행의 길이 arr[i].length,는 열의 개수를 나타낸다.
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
    }

}
