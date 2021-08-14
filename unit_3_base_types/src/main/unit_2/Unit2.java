
import java.util.Scanner;

public class SumNum {

    public static void sunNumInStr() {
        System.out.println("If you want to break enter STOP");
        int sum = 0;
        System.out.println("Please, enter values");
        Scanner console = new Scanner(System.in);
        String text = console.nextLine();
        String numberOnlyString = text.replaceAll("[^0-9]", "");
        if (text.equals("STOP")) {
            System.exit(0);
        } else {
            if (!numberOnlyString.equals("")) {
                int numberOnly = Integer.parseInt(numberOnlyString);
                for (int i = 0; i < numberOnlyString.length(); i++) {
                    sum = sum + numberOnly % 10;
                    numberOnly = numberOnly / 10;
                }
                System.out.println("Sum = " + sum);
            } else {
                System.out.println("There is no numbers in string");
            }
        }
    }
}
