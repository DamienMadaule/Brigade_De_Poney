import java.util.ArrayList;

public class Chef extends Poney {

	private int prestige;
	public ArrayList<Mission> missionList;

	public Chef(String pNom, String pGrade) {
		super(pNom, pGrade);

	}

	public int getPrestige() {
		return prestige;
	}

	public void setPrestige(int prestige) {
		this.prestige = prestige;
	}

}