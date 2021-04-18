import java.util.ArrayList;
import java.util.List;

public class Commander extends RepublicSoldier {
	
	private List<RepublicSoldier> soldiers = new ArrayList<RepublicSoldier>();
	private String nickname;

	public Commander(String badgeNumber, String battalion, String nickname) {
		super(badgeNumber, battalion);
		this.nickname = nickname;
	}
	
	public String getNickname() {
		return nickname;
	}
	
	public void setNickname(String nickname) {
		this.nickname = nickname;
	}

	@Override
	public void print(String offset) {
		System.out.println(offset + "Commander " + getBadgeNumber() + " (" + getNickname() + "); Battalion: " + getBattalion());
		for (RepublicSoldier s : soldiers) {
			s.print(offset + "    ");
		}
	}

	@Override
	public int getNumberOfSoldiers() {
		int sum = 1;
		for (RepublicSoldier s : soldiers) {
			sum += s.getNumberOfSoldiers();
		}
		return sum;
	}
	
	public void add(RepublicSoldier s) {
		soldiers.add(s);
	}
	
	public void remove(RepublicSoldier s) {
		soldiers.remove(s);
	}
	
	public RepublicSoldier getSoldier(int index) {
		return soldiers.get(index);
	}
}
