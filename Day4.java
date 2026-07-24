//loops, while, do-while, for
import java.util.Scanner;
public class Day4{

    public static void main(String args[]){
       //  for loop
        // for(int i =0;i<10;i++){
        //     System.out.println(i);
        // }

        //while loop
        // int i =0;
        // while(i<=10){
        //     System.out.println(i);
        //     i++;
        // }

        //do-while loop
        // int i=0;
        // do{
        //     System.out.println(i);
        //     i++;
        // }while(i<11);

        //n natural numbers
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int sum = 0;

        for(int i=1;i<=n;i++){
            sum+=i;
        }
        System.out.println(sum);
    

    }
}