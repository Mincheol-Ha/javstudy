package algorithm;

/**
 * 여러 개의 수가 배결에 있을 때 그 중 가장 큰 값과 작은 값을 찾는다
 * 배열의 몊 번째에 있는지 순서를 찾는다.
 * 반복문을 한번만 하용하여 문제를 해결한다.
 * 수의 예 : [10, 55, 23,2, 79, 101, 16, 82, 30, 45] */

public class MinMaxProblem {
    public static void main(String[] args) {

        int[] numbers = {10, 55, 23, 2, 79, 101, 16, 82, 30, 45};

        int min = numbers[0];
        int max = numbers[0];

        int minPos = 0;
        int maxPos = 0;

        for(int i = 1; i < numbers.length; i++) {
            if(numbers[i] < min) {
                min = numbers[i];
                minPos = i;
            }
            if(numbers[i] > max) {
                max = numbers[i];
            }
        }

        System.out.println("가장 큰 값은 " + max + "이고, 위치는 " + maxPos + "번쨰 입니다.");
        System.out.println("가장 작은 값은 " + min + "이고, 위치는 " + minPos + "번쨰 입니다.");
    }
}
