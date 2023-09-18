/**
    A class that creates and rolls a die using a recursive method.
    @author Brian Johnston
    @version 1.0
*/
import java.util.Random;

public class RecDiceRoller {
	public double count;
	
	public RecDiceRoller() {
		count=0;
	}

	public void roll() {
		this.count+=1;
		Random r = new Random();
		int rInt = r.nextInt(6)+1;
		//System.out.println(rInt); artifact from testing with small numbers of rolls.
		if (rInt == 2) {}
		else {
			roll();
		}
	}
}
