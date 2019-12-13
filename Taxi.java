
public class Taxi {
	int x = 0;
	int y = 0;
	String plateNumber = null;
	int destx = 0;  int desty = 0;
	private String ride;
	
	public Taxi (String Taxi) {
		this.plateNumber = Taxi;
	}
	public void run (String ride) {
		this.ride = ride;
	for (int c = 0; c < ride.length(); c++) {
	}}
	public void book (int x, int y) {
		this.destx = x;
		this.desty = y;
	}
	public void reachedDestination() {
		this.destx = x;
		this.desty = y;
	}
	public void printCurrentLocation() {
		System.out.print("(" + x + "," + y + ")");
	}
	}