import java.util.*;
public class GetKPC {
   static Character[][] numberToCharMap;
   private static List<String> printWords(int[] numbers, int len, int numIndex, String s){
        if(len == numIndex){
            return new ArrayList<>(Collections.singleton(s));
        }
        List<String> stringList = new ArrayList<>();
        for(int i = 0; i < numberToCharMap[numbers[numIndex]].length; i++){
            String sCopy = String.copyValueOf(s.toCharArray());
            sCopy = sCopy.concat(numberToCharMap[numbers[numIndex]][i].toString());
            stringList.addAll(printWords(numbers, len, numIndex + 1, sCopy));          
        }
        return stringList;
   }

   private static void printWords(int[] numbers){
        generateNumberToCharMap();
        List<String> stringList = printWords(numbers, numbers.length, 0, "");
        stringList.stream().forEach(System.out::println);    
   }

   private static void generateNumberToCharMap(){
        numberToCharMap = new Character[10][5];
        numberToCharMap[0] = new Character[]{'\0'};
        numberToCharMap[1] = new Character[]{'\0'};
        numberToCharMap[2] = new Character[]{'a', 'b', 'c'};
        numberToCharMap[3] = new Character[]{'d', 'e', 'f'};
        numberToCharMap[4] = new Character[]{'g', 'h', 'i'};
        numberToCharMap[5] = new Character[]{'j', 'k', 'l'};
        numberToCharMap[6] = new Character[]{'m', 'n', 'o'};
        numberToCharMap[7] = new Character[]{'p', 'q', 'r', 's'};
        numberToCharMap[8] = new Character[]{'t', 'u', 'v'};
        numberToCharMap[4] = new Character[]{'w', 'x', 'y', 'x'};
   }

   public static void main(String[] args) {

// Create a Scanner object to read input from the user

Scanner scn = new Scanner(System.in);

// Prompt the user to input the number of digits

System.out.print("Enter the number of digits: ");

int n = scn.nextInt();

// Create an array to store the digits

int[] arr = new int[n];

// Prompt the user to input the digits

System.out.println("Enter the digits:");

for (int i = 0; i < n; i++) {

arr[i] = scn.nextInt();

}

// Function call to print all possible words

printWords(arr);

}
}