package lab;

public class StringUtils {

    public static int countVowels(String text) {

        if(text == null) throw new IllegalArgumentException();

        int countVowels = 0;

        String vowels = "aeiou";

        text = text.toLowerCase();

        for (int i = 0; i < text.length(); i++)

            for(int j = 0;j < vowels.length();j++)

                if(text.charAt(i)==vowels.charAt(j)) countVowels++;
        return countVowels;

            

         }            

        

    }
