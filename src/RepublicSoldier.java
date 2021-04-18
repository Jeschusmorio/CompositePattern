
public abstract class RepublicSoldier {
	
	private String badgeNumber;
	
	private String battalion;
	
	public abstract void print(String offset);
	
	public abstract int getNumberOfSoldiers();
	
	public RepublicSoldier(String badgeNumber, String battalion) {
		this.badgeNumber = badgeNumber;
		this.battalion = battalion;
	}
	
	public String getBadgeNumber() {
		return badgeNumber;
	}

	public void setBadgeNumber(String badgeNumber) {
		this.badgeNumber = badgeNumber;
	}

	public String getBattalion() {
		return battalion;
	}

	public void setBattalion(String battalion) {
		this.battalion = battalion;
	}
}
