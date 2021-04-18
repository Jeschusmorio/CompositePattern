
public class Trooper extends RepublicSoldier {

	public Trooper(String badgeNumber, String battalion) {
		super(badgeNumber, battalion);
	}

	@Override
	public void print(String offset) {
		System.out.println(offset + getBadgeNumber() + "; Battalion: " + getBattalion());
	}

	@Override
	public int getNumberOfSoldiers() {
		return 1;
	}
	
}
