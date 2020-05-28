
/**
 * A class that fills a magic hand of 7 cards with random Card Objects and then asks the user to pick a card and
 * searches the array of cards for the match to the user's card. To be used as starting code in ICE 1
 *
 * @author dancye
 * @author Paul Bonenfant
 */
import java.util.Scanner;
public class CardTrick {

    public static void main(String[] args) {
        
        Card[] magicHand = new Card[7];

        for (int i = 0; i < magicHand.length; i++) {
            Card c = new Card();
            c.setValue((int) (Math.random()*13+1));
            c.setSuit(Card.SUITS[(int)(Math.random()*4)]);
            magicHand[i]=c;
            Card luckyCard=new Card();
            luckyCard.setValue(3);
            luckyCard.setSuit("Diamond")
        }
        Scanner sc=new Scanner(System.in);
        System.out.println("Please enter the card number");
        int num=sc.nextInt();
        System.out.println("Please enter the suit");
        String suit=sc.nextLine();
        
       
        boolean result=false;
        for (int j = 0; j <magicHand.length; j++)
        {
            if((magicHand[j].getValue()==num)&&(magicHand[j].getSuit().equalsIgnoreCase(suit)))
                result=true;
        }
        if(result=true)
        {
            System.out.println("Congratulations.......You Won");
        }
        else
        {
            System.out.println("Sorry.......You Lose");
            
                        

            
    }
    }
}
    
            
            
   
    
    



        
            
            
       
    
