import java.util.ArrayList;

public class Mission {
	private String nom;
	public ArrayList<Brigade> brigadeList;

	public Mission(String pNom) {
		brigadeList = new ArrayList<Brigade>();
		nom = pNom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String pNom) {
		nom = pNom;
	}

	public boolean affecter(Brigade pBrigade) {
		for (int i = 0; i < brigadeList.size(); i++) {
			if (pBrigade.getNom().equals(brigadeList.get(i).getNom())) {
				return false;
			}
		}
		brigadeList.add(pBrigade);
		return true;
	}

	public void terminer(Brigade pBrigade) {
		for (int i = 0; i < brigadeList.size(); i++) {
			if (pBrigade.getNom().equals(brigadeList.get(i).getNom())) {
				brigadeList.remove(pBrigade);
			}
		}

	}
}
