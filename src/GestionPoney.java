import java.util.ArrayList;
import java.util.Scanner;
public class GestionPoney {

	public static void main(String[] args) {
		ArrayList<Poney> poneyList = new ArrayList<Poney>();
		ArrayList<Brigade> brigadeList = new ArrayList<Brigade>();
		ArrayList<Mission> missionList = new ArrayList<Mission>();
		while(true){
			System.out.println("MENU:");
			System.out.println("Crée un nouveau poney ---------------> 1 ");
			System.out.println("Crée une brigade --------------------> 2 ");
			System.out.println("Crée une mission --------------------> 3 ");
			System.out.println("Ajouter un poney a une brigade ------> 4 ");
			System.out.println("Affecter une brigade a une missions -> 5 ");
			System.out.println("Retire un poney a une brigade -------> 6 ");
			System.out.println("Terminer une mission ----------------> 7 ");
			System.out.println("Afficher les poney ------------------> 8 ");
			System.out.println("Affcher les brigade -----------------> 9 ");
			System.out.println("Afficher les missions ---------------> 10");
			System.out.println("Que voulez-vous faire ?");
			Scanner scChoix = new Scanner(System.in);
			int choix = scChoix.nextInt();
			switch(choix) {
			case 1:
				System.out.println("Quel est le nom du poney ?");
				Scanner scNomPoney = new Scanner(System.in);
				String nomPoney = scNomPoney.nextLine();
				System.out.println("Quel est le grade du poney ?");
				Scanner scGradePoney = new Scanner(System.in);
				String gradePoney = scGradePoney.nextLine();
				Poney  poney = new Poney (nomPoney,gradePoney);
				poneyList.add(poney);
				break;
			case 2:
				System.out.println("Quel est le nom de la brigade ?");
				Scanner scBrigade = new Scanner(System.in);
				String nomBrigade = scBrigade.nextLine();
				Brigade brigade = new Brigade (nomBrigade);
				brigadeList.add(brigade);
				break;
			case 3:
				System.out.println("Quel est le nom de la mission ?");
				Scanner scMission = new Scanner(System.in);
				String nomMission = scMission.nextLine();
				Mission mission = new Mission (nomMission);
				missionList.add(mission);
				break;
			case 4:
				System.out.println("Quel brigade voulez-vous ?");
				Scanner scChoixBrigade = new Scanner(System.in);
				String ChoixBrigade = scChoixBrigade.nextLine();
				System.out.println("Quel poney voulez-vous ?");
				Scanner scChoixPoney = new Scanner(System.in);			
				String ChoixPoney = scChoixPoney.nextLine();
				
				for(int i = 0 ; i<brigadeList.size();i++) {
					if(brigadeList.get(i).getNom().equals(ChoixBrigade)) {
						for (int j = 0 ;j<poneyList.size();j++) {
							if(poneyList.get(j).getNom().equals(ChoixPoney))
							brigadeList.get(i).recruter(poneyList.get(j));
						}
					}
				}
				break;
			case 5:
				System.out.println("Quel brigade voulez-vous ?");
				Scanner scChoixBrigade2 = new Scanner(System.in);
				String ChoixBrigade2 = scChoixBrigade2.nextLine();
				System.out.println("Quel missions voulez-vous ?");
				Scanner scChoixMission = new Scanner(System.in);			
				String ChoixMission = scChoixMission.nextLine();
				
				for(int i = 0 ; i<missionList.size();i++) {
					if(missionList.get(i).getNom().equals(ChoixMission)) {
						for (int j = 0 ;j<brigadeList.size();j++) {
							if(brigadeList.get(j).getNom().equals(ChoixBrigade2))
							missionList.get(i).affecter(brigadeList.get(j));
						}
					}
				}
				
				break;
			case 6:
				System.out.println("Quel brigade voulez-vous ?");
				Scanner scChoixBrigade3 = new Scanner(System.in);
				String ChoixBrigade3 = scChoixBrigade3.nextLine();
				System.out.println("Quel poney voulez-vous ?");
				Scanner scChoixPoney2 = new Scanner(System.in);			
				String ChoixPoney2 = scChoixPoney2.nextLine();
				
				for(int i = 0 ; i<brigadeList.size();i++) {
					if(brigadeList.get(i).getNom().equals(ChoixBrigade3)) {
						for (int j = 0 ;j<poneyList.size();j++) {
							if(poneyList.get(j).getNom().equals(ChoixPoney2))
							brigadeList.get(i).virer(poneyList.get(j));
						}
					}
				}
				break;
			case 7:
				System.out.println("Quel brigade voulez-vous ?");
				Scanner scChoixBrigade4 = new Scanner(System.in);
				String ChoixBrigade4 = scChoixBrigade4.nextLine();
				System.out.println("Quel missions voulez-vous ?");
				Scanner scChoixMission2 = new Scanner(System.in);			
				String ChoixMission2 = scChoixMission2.nextLine();
				
				for(int i = 0 ; i<missionList.size();i++) {
					if(missionList.get(i).getNom().equals(ChoixMission2)) {
						for (int j = 0 ;j<brigadeList.size();j++) {
							if(brigadeList.get(j).getNom().equals(ChoixBrigade4))
							missionList.get(i).terminer(brigadeList.get(j));
						}
					}
				}
				
				break;
			case 8:
				for (int i = 0; i <poneyList.size();i++) {
					System.out.println(poneyList.get(i).getNom());
				}
				break;
			case 9:
				for (int i = 0; i <brigadeList.size();i++) {
					System.out.println(brigadeList.get(i).getNom());
				}
				break;
			case 10:
				for (int i = 0; i <missionList.size();i++) {
					System.out.println(missionList.get(i).getNom());
				}
				break;
			default:
				return;
			
			}
			
		}
	}
}
