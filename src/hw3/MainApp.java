package hw3;

public class MainApp {
    public static void main(String[] args) {
        replase();
        arr100();
        request();
        diagonal(12);
        nurs(10, 2);
    }

    public static void replase() {
        int[] arr = new int[]{1, 0, 1, 0, 0, 1, 1, 0};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) {
                arr[i] = 1;
            } else {
                arr[i] = 0;
            }
        }
    }

    public static void arr100() {
        int[] arr = new int[100];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
        }
    }

    public static void request() {
        int[] arr = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] *= 2;
            }
        }
    }

    public static void diagonal(int n) {
        int[][] arr = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if (i == j|| i + j == n - 1) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]+"  ");
            }
            System.out.println();
        }
    }
    public static int[] nurs(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
        return arr;
    }

}
