import java.util.Scanner;
import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        inputThenPrintSumAndAverage();
    }

    private static void inputThenPrintSumAndAverage() {
        int sum = 0;
        int count = 0;
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.print("Enter a number: ");
            try {
                String line = input.nextLine();
                int num = Integer.parseInt(line);  // Possible exception throw here
                sum += num;
                // add 1 to count
            } catch(Exception e) {
                break;
            }
        }

        int average = 0;

        if (count == 0) {
            average = 0;
        } else {
            average = 0;
        }
        inputThenPrintSumAndAverage();


    }

}


