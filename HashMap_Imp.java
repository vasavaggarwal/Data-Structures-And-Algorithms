import java.util.HashMap;
import java.util.Scanner;

public class HashMap_Imp {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int arr[] = new int[size];
        for (int i = 0; i < size; i++){
            arr[i] = sc.nextInt();
        } //build array

        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < arr.length; i++){
            int key = arr[i];
            int freq = 0;
            if (hash.containsKey(key)){
                freq = hash.get(key);
            }
            freq++;
            hash.put(key,freq);
        } //make hashmap

        int q;
        q = sc.nextInt();
        while (q--!=0){
            int number = sc.nextInt();
            if (hash.containsKey(number)){
                System.out.println(hash.get(number));
            } else {
                System.out.println("O");
            }
        } //fetch
    }
}
