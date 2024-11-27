import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.util.*;

public class Task4 {
    static int fun(int a){
        if (a == 0){
            return a;
        }
        List<Integer> list = new ArrayList<Integer>();
        int number = a;
        while(number != 0){
            list.add(number%10);
            number /= 10;
        }
        Collections.sort(list);
        list = list.reversed();
        StringBuilder result = new StringBuilder();
        for(Integer i : list){ result.append(i); }
        return Integer.parseInt(result.toString());
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the number : ");
        String number = br.readLine();
        System.out.println(fun(Integer.parseInt(number)));
    }
}