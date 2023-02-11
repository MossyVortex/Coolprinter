import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz _".toCharArray();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text to print: ");
        String text = input.nextLine();
        text = text.toLowerCase();

        String tmpPrint = "";

        int allLettersCouter = 0;
        int correctCounter = 0;

        while (!tmpPrint.equals(text)) {

            char tmpLetter = alphabet[allLettersCouter];
            Thread.sleep(25);
            System.out.println(tmpPrint + tmpLetter);

            int compareOneTwo = Character.compare(text.charAt(correctCounter), tmpLetter);
            if (compareOneTwo == 0) {
                tmpPrint += tmpLetter;
                correctCounter += 1;
                allLettersCouter = 0;
            }
            else{
                allLettersCouter += 1;
            }

        }

        input.close();
    }
}
