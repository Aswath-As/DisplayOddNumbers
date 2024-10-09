public class DisplayOddNumbers {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            if (i % 2 != 0) { // check if the number is odd
                System.out.print(i + " "); // print the odd number
            }
        }
    }
}