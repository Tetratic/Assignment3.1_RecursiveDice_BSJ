
public class RecDiceRollerDriver {

	public static void main(String[] args) {
		RecDiceRoller r = new RecDiceRoller();
		//r.roll(); artifact from original test in Part 1 of the assignment
		
		double avg = 0;
		for (int i = 0; i<1000; i++) {
			r.roll();
		}
		avg = r.count/1000;
		System.out.println(avg);

	}

}
