import java.util.Scanner;

public class SpoonerismGenerator {

    public static int findFirstVowel(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; 
    }

    public static String createSpoonerizedWord(String word1, int vowelIndex1, String word2, int vowelIndex2) {
        String result = "";
       
        for (int i = 0; i < vowelIndex1; i++) {
            result += word1.charAt(i);
        }

        for (int i = vowelIndex2; i < word2.length(); i++) {
            result += word2.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine().toLowerCase();

        scanner.close();

        int vowelIndex1 = findFirstVowel(word1);
        int vowelIndex2 = findFirstVowel(word2);

        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
        
            System.out.println(word1 + " and " + word2 + " aare not good words to spoonerize.");        
          } else {
          
            String spoonerized1 = createSpoonerizedWord(word2, vowelIndex2, word1, vowelIndex1);
            String spoonerized2 = createSpoonerizedWord(word1, vowelIndex1, word2, vowelIndex2);

            System.out.println("Original words: " + word1 + " and " + word2);
            System.out.println( word1 + " and "+ word2 + " are "+ spoonerized1 + " " + spoonerized2);
        }
    }
}
