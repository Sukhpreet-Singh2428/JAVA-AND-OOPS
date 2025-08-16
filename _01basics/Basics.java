package _01basics;

// import java.util.Scanner;
class Basics{
    public static void main(String[] args){
        //! the following line prints hello
        // System.out.println("Hello!");

        //! data types : 

        //* byte : 
        //? -128 to 127
        //? 8 bits
        // byte num = 109;
        // System.out.println(num);

        // * short
        //? -32,768 to 32,767
        //? 16 bits
        // short num = 109;
        // System.out.println(num);

        // * int
        //? -2^31 to 2^31 - 1
        //? 32 bits
        // int num = 1000;
        // System.out.println(num);

        // * long 
        //? -2^63 to 2^63 - 1
        //? 64 bits
        // long num = 1000L;
        // System.out.println(num);

        // * float 
        //? (6-7 decimal digits of precision)
        //? 32 bits
        // float num = 5.6f;
        // System.out.println(num);

        // * double
        //? (15 decimal digits of precision)
        //? 64 bits
        // double num = 5.6;
        // System.out.println(num);

        // * Char
        // char ch = 'a';
        // System.out.println(ch);

        //* boolean
        // boolean f = true;
        // System.out.println(f);


        //! Operators

        //? Arthmatic operators :
        // * + , - , / , * , %
        // int num1 = 5;
        // int num2 = 12;
        // int num3 = num1 + num2;
        // System.out.println(num3);

        // int num1 = 5;
        // int num2 = 12;
        // int num3 = num2/num1;
        // System.out.println(num3);

        // double num1 = 5;
        // double num2 = 12;
        // double num3 = num2/num1;
        // System.out.println(num3);

        // int num1 = 5;
        // int num2 = 12;
        // int num3 = num2*num1;
        // System.out.println(num3);

        // int num1 = 5;
        // int num2 = 12;
        // int num3 = num2%num1;
        // System.out.println(num3);

        //? Unary Operators
        // * +, -, ++, --, !

        //! +, -
        //! +num --> +1 * num
        //! -num --> -1 * num
        // int num1 = 6;
        // int num2 = +num1;   //* --> 6 
        // System.out.println(num2);

        // int num1 = 6;
        // int num2 = -num1;   //* --> -6 
        // System.out.println(num2);

        // int num1 = -6;
        // int num2 = +num1;   //* --> -6 
        // System.out.println(num2);

        // int num1 = -6;
        // int num2 = -num1;   //* --> 6 
        // System.out.println(num2);

        //? !
        // boolean fl1 = true;
        // boolean fl2 = !fl1;    //* --> false
        // System.out.println(fl2);  

        // boolean fl1 = true;
        // boolean fl2 = !!fl1;    //* --> true
        // System.out.println(fl2); 

        //! ++
        //? ++ --> ++num (pre-increment) or num++ (post-increment)
        // int num1 = 6;
        // int num2 = num1++;
        // System.out.println("num1: " +num1);  //* --> 7
        // System.out.println("num2: " +num2);  //* --> 6

        // int num1 = 6;
        // int num2 = ++num1;
        // System.out.println("num1: " +num1);  //* --> 7
        // System.out.println("num2: " +num2);  //* --> 7

        //! --
        //? -- --> --num (pre-decrement) or num-- (post-decrement)
        // int num1 = 6;
        // int num2 = num1--;
        // System.out.println("num1: " +num1);  //* --> 5
        // System.out.println("num2: " +num2);  //* --> 6

        // int num1 = 6;
        // int num2 = --num1;
        // System.out.println("num1: " +num1);  //* --> 5
        // System.out.println("num2: " +num2);  //* --> 5


        //? Relational operators
        //* ==, !=, >, <, >=, <=
        // int num1 = 6;
        // int num2 = 7;
        // boolean result = num1==num2;
        // System.out.println("result: " +result);  //* --> false

        // int num1 = 6;
        // int num2 = 7;
        // boolean result = num1!=num2;
        // System.out.println("result: " +result);  //* --> true

        // int num1 = 6;
        // int num2 = 7;
        // boolean result = num1<num2;
        // System.out.println("result: " +result);  //* --> true

        // int num1 = 6;
        // int num2 = 7;
        // boolean result = num1>num2;
        // System.out.println("result: " +result);  //* --> false

        // int num1 = 6;
        // int num2 = 7;
        // boolean result = num1<=num2;
        // System.out.println("result: " +result);  //* --> true

        // int num1 = 6;
        // int num2 = 7;
        // boolean result = num1>=num2;
        // System.out.println("result: " +result);  //* --> false


        //? Logical Operators
        //* &&, ||
        // boolean first = true;
        // boolean second = false;
        // boolean result = first && second; 
        // System.out.println("result: " +result); //* --> false

        // boolean first = true;
        // boolean second = false;
        // boolean result = first || second; 
        // System.out.println("result: " +result); //* --> true


        //? Assignment operators
        //* +=, -=, *=, /=, %=
        // int num1 = 7;
        // int num2 = 8;
        // int result = 9;
        // result += num1 + num2;
        // System.out.println("result: " +result);


        //? Ternary Operators
        //* condition ? first(true) : second(false)
        // int num1 = 6;
        // int num2 = 9;
        // int num3 = num1 > num2 ? num1 : num2;
        // System.out.println(num3);


        //! String
        // String name = "Sukhpreet Singh";
        // System.out.println(name + " has length " + name.length());
        // //? charAt
        // System.out.println(name.charAt(0));
        // //? substring
        // System.out.println(name.substring(0,9)); //? [0, 9)

        //? String concatenation
        // String name = "Sukhpreet";
        // String lastName = "Singh";
        // String fullName = name + " " + lastName;
        // System.out.println(fullName);
        // name += " " + lastName;
        // System.out.println(name);
        //? In Java, strings are immutable
        //? When we modify a string (like using += or +), 
        //? it creates a new String object instead of changing the original one
        //* The name variable is no longer referring to the original "Sukhpreet" string. 
        //* It's now pointing to a new string object that holds "Sukhpreet Singh".

        //? equals
        // String name = "Sukhpreet";
        // String lastName = "Singh";
        // boolean result = name==lastName;
        // boolean result = name.equals(lastName);
        // System.out.println(result);
        //* '==' checks reference equality (whether both point to the same object in memory)
        //* 'equals()' checks value equality (whether contents are the same)



        //! INPUT 
        //? Scanner scanner = new Scanner(System.in)
        //? 
        //? Scanner.close();

        // Scanner scanner = new Scanner(System.in);

        //? int 
        // int num = scanner.nextInt();
        // System.out.println("num: " +num);

        //? double 
        // double num = scanner.nextDouble();
        // System.out.println("num: " +num);

        //? String
        // String Name = scanner.nextLine();
        // System.out.println(Name);
        // String firstName = scanner.next();
        // String lastName = scanner.next();
        // System.out.println(firstName + " " + lastName);

        // scanner.close();

        
        //! Type Casting
        //* implict
        // int x = 10;
        // double y = x;
        // System.out.println(y);   //? int converted into double
        //* explict
        // double x = 10.7;
        // int y = (int) x;
        // System.out.println(y);


        //! Constants - final keyword
        // final int num = 10;
        // num += 15;  //? can't not be changed
        // System.out.println(num);


        //! Arrays
        // int[] arr = new int[5];
        // arr[0] = 1;
        // arr[1] = 6;
        // arr[2] = 7;
        // arr[3] = 9;
        // arr[4] = 1;
        // System.out.println(arr[4]);
        // System.out.println(arr.length);  //? arr length

        //? array input
        // Scanner scanner = new Scanner(System.in);

        // int size = scanner.nextInt(); 
        // int[] arr = new int[size];
        // for(int i=0; i<size; i++){
        //     arr[i] = scanner.nextInt();
        // }
        // for(int i=0; i<size; i++){
        //     System.out.print(arr[i] + " ");
        // }
        // for(int num: arr){   //? for each loop
        //     System.out.print(num + " ");
        // }
        // scanner.close();

        //* 2D array
        // int[][] arr = {{6, 5}, {7, 8}, {7,4,3}, {8}};
        // int[] zeroIndex = arr[0];  //? {6,5}
        // System.out.println(zeroIndex[1]);
        // System.out.println(arr[0][1]);


        //! Conditional Statements :
        //? (1) Given an age, print "adult" if age >= 18, or print "Teen"
        // Scanner scanner = new Scanner(System.in);

        // int age = scanner.nextInt();
        // if(age >= 18){
        //     System.out.println("Adult");
        // } else{
        //     System.out.println("Teen");
        // }

        // scanner.close();

        //? (2) Given the marks of a student, tell us the grade he is getting following the below rules
        //? Grade A (>=90)
        //? Grade B (>= 70 and <90)
        //? Grade C (>= 50 and <70)
        //? Grade D (>= 35 and <50)
        //? Fail (< 35)

        // Scanner scanner = new Scanner(System.in);

        // int marks = scanner.nextInt();
        // if(marks<35){
        //     System.out.println("Fail");
        // }
        // else if(marks<50){
        //     System.out.println("Grade D");
        // }
        // else if(marks<70){
        //     System.out.println("Grade C");
        // }
        // else if(marks<90){
        //     System.out.println("Grade B");
        // }
        // else{
        //     System.out.println("Grade A");
        // }

        // scanner.close();

        //? (3) You aee given three integers a,b, and c. print which of these integers is the largest.
        //?     If two or more integers are equals and are the largest, the program should indicate that as well.
        // Scanner scanner = new Scanner(System.in);

        // int num1 = scanner.nextInt();
        // int num2 = scanner.nextInt();
        // int num3 = scanner.nextInt();
        // if(num1 > num2 && num1 > num3){
        //     System.out.println("num1 is the greatest " +num1);
        // }
        // else if(num2>num1 && num2>num3){
        //     System.out.println("num2 is the greatest " +num2);
        // }
        // else if(num3>num2 && num3>num1){
        //     System.out.println("num3 is the greatest " +num3);
        // }
        // else{
        //     System.out.println("No one is greatest");
        // }

        // scanner.close();

        //* Switch Case
        //? (4) Given the day number print which day it is of the week, assume week starts from Monday and ends on Sunday
        // Scanner scanner = new Scanner(System.in);

        // int dayNumber = scanner.nextInt();
        // switch(dayNumber){
        //     case 1:
        //         System.out.println("Monday");
        //         break;
        //     case 2:
        //         System.out.println("Tuesday");
        //         break;
        //     case 3:
        //         System.out.println("Webnesday");
        //         break;
        //     case 4:
        //         System.out.println("Thursday");
        //         break;
        //     case 5:
        //         System.out.println("Friday");
        //         break;
        //     case 6:
        //         System.out.println("Saturday");
        //         break;
        //     case 7:
        //         System.out.println("Sunday");
        //         break;
        //     default:
        //         System.out.println("Enter b/w 1-7");
        // }

        // scanner.close();


        //! Loops - for loops, while loops, do while loops

        //? for loop
        // for(int i=1; i<=5; i++){
        //     System.out.println("My name is Sukhpreet Singh");
        // }
        // for(int i=2 ; i<=50; i = i + 2){
        //     System.out.println(i);
        // }

        // Scanner scanner = new Scanner(System.in);

        // int size = scanner.nextInt(); 
        // int[] arr = new int[size];
        // for(int i=0; i<size; i++){
        //     arr[i] = scanner.nextInt();
        // }
        // int sum = 0;
        // for(int i=0; i<size; i++){
        //     sum = sum + arr[i];
        // }
        // System.out.println(sum);

        // scanner.close();

        //? while loop
        // int i = 2;
        // while(i<=10){
        //     System.out.println(i);
        //     i = i+2;
        // }

        //? do while loop
        // Scanner scanner = new  Scanner(System.in);
        // do{
        //     int num = scanner.nextInt();
        //     if(num == 10){
        //         break;
        //     }
        //     System.out.println(num);
        // } while(true);
        // scanner.close();


        //! Exception Handling (try-catch-finally)
        try{
            int num1 = 10;
            int num2 = 0;
            int num3 = num1/num2;
            System.out.println(num3);
        }
        catch (Exception ex){
            System.out.println(ex);
        }
        finally{
            System.out.println("Done");
        }
    }
}
