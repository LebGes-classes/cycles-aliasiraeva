import java.util.Scanner;

public class Les4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        String mainstr;
        System.out.println("Введите любую строку: ");
        mainstr = scan.nextLine();
        String reverseStr = strRev(mainstr);
        System.out.println(reverseStr);
    }

    public static String strRev(String mainstr) {
        char[] arr = mainstr.toCharArray();
        String newChar = "";
        for (int i = arr.length - 1; i >= 0; i--) {
            newChar = newChar + arr[i];
        }
        return newChar;
    }
}
