import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Sequence {
    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Enter the number");
        String num = reader.readLine();

        char[] arr = num.toCharArray();
        int count = 0;

        if(arr.length != 4){
            System.out.println("The number should consist of four digits!");
        }else {
            for (int i = 0; i < 3; i++) {
                if (arr[i] < arr[i + 1]) count++;
                if (arr[i] > arr[i + 1]) count--;
            }
            if(count == 3) System.out.println("increasing sequence");
                else
                     if(count == -3) System.out.println("decreasing sequence");
                         else
                             System.out.println("Not sorted");
        }
    }
}
