import java.util.Random;

public class Les3p2 {
    public static void main(String[] args) {
        int n = 15;
        int[][] matrix = new int[n][n];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                matrix[i][j] = new Random().nextInt(100);
            }
        }
        int globalMaxSeq = 0;
        int strNum = 0;
        for (int i = 0; i < n; i++) {
            int maxSeq = 0;
            int seq = 0;
            for (int j = 1; j < n; j++) {
                if (matrix[i][j] > matrix[i][j - 1]) {
                    seq++;
                } else {
                    if (seq > maxSeq) {
                        maxSeq = seq;
                    }
                    seq = 0;
                }
            }
            if (maxSeq > globalMaxSeq) {
                globalMaxSeq = maxSeq;
                strNum = i + 1;
            }
        }
        System.out.println("Номер строки: " + strNum);
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
        int a;
        for (int i = 0; i < n; i++) {
            a = matrix[i][0];
            matrix[i][0] = matrix[i][1];
            matrix[i][1] = a;
        }
        System.out.println();
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print(matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
}
