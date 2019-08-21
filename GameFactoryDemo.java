//C1628535
import java.io.*;
import java.util.*;

public class GameFactoryDemo {

//The BufferedReader used throughout
	public static BufferedReader br=new BufferedReader(new InputStreamReader(System.in));

	public static void main(String[] args) throws Exception {

//Create Game Factory
	GameFactory gf = new GameFactory();

//Ask whether to play a card game or a die game
      System.out.print("Card (c) or Die (d) game? ");
      String ans=br.readLine();

//User Input  
//Play card game
	    if (ans.equals("c")) {  
//Get an object of C and return its Game method  	
	    	Game cardGame = gf.getGame("C");
//Call Game method of Card
	    	cardGame.playGame();
	    }

//Play die game
	    else if (ans.equals("d")) {
//Get an object of D and return its Game method 
	    	Game dieGame = gf.getGame("D");
//Call Game method of Die
	    	dieGame.playGame();
	    }

//Throw exception
	    else throw new Exception("Not Allowed" + ans);

	}
}
