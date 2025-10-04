import java.util.Scanner;
// import java.util.StringTokenizer;
import java.util.Arrays;

class string{
    public static void main(String[] args){

        //* Creating Strings:  (Immutable Property)

        //? string literals
        // String s = "Sukhpreet";
        // System.out.println(s);

        //? using the constructor
        // String s1 = new String("Sukhpreet");
        // System.out.println(s1);

        //* User Input 
        // Scanner scanner = new Scanner(System.in);
        // String s = scanner.next();  //? Takes only single word before space
        // String s = scanner.nextLine();  //? Takes full sentence as input 
        // System.out.println(s);
        // scanner.close();


        //* Methods of String Class
        // Scanner scanner = new Scanner(System.in);
        // String s = scanner.nextLine();
        // System.out.println(s);
        // System.out.println(s.length());   //? length
        // System.out.println(s.charAt(5));  //? CharAt
        // String sub = s.substring(4, 8);  //? substring(beginIndex, endIndex)   { [beginIndex, endIndex) }
        // System.out.println(sub);
        // System.out.println(s.concat(sub));  //? concat
        // System.out.println(s.equals(sub));  //? equals
        // System.out.println(s.toLowerCase());  //? toLowerCase
        // System.out.println(s.toUpperCase());  //? toUpperCase
        // System.out.println(s.trim());   //? trim  --> removes leading/trailing whitespace
        // scanner.close();


        //* StringBuffer and StringBuilder
        //? Both classes provide mutable string objects that support modification without creating 
        //? new objects, useful when performing many string operations.
        //? StringBuffer is thread-safe (synchronized) but slower.
        //? StringBuilder is not thread-safe but faster, recommended for single-threaded environments.
        //! When a method needs to return a String, but StringBuilder/StringBuffer was used for construction 
        //! or modification, conversion to String is required before returning. ( .toString() )

        // StringBuffer str = new StringBuffer("Sukhpreet");   //* This is an object of StringBuffer not a String
        // str.append(" Singh");  //? append
        // System.out.println(str);
        // str.insert(7, 'a');  //? insert(index, value)
        // System.out.println(str);
        // str.delete(2, 4);   //? delete(startIndex, endIndex)    [startIndex, endIndex)
        // System.out.println(str);
        // str.replace(0, 5, "luffy");   //? replace(startIndex, endIndex, str)   [startIndex, endIndex)
        // System.out.println(str);
        // str.reverse();
        // System.out.println(str);    //? reverse
        // System.out.println(str.toString());   //? String 

        // StringBuilder str = new StringBuilder("Sukhpreet");   //* This is an object of StringBuilder not a String
        // //? same methods as above 
        // System.out.println(str.toString());
        

        //* StringTokenizer Class
        // StringTokenizer st = new StringTokenizer("a,b,c", ",");
        // while (st.hasMoreTokens()) {
        //     System.out.println(st.nextToken());
        // }
        //? Preferred modern alternative is String.split()


        //* String.split()
        Scanner scanner = new Scanner(System.in);
        String str = scanner.nextLine();
        String[] arr = str.split(" ");
        System.out.println(Arrays.toString(arr));
        scanner.close();

    }
}