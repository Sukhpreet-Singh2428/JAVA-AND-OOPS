import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class J4_TwoSum {
    public static int[] TwoSum(int[] arr, int target){
        int n = arr.length;

        Map<Integer, Integer> mp = new HashMap<>();
        for(int i=0; i<n; i++){
            mp.put(arr[i], i);
        }

        int[] ans = {-1, -1};
        for(int i=0; i<n; i++){
            int x = target - arr[i]; 
            if(mp.containsKey(x)){
                ans[0] = mp.get(x);
                ans[1] = i;
            }
        }

        return ans;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        int target = scanner.nextInt(); 
        int [] ans = TwoSum(arr, target);
        for(int i=0; i<ans.length; i++){
            System.out.print(ans[i] + " ");
        }
        scanner.close();
    }
}
