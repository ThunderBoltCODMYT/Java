import java.util.*;
public class reverse_string
{
    static String reverseString(String str){
        char[] ch = str.toCharArray();
        int start = 0;
        int end = str.length() - 1;

        while(start < end){
            char temp = ch[start];
            ch[start] = ch[end];
            ch[end] = temp;
            start++;
            end--;
        }

        return new String(ch);
    }

    static String reverseWordsAndSentences(String sentence){
        String[] words = sentence.split(" ");
        StringBuilder reversedSentence = new StringBuilder();

        for(int i = words.length - 1; i >= 0; i--){
            reversedSentence.append(reverseString(words[i])).append(" ");
        }

        return reversedSentence.toString().trim();
    }

    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a sentence: ");
        String sentence = scanner.nextLine();
        if(sentence.split(" ").length == 1){
            String reversedString = reverseString(sentence);
            System.out.println("Reversed string: " + reversedString);
        }else{
            String reversed_words_and_sentences = reverseWordsAndSentences(sentence);
            System.out.println("Reversed words and sentences: " + reversed_words_and_sentences);
        }
    }
}