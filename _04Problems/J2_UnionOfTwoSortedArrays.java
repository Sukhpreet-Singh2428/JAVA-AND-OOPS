import java.util.Scanner;
import java.util.ArrayList;
public class J2_UnionOfTwoSortedArrays {
    public static ArrayList<Integer> UnionOfTwoSortedArrays(ArrayList<Integer> al1, int n1, ArrayList<Integer> al2, int n2){
        ArrayList<Integer> temp = new ArrayList<>();
        int left = 0;
        int right = 0;
        while(left<n1 && right<n2){
            if(al1.get(left) <= al2.get(right)){
                if(temp.size()==0 || temp.get(temp.size()-1) != al1.get(left)) temp.add(al1.get(left));
                left++;
            }
            else{
                if(temp.size()==0 || temp.get(temp.size()-1) != al2.get(right)) temp.add(al2.get(right));
                right++;
            }
        }
        while(left<n1){
            if(temp.get(temp.size()-1) != al1.get(left)) temp.add(al1.get(left));
            left++;
        }
        while(right<n2){
            if(temp.get(temp.size()-1) != al2.get(right)) temp.add(al2.get(right));
            right++;
        }

        return temp;
    }
    public static void main(String args[]){
        Scanner scanner = new Scanner(System.in);

        int n1 = scanner.nextInt(); 
        ArrayList<Integer> al1 = new ArrayList<>();
        for(int i=0; i<n1; i++){
            al1.add(scanner.nextInt());
        }
        int n2 = scanner.nextInt();
        ArrayList<Integer> al2 = new ArrayList<>();
        for(int i=0; i<n2; i++){
            al2.add(scanner.nextInt());
        }

        ArrayList<Integer> ans = UnionOfTwoSortedArrays(al1, n1, al2, n2);
        System.out.println(ans);
        scanner.close();
    }
}

// class Solution {
//     public int[] unionArray(int[] nums1, int[] nums2) {
//         ArrayList<Integer> temp = new ArrayList<>();
//         int n1 = nums1.length;
//         int n2 = nums2.length;
//         int left = 0;
//         int right = 0;
//         while(left<n1 && right<n2){
//             if(nums1[left] <= nums2[right]){
//                 if(temp.isEmpty() || temp.get(temp.size()-1) != nums1[left]) temp.add(nums1[left]);
//                 left++;
//             }
//             else{
//                 if(temp.isEmpty() || temp.get(temp.size()-1) != nums2[right]) temp.add(nums2[right]);
//                 right++;
//             }
//         }
//         while(left<n1){
//             if(temp.get(temp.size()-1) != nums1[left]) temp.add(nums1[left]);
//             left++;
//         }
//         while(right<n2){
//             if(temp.get(temp.size()-1) != nums2[right]) temp.add(nums2[right]);
//             right++;
//         }

//         int[] ans = new int[temp.size()];
//         for(int i=0; i<temp.size(); i++){
//             ans[i] = temp.get(i);
//         }
//         return ans;
//     }
// }