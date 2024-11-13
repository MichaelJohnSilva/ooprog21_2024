import java.util.Scanner;

public class SpoonerismGenerator {

    // Method to find the first vowel index in a word
    public static int findFirstVowel(String word) {
        String vowels = "aeiou";
        for (int i = 0; i < word.length(); i++) {
            if (vowels.indexOf(word.charAt(i)) != -1) {
                return i;
            }
        }
        return -1; // No vowel found
    }

    // Method to create a spoonerized word
    public static String createSpoonerizedWord(String word1, int vowelIndex1, String word2, int vowelIndex2) {
        String result = "";

        // Add consonants from word1
        for (int i = 0; i < vowelIndex1; i++) {
            result += word1.charAt(i);
        }

        // Add vowels and remaining characters from word2
        for (int i = vowelIndex2; i < word2.length(); i++) {
            result += word2.charAt(i);
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Get two words from the user
        System.out.print("Enter the first word: ");
        String word1 = scanner.nextLine().toLowerCase();

        System.out.print("Enter the second word: ");
        String word2 = scanner.nextLine().toLowerCase();

        scanner.close();

        // Find the first vowel index in both words
        int vowelIndex1 = findFirstVowel(word1);
        int vowelIndex2 = findFirstVowel(word2);

        // Check if spoonerism is possible
        if (vowelIndex1 <= 0 || vowelIndex2 <= 0) {
            System.out.println(word1 + " and " + word2 + " aare not good words to spoonerize.");        
          } else {
            // Create spoonerized words
            String spoonerized1 = createSpoonerizedWord(word2, vowelIndex2, word1, vowelIndex1);
            String spoonerized2 = createSpoonerizedWord(word1, vowelIndex1, word2, vowelIndex2);

            // Display results
            System.out.println("Original words: " + word1 + " and " + word2);
            System.out.println( word1 + " and "+ word2 + " are "+ spoonerized1 + " " + spoonerized2);
        }
    }
}
