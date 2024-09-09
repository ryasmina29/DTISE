package Module1.Day4;

import java.util.Scanner;

public class D4E5 {
    public static void RunD4E5() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Insert word: ");
        String word = sc.nextLine();

        System.out.print("Reversed case: "+reverseCase(word));
    }
    public static String reverseCase (String word) {
        char[] charArray = word.toCharArray();
        for (int i = 0; i < charArray.length; i++) {
            char ch = charArray[i];
            if (Character.isUpperCase(ch)) {
                charArray[i] = Character.toLowerCase(ch);
            }
            else if (Character.isLowerCase(ch)) {
                charArray[i] = Character.toUpperCase(ch);
            }
        }
        return new String(charArray);
    }
}

