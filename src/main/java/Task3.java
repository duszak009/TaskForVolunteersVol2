import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class Task3 {
    static int[] makeAnArray(int n) {
        if (n == 1){
            return new int[]{1};
        }
        int[] arr = new int[n];
        for( int i = 1; i <= n-1; i+=2 ){
            arr[i-1]=i;
            arr[i]=-i;
        }
        if (n%2==1){
            arr[n-1]=0;
        }
        return arr;
    }
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a len of array");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());

        System.out.println(Arrays.toString(makeAnArray(number)));

    }
}
