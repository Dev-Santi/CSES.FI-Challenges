
import java.util.Scanner;

public class RepetitionsDNA {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        char[] chain = input.nextLine().toCharArray();
        
        int max = 1;
        int currentCount = 0;
        char lastChar = chain[0];
        
        for (char currentChar:chain) {
            if(currentChar == lastChar) {
                currentCount++;
                if(currentCount > max) {
                    max = currentCount;
                }
            } else {
                currentCount = 1;
                lastChar = currentChar;
            }
        }
        
        System.out.print(max);
    }
}
