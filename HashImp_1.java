//Array Hash Implementation
import java.util.Scanner;

public class HashImp_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size;
        size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++){
            System.out.println("Value for element " + i + ": ");
            arr[i] = sc.nextInt();
        } //build array

        int hash[] = new int[13];
        for (int i = 0; i < arr.length; i++){
            hash[arr[i]] += 1;
        } //build hash array

        for (int i = 0; i < size; i++){
            System.out.println("Enter Element: ");
            int inp = sc.nextInt();
            System.out.println(hash[inp]);
        } //fetch
    }
}
