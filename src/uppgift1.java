import java.util.Arrays;
import java.util.Scanner;
public class uppgift1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        int userArray [] = new int [6];
        for (int i =  userArray.length -1; i > 0; i--) {
            userArray[i-1] = sc.nextInt();
        }
        System.out.println(Arrays.toString(userArray));
    }

}
