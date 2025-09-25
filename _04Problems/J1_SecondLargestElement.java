import java.util.ArrayList;
import java.util.Scanner;
public class J1_SecondLargestElement{
    // public static int SecondLargest(int[] arr){
    //     int n = arr.length;
    //     int max = Integer.MIN_VALUE;
    //     int smax = Integer.MIN_VALUE;
    //     for(int i=0; i<n; i++){
    //         if(arr[i] > max){
    //             smax = max;
    //             max = arr[i];
    //         }
    //         else if(arr[i] > smax && arr[i] != max){
    //             smax = arr[i];
    //         }
    //     }
    //     return smax;
    // }

    public int SecondLargest(ArrayList<Integer> al){
        int n = al.size();
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;
        for(int i=0; i<n; i++){
            if(al.get(i) > max){
                smax = max;
                max = al.get(i);
            }
            else if(al.get(i) > smax && al.get(i) != max){
                smax = al.get(i);
            }
        }
        return smax;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();

        //! array : 
        // int[] arr = new int[n];
        // for(int i=0; i<n; i++){
        //     arr[i] = scanner.nextInt();
        // }
        // System.out.println(SecondLargest(arr));

        //! ArrayList : 
        ArrayList<Integer> al = new ArrayList<>();
        for(int i=0; i<n; i++){
            al.add(scanner.nextInt());
        }
        // System.out.println(SecondLargest(al));    //* This one when the static keyword is in method SecondLargest
        J1_SecondLargestElement sol = new J1_SecondLargestElement();
        int ans = sol.SecondLargest(al);
        System.out.println(ans);
        scanner.close();
    }
}