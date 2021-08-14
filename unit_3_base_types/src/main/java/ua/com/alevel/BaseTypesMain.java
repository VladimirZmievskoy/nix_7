import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("If you want to calculate sum numbers in string enter 1");
        System.out.println("If you want to calculate char in string enter 2");
        System.out.println("If you want to calculate lesson time enter 3");
        Scanner console = new Scanner(System.in);
        int index = Integer.parseInt(console.nextLine());
        while (index == 1 || index == 2 || index == 3  ) {
            if (index == 1) {
                SumNum.sunNumInStr();
            } else if (index == 2) {
                SumChar.sumaChar();
            } else if (index == 3) {
                LessonTime.lessonTime();
            }
        }
    }
}