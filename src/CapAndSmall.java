import java.util.Random;
import java.util.Scanner;

public class CapAndSmall {
    public static void main(String[] args) throws Exception {
        char[] alphabet = "abcdefghijklmnopqrstuvwxyz _!#$%^&*()~-+=|?ABCDEFGHIJKLMNOPQRSTUVWXYZ".toCharArray();

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the text to print: ");
        String text = input.nextLine();
        // String textBackup = text;
        // text = text.toLowerCase();

        String tmpPrint = "";

        int allLettersCouter = 0;
        int correctCounter = 0;

        while (!tmpPrint.equals(text)) {

            char tmpLetter = alphabet[allLettersCouter];
            String tmpRandom = "";
            
            Random randomizer = new Random();

            Thread.sleep(10);

            for(int i=0; i < text.length()-(1+correctCounter); i++){
                tmpRandom += alphabet[randomizer.nextInt(alphabet.length)];
            }
            System.out.println(tmpPrint + tmpLetter + tmpRandom);

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

        // System.out.println(textBackup);

        input.close();
    }
}
