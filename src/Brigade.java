import java.util.ArrayList;

public class Brigade {
	private String nom;
	public ArrayList<Poney> poneyList;
	public Mission mission;

	public Brigade(String pNom) {
		poneyList = new ArrayList<Poney>();
		nom = pNom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Poney> getPoneyList() {
		return poneyList;
	}

	public void setPoneyList(ArrayList<Poney> poneyList) {
		this.poneyList = poneyList;
	}

	public Mission getMission() {
		return mission;
	}

	public void setMission(Mission mission) {
		this.mission = mission;
	}

	public boolean recruter(Poney pPoney) {
		for (int i = 0; i < poneyList.size(); i++) {
			if (pPoney.getNom().equals(poneyList.get(i).getNom())) {
				return false;
			}
		}
		poneyList.add(pPoney);
		pPoney.setBrigade(this);

		return true;
	}

	public boolean virer(Poney pPoney) {
		for (int i = 0; i < poneyList.size(); i++) {
			if (pPoney.getNom().equals(poneyList.get(i).getNom())) {
				poneyList.remove(pPoney);
				pPoney.setBrigade(null);
				return true;
			}
		}
		return false;
	}
}