package CodeSoftInternShip;

import java.util.Random;
import java.util.Scanner;


    class Game{
        int userNumber;
        int compNumber;
        int attempts=0;
        Game(){
            Random num=new Random();
            this.compNumber=num.nextInt(100);
        }
        void userInput(){
            Scanner obj=new Scanner(System.in);
            System.out.println("Enter the Number:");
            userNumber=obj.nextInt();
        }
        boolean isCorrect(){
            attempts++;
            if(userNumber==compNumber){
                System.out.println("You Entered The Right Number\nIt Was The "+userNumber+"\nYou Find Out It In "+attempts+" Attempts");
                return true;
            }
            if(userNumber<compNumber){
                System.out.println("Too Low....");
            }
            if(userNumber>compNumber){
                System.out.println("Too High....");
            }
            return false;
        }
    }
public class NumberGame {
        public static void main(String[] args){
            Game game=new Game();
            boolean result=false;
            while(!result) {
                game.userInput();
                result = game.isCorrect();
            }
        }
}
