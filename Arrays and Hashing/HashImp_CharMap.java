import java.util.Scanner;

public class HashImp_CharMap {
    public static void main(String[] args) {
        int hash[] = new int[256];
        Scanner sc = new Scanner(System.in);

        String s = sc.next(); //input string

        for (int i = 0; i < s.length(); i++){
            hash[s.charAt(i)] += 1;
        } //precomputing hash array

        int q = sc.nextInt(); //number of queries by user
        while (q!=0){
            System.out.println("Enter Value: ");
            char inp = sc.next().charAt(0);
            System.out.println(hash[inp]);
            q--;
        } //fetching
    }
}
