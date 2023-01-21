import java.util.Scanner;

public class PalindromeIntegers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String numbers = scanner.nextLine();

        while (!numbers.equals("END")) {
           if(!isPalindrome(numbers)) {
               System.out.println("false");
           }else {
               System.out.println("true");
           }
           numbers = scanner.nextLine();
        }


    }
    public static boolean isPalindrome(String number)    {
        String reversedString = "";

        for (int i = number.length() - 1; i >= 0 ; i--) {
            reversedString += number.charAt(i);
        }
        return number.equals(reversedString);
    }
}