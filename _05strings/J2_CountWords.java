import java.util.Scanner;
public class J2_CountWords {
    public static int CountWords(String str){
        if(str == null || str.trim().isEmpty()){
            return 0;
        }
        String[] arr = str.trim().split("\\s+");
        return arr.length;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        System.out.println(CountWords(str));
        scanner.close();
    }
}
