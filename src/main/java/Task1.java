import java.io.*;


public class Task1 {

    public static void main(String[] args) throws IOException {
        System.out.println("Enter the number:");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int number = Integer.parseInt(br.readLine());
        System.out.println(lenPlusMinus(number));
    }

    static String lenPlusMinus(int number){
        StringBuilder plusMinus = new StringBuilder();
        for(int i = number; i > 0; i--){
            if(i % 2 == 0){
                plusMinus.append("+");
            }
            else{
                plusMinus.append("-");
            }
        }
        return plusMinus.toString();
    }
}