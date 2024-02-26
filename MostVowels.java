// PROBLEM 6: MostVowels.java
public class MostVowels {
    public static String findStringWithMostVowels(String[] strings) {
        String result = "";
        int maxVowels = 0;
        for (String str : strings) {
            int vowelsCount = countVowels(str);
            if (vowelsCount > maxVowels) {
                maxVowels = vowelsCount;
                result = str;
            }
        }
        return result;
    }

    private static int countVowels(String str) {
        int count = 0;
        String vowels = "aeiouAEIOU";
        for (char c : str.toCharArray()) {
            if (vowels.indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] strings = {"Sunshine", "Umbrella", "Major", "Resourceful"};
        System.out.println(findStringWithMostVowels(strings)); // Output: Resourceful
    }
}
