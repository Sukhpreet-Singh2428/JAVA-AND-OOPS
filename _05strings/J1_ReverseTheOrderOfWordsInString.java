import java.util.Scanner;
public class J1_ReverseTheOrderOfWordsInString {
    public static String ReverseTheOrderOfWords(String str){
        String[] arr = str.split(" ");
        StringBuilder s = new StringBuilder();
        for(int i=arr.length-1; i>=0; i--){
            s.append(arr[i]);
            if(i!=0){
                s.append(" ");
            }
        }
        return s.toString();
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(ReverseTheOrderOfWords(str));
        scanner.close();
    }
}
