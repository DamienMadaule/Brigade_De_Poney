import java.util.ArrayList;

public class Mission {
	private String nom;
	public ArrayList<Brigade> brigadeList;
	private boolean enCours;
	public Chef chef;

	public boolean isEnCours() {
		return enCours;
	}

	public void setEnCours(boolean enCours) {
		this.enCours = enCours;
	}

	public Mission(String pNom) {
		brigadeList = new ArrayList<Brigade>();
		nom = pNom;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public ArrayList<Brigade> getBrigadeList() {
		return brigadeList;
	}

	public void setBrigadeList(ArrayList<Brigade> brigadeList) {
		this.brigadeList = brigadeList;
	}

	public boolean affecter(Brigade pBrigade) {
		for (int i = 0; i < brigadeList.size(); i++) {
			if (pBrigade.getNom().equals(brigadeList.get(i).getNom())) {
				return false;
			}
			if(pBrigade.getPoneyList().isEmpty()) {
				return false;
			}
		}
		brigadeList.add(pBrigade);
		pBrigade.setMission(this);
		return true;
	}

	public void terminer(Brigade pBrigade) {
		for (int i = 0; i < brigadeList.size(); i++) {
			if (pBrigade.getNom().equals(brigadeList.get(i).getNom())) {
				pBrigade.setMission(null);
				if (this.enCours) {
					this.chef.setPrestige(this.chef.getPrestige() + brigadeList.size());
					brigadeList.forEach(brigade -> {
						brigade.getPoneyList().forEach(poney -> {
							if (poney instanceof Troufion) {
								((Troufion) poney).setPatate(((Troufion) poney).getPatate() + 1);
							}
						});
					});
				}
			}
		}

	}

	public boolean Commencer(Mission pMission) {
		if (pMission.chef != null || pMission.brigadeList != null) {
			System.out.println("la mission"+ pMission +" est commencé");
			return false;
		} else {
			pMission.enCours = true;
			System.out.println("la mission"+ pMission +" n'est pas commencé");
			return true;
		}
	}

}