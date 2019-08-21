//C1628535
import java.io.*;
import java.util.*;

public class GameFactory {
//Use getGame method to get object of which game 

	public Game getGame(String whichGame) {
		
      if(whichGame.equalsIgnoreCase("C")){
         return new CardGame();
         
      } else if(whichGame.equalsIgnoreCase("D")){
         return new DieGame();
        
      } 
      return null;		
		
	}
}
