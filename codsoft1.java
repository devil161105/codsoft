import java .util.*;

public class codsoft1 {
    public static void main(String[] args) {
        Random r=new Random();
        Scanner sc =new Scanner(System.in);
        int numberToGuess=r.nextInt(100)+1;
        
        int guess=0;
        int attempt=0;
        System.out.println("WELCOME TO GAME OF GUESSING NUMBER!");
        System.out.println("YOU HAVE TO THINK A BETWEEN 0 TO 100");
        while(guess!=numberToGuess){
            System.out.println("Enter your Guess:");
            guess=sc.nextInt();
            attempt++;
            if(guess>numberToGuess){
                System.out.println("TOO HIGH! ,try again");
            }
            else if(guess<numberToGuess){
                System.out.println("TOO LOW! ,try again");
            }
            else {
                System.out.println("YOU CRACKED THE RIGHT NUMBER IN "+attempt+" ATTEMPT \n CONGRULATION!");
            }
        }
        

    }
}
