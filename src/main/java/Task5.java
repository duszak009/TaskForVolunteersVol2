import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Task5 {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter the String");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String input =br.readLine();
        System.out.println(repFirstChar(input));
    }

    public static String repFirstChar(String s) {
        char c = s.charAt(0);
        if (c >= 'A' && c <= 'Z') {
            return "upper";
        }else if (c >= 'a' && c <= 'z') {
            return "lower";
        } else if (c >= '0' && c <= '9') {
            return "digit";
        }else {
            return "other";
        }
    }
}
