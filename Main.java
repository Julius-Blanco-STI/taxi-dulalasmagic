
public class Main {
public static void main(String[] args) {
	Taxi x = new Taxi("UGH 69420");
	x.run("I will go to Makati");
	x.printCurrentLocation();
		//x:0; ,y:0;
	x.book(10,10);
	x.run("I am leaving on a jetPlane");
	x.reachedDestination();		
} 		//false
}