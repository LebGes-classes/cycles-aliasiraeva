public class Les2p2 {
    public static void main(String[] args) {
        int sum1;
        int sum2;
        int p;
        for (int i = 100; i < 1000; i++) {
            if (i % 3 == 0) {
                p = i / 3;
                sum1 = i / 100 + (i / 10) % 10 + i % 10;
                sum2 = p / 100 + (p / 10) % 10 + p % 10;
                if (sum1 > sum2) {
                    System.out.println(i);
                }
            }
        }
    }
}
