public class Les2p1 {
    public static void main(String[] args) {
        int dx = 1;
        double y = 0;
        System.out.println("x   y");
        for (int x = -6; x <= 12; x += dx) {
            if (x <= -4) {
                y = -2;
            }
            if (x > -4 && x <= 0) {
                y = (double) x / 4;
            }
            if (x > 0 && x <= 2) {
                y = x * x;
            }
            if (x > 2) {
                y = - (double) x / 2 + 5;
            }
            System.out.println(x + " " + y);
        }
    }
}
