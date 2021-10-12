import java.util.*;
public class q5{
    public static void main (String[] args){
        int ans = 0;
        int difference = 0;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number\n");
        ans = input.nextInt();
        if (ans > 0)
        {
            System.out.println(ans + " is " + ans + " + bigger then zero");
        }
        else if(ans < 0)
        {
            System.out.println(ans + " is " + -ans + " smaller then zero");
        }
        else
        {
            System.out.println(ans + " is zero");
        }
        
    }
}