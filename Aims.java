
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
public class Aims {
	public static void main(String[] args) {
		Cart anOrder = new Cart();
		DigitalVideoDisc dvd1 = new DigitalVideoDisc("The Lion King",
				"Animation","Roger Allers", 87,19.95f );
		anOrder.addDigitalVideoDisc(dvd1);
		DigitalVideoDisc dvd2 = new DigitalVideoDisc("Star Wars",
				"Science Fiction","Geogre Lucas", 87,24.95f );
		anOrder.addDigitalVideoDisc(dvd2);
		DigitalVideoDisc dvd3 = new DigitalVideoDisc("Aladin",
				"Animation","" ,82 , 19.95f );
		anOrder.addDigitalVideoDisc(dvd3);
		
		System.out.println("Total Cost is:");
		System.out.println(anOrder.totalCost());
		


    }
}