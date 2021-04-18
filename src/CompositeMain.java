
public class CompositeMain {

	public static void main(String[] args) {
		//501st Battalion
		Commander c1 = new Commander("CT-7567", "501st", "Rex");
		c1.add(new Trooper("CT-3920", "501st"));
		c1.add(new Trooper("CT-3729", "501st"));
		
		//212th Battalion
		Commander c2 = new Commander("CC-2224", "212th", "Cody");
		c2.add(new Trooper("CT-2746", "212th"));
		c2.add(c1);
		
		//327th Battalion
		Commander c3 = new Commander("CC-5052", "327th", "Bly");
		c3.add(new Trooper("CT-5837", "327th"));
		c3.add(new Trooper("CT-6283", "327th"));
		
		Commander chancellor = new Commander("Surpreme Chancellor", "Republic", "Palpatine");
		chancellor.add(c1);
		chancellor.add(c2);
		chancellor.add(c3);
		
		chancellor.print("");
	}

}
