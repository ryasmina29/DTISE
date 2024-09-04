package Day3;
//Count vowels
import java.util.Scanner;

public class D3E7 {
    public static void RunD3E7() {
        System.out.println("Day 3, Exercise 7");
        Scanner sc = new Scanner(System.in);
        System.out.println("Word: ");
        String word = sc.nextLine();
        int count = 0;

        for (int i = 0; i < word.length(); i++) {
            if (word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' ||
                    word.charAt(i) == 'e' || word.charAt(i) == 'o') {
                count++;
            }
        }
        System.out.println("Number of vowel character: " + count);
        }
 }

/* COBA2 1 (OK)      public static boolean isVowel(char x)
    {
        x = Character.toUpperCase(x);
        return (x == 'A' || x=='I' ||
                x == 'U' || x == 'E' || x == 'O');
    }

    public static int countVowel(String x) {
        int count = 0;
        for (int i = 0; i < x.length(); i++) {
            if (isVowel(x.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}

    COBA2 2 (only count the first vowel word)
        public static int countVowel(String x) {
        String [] vowels = {"A", "I", "U", "E", "O", "a", "i", "u", "e", "o"};
        for (int i = 0; i < x.length(); i++) {
        int count = 0;
        char ch = x.charAt(i);
            if (ch == vowels[i].charAt(0)) {
                count++;
            }
        }
        return count;
    }
}
*/
