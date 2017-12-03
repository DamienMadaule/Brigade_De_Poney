
public class Poney {
	private String nom;
	private String grade;
	protected Brigade brigade;
	
	
	public Poney(String pNom,String pGrade) {
		nom = pNom;
		grade = pGrade;
	}
	public String getNom()
	{
		return nom;
	}
	public String getGrade() {
		return grade;
	}
	public void setNom(String pNom){
		nom = pNom;
	}
	public void setGrade(String pGrade){
		grade = pGrade;
	}
}
