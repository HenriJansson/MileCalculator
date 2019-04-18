
public class MileCalculator {

	public void calculateInput() {
	Kattio io = new Kattio(System.in);
		
	while(io.hasMoreTokens()) {
		int hour = 0;
		int CurrentDistance = 0;
		int x = io.getInt();
		if (x == -1) {
			return;
		}
		for(int i = 0; i < x; i++) {
			int speed = io.getInt();
			int hoursDriven = io.getInt();
			CurrentDistance += speed * (hoursDriven - hour);
			hour = hoursDriven;
		}
		System.out.println(CurrentDistance + " Miles");
	}
	
	io.close();
	}
		
	
	public static void main(String[] args) {
		new MileCalculator().calculateInput();
	}	

}