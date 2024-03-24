import java.util.Scanner;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class IncreasingArray {
    public static void main(String[] args) {
        try {
            BufferedReader input = new BufferedReader(new InputStreamReader(System.in));
        
            int n = Integer.parseInt(input.readLine());
            String[] numbers = input.readLine().split(" ");
            
            long lastNumber = 0;
            long moves = 0;

            for (int i = 0; i < numbers.length; i++) {
                long currentNumber = Long.parseLong(numbers[i]);

                if(lastNumber > currentNumber) {
                    moves += lastNumber - currentNumber;
                } else {
                    lastNumber = currentNumber;
                }
            }
        
            System.out.println(moves);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        }
    }
}
