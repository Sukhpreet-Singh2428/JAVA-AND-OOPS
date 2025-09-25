import java.util.Scanner;
public class J3_MaximumConsecutiveOnes {
    public int MaximumConsecutiveOnes(int[] arr){
        int n = arr.length;
        int maxi = 0;
        int cnt = 0;
        for(int i=0; i<n; i++){
            if(arr[i] == 0){
                cnt = 0;
            }
            else{
                cnt++;
                maxi = Math.max(maxi, cnt);
            }
        }
        return maxi;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n = scanner.nextInt();
        int [] arr = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = scanner.nextInt();
        }
        J3_MaximumConsecutiveOnes sol = new J3_MaximumConsecutiveOnes();
        int ans = sol.MaximumConsecutiveOnes(arr);
        System.out.println(ans);
        
        scanner.close();
    }
}
