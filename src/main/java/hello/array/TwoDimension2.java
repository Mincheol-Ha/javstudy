package hello.array;

public class TwoDimension2 {
    public static void main(String[] args) {
        int[][] arr = new int[2][3];

        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                System.out.println(arr[i][j]);
            }
            System.out.println();
        }
        System.out.println(arr.length);
        System.out.println(arr[0].length);
    }
}

// 출력 결과 000 -> 1열~1행 3열, 000 ->2행 1열~2행 3열, 2 -> 행 길이, 3 -> 열 길이
// 이차원 배열을 선언만 하고 초기화를 따로 하지 않았음.