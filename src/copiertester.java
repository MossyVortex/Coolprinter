public class copiertester {
    public static void main(String[] args) {

        char firstValue = 'A';
        char secondValue = 'A';

        int compareOneTwo = Character.compare(firstValue, secondValue);
        if (compareOneTwo > 0) {
            System.out.println("inside " + compareOneTwo);
        }
        else{
            System.out.println("outside " + compareOneTwo);
        }
    }
}
