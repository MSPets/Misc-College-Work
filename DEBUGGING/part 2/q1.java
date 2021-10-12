import java.util.*; // was missing
public class q1{
    public static void main (String[] args){
        int Speed;
        int Fine = 0;
        System.out.println( "Enter a number" );
        Scanner input = new Scanner(System.in); // was missing
        Speed = input.nextInt();
        if  ( Speed <= 30 )
        {
            Fine = Fine + 1;
            System.out.println( "Fine!");       
        }
        else  if ( Speed > 30 )
        {
            Fine = Fine - 1;
            System.out.println( "Ouch!");
        }
    }
}

