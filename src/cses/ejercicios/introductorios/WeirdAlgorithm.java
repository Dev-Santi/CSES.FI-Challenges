import java.util.Scanner;

public class WeirdAlgorithm {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        long value = input.nextInt();
        
        System.out.print(value + " ");
        
        while(value != 1) {
            if(value % 2 == 0) {
                value /= 2;
            } else {
                value *= 3;
                value += 1;
            }
            
            System.out.print(value + " ");
        }
    }   
}
