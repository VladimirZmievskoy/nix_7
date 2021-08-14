import java.util.*;

public class SumChar {

    public static void sumaChar() {
        System.out.println("If you want to break enter STOP");
        Scanner console = new Scanner(System.in);
        System.out.println("Please, enter your string");
        String text = console.nextLine();
        String onlyString = text.replaceAll("[^A-Za-zА-Яа-я]", "");

        if (text.equals("STOP")) {
            System.exit(0);
        } else {
            char[] charsSort = onlyString.toCharArray();
            Arrays.sort(charsSort);
            String sortString = Arrays.toString(charsSort);
            System.out.println("Sort char string: " + sortString);

            int[] counts = new int[(int) Character.MAX_VALUE];
            for (int i = 0; i < onlyString.length(); i++) {
                char charAt = onlyString.charAt(i);
                counts[(int) charAt]++;
            }
            for (int i = 0; i < counts.length; i++) {
                if (counts[i] > 0)
                    System.out.println("Number of " + (char) i + ": " + counts[i]);
            }
        }
    }
}