// if-else condition, switch case
import java.util.*;

public class Day3 { 
    public static void main(String args[])
    {
        // example 1
    //   Scanner sc = new Scanner(System.in);
    //   int age = sc.nextInt();

    //   if( age > 18){
    //     System.out.println("Adult");
    //   }
    //   else{
    //     System.out.println("Not");
    //   }
      
    //example 2
    //  Scanner sc = new Scanner(System.in);
    //  int num = sc.nextInt();
    //  if(num %2== 0)
    //  {
    //     System.out.println("NUmber is even");
    //  }
    //  else{
    //     System.out.println("Number is odd");
    //  }

     //exapmle 3
        // Scanner sc = new Scanner(System.in);
        // int num = sc.nextInt();
        // int num1= sc.nextInt();
        // if(num == num1){
        //     System.out.println("Both are equal");
        // }
        // else if (num1 > num){
        //     System.out.println("Second number is greater");
        // }
        // else{
        //    System.out.println("First iss greater");
        // }


        //switch case
        // Scanner sc = new Scanner(System.in);
        // String color = sc.nextLine();

        // switch(color) 
        // {
        //     case "red":
        //         System.out.println("Color is red");
        //         break;
        //     case "blue":
        //         System.out.println("Color is blue");
        //         break;
        //     case "green":
        //         System.out.println("Color is green");
        //         break;
        //     default:
        //         System.out.println("Color is not red, blue or green");
        // }

        //calculator

        Scanner sc= new Scanner(System.in);
        int num1 = sc.nextInt();
        int num2 = sc.nextInt();
        System.out.println("Enter the operation to perform: +, -, *,/");
        String opr = sc.next();

        switch(opr){
            case "+":
                System.out.println("Addtion is:" + (num1 +num2));
                break;
            case "-":
                System.out.println("Subtraction is:" + (num1 - num2));
                break;
            case "*":
                System.out.println("Multiplication is:" + (num1 * num2));       
                break;
            case "/":
                System.out.println("Division is:" + (num1 / num2));
                break;
            default:
                System.out.println("Invalid operation");
        }
    }
} 