
import java.util.HashSet;
import java.util.Scanner;

public class MissingNumber {
    
    //La clave de este fue utilizar hashSet en vez de un array
    //Para optimizarlo mejor se puede utilizar bufferedReader
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int n = input.nextInt();
        HashSet<Integer> numbersSet = new HashSet<>();
        
        for (int i = 0; i < n - 1; i++) {
            numbersSet.add(input.nextInt());
        }

        for (int i = 1; i <= n; i++) {
            if (!numbersSet.contains(i)) {
                System.out.println(i);
            }
        }
    }
}
