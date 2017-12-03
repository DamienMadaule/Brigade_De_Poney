import java.util.ArrayList;


public class Brigade {
	private String nom;
	protected ArrayList<Poney> poneyList;
	protected Mission mission;
	
	
	public Brigade(String pNom) {
		poneyList = new ArrayList<Poney>();
		nom = pNom;
	}
	public String getNom(){
		return nom;
	}
	public void setNom(String pNom) {
		nom = pNom;
	}
	public boolean recruter(Poney pPoney) {
		for(int i = 0; i < poneyList.size();i++) {
			if(pPoney.getNom().equals(poneyList.get(i).getNom())) {
				return false;
				}
			}
		poneyList.add(pPoney);
		return true;
	}
	public boolean virer(Poney pPoney) {
		for(int i = 0 ; i < poneyList.size();i++) {
			if(pPoney.getNom().equals(poneyList.get(i).getNom())) {
				poneyList.add(pPoney);
				return true;
				}
			}
		return false;
	}
}