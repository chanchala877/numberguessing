import java.util.*;
import java.util.Random;
public class numberguessing {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //intial interface


        String play="yes";
        int round=0;
        int totalscore=0;
        int totaltries=0;
        System.out.println();

        System.out.println("A Number is chosen between 1 to 100.Guess the number within 7 tries");
        while(play.equals("yes")){
            round++;
                
            int guess;
         int t=7;
         int i;
         int tries=0;
         int score =5;
         Random rand=new Random();
         int num=rand.nextInt(100);
         for( i=0;i<t;i++){
            System.out.println();
            System.out.println("guess the number: ");
            guess=sc.nextInt();
            if(num==guess){
                tries++;
                System.out.println("wohoo! you guessed the right number.");
                System.out.println();
                System.out.println("score ="+score);
                System.out.println("tries ="+tries);
                totalscore=score;
                totaltries=tries;
                System.out.println();
                System.out.println("want to continue playing ? yes/No");
                play=sc.next().toLowerCase();
                break;
                //HERE THE CASE IF THE NUMBER GUESSED IS NOT RIGHT.

            }else if(num>guess && i!=t-1){
                System.out.println("the number is greater than"+guess);
                tries++;
                score--;
            }else{
                System.out.println("the number is less than"+guess);
                tries++;
                score--;

            }

         }
         //case when total tries gets over
         if(i==t){
            System.out.println("tries limit excedeed");
            System.out.println("the original number was"+num);
            totalscore=+score;
            totaltries=+tries;
            System.out.println("score->"+score);
            System.out.println("tries->"+tries);
            //for next line 
            System.out.println();
            System.out.println("want to play again ? tap yes/no");
            play=sc.next().toLowerCase();

         }
        }
        System.out.println("totalrounds"+round);
        System.out.println("No of tries"+totaltries);
        System.out.println("scoreboard"+totalscore);

        //A project by chanchala kumari(OASIS INFOBYTE INTERN)
        
        
    }
 
}
