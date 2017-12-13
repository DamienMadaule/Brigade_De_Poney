import java.util.ArrayList;
import java.util.Scanner;

public class GestionPoney {

	public static void main(String[] args) {
		ArrayList<Poney> poneyList = new ArrayList<Poney>();
		ArrayList<Brigade> brigadeList = new ArrayList<Brigade>();
		ArrayList<Mission> missionList = new ArrayList<Mission>();
		while (true) {
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
			System.out.println("Supprimer un poney ------------------> 11");
			System.out.println("Supprimer une mission ---------------> 12");
			System.out.println("Supprimer une brigade ---------------> 13");
			System.out.println("Que voulez-vous faire ?");
			Scanner scChoix = new Scanner(System.in);
			int choix = scChoix.nextInt();
			switch (choix) {
			case 1:
				System.out.println("Quel est le nom du poney ?");
				Scanner scNomPoney = new Scanner(System.in);
				String nomPoney = scNomPoney.nextLine();
				System.out.println("Quel est le grade du poney ?");
				Scanner scGradePoney = new Scanner(System.in);
				String gradePoney = scGradePoney.nextLine();
				Poney poney = new Poney(nomPoney, gradePoney);
				poneyList.add(poney);
				break;

			case 2:
				System.out.println("Quel est le nom de la brigade ?");
				Scanner scBrigade = new Scanner(System.in);
				String nomBrigade = scBrigade.nextLine();
				Brigade brigade = new Brigade(nomBrigade);
				brigadeList.add(brigade);
				break;

			case 3:
				System.out.println("Quel est le nom de la mission ?");
				Scanner scMission = new Scanner(System.in);
				String nomMission = scMission.nextLine();
				Mission mission = new Mission(nomMission);
				missionList.add(mission);
				break;

			case 4:
				System.out.println("Quel brigade voulez-vous ?");
				Scanner scChoixBrigade = new Scanner(System.in);
				String ChoixBrigade = scChoixBrigade.nextLine();
				System.out.println("Quel poney voulez-vous ?");
				Scanner scChoixPoney = new Scanner(System.in);
				String ChoixPoney = scChoixPoney.nextLine();

				brigadeList.forEach(brigade2 -> {
					if (brigade2.getNom().equals(ChoixBrigade))
						poneyList.forEach(poney2 -> {
							if (poney2.getNom().equals(ChoixPoney)) {
								brigade2.recruter(poney2);
								System.out.println("le poney " + poney2.getNom() + " a été recruté par la brigade "
										+ brigade2.getNom());
							}
						});
				});
				break;

			case 5:
				System.out.println("Quel brigade voulez-vous ?");
				Scanner scChoixBrigade2 = new Scanner(System.in);
				String ChoixBrigade2 = scChoixBrigade2.nextLine();
				System.out.println("Quel missions voulez-vous ?");
				Scanner scChoixMission = new Scanner(System.in);
				String ChoixMission = scChoixMission.nextLine();

				missionList.forEach(mission2 -> {
					if (mission2.getNom().equals(ChoixMission))
						brigadeList.forEach(brigade2 -> {
							if (brigade2.getNom().equals(ChoixBrigade2)) {
								mission2.affecter(brigade2);
								System.out.println("la brigade " + brigade2.getNom() + "a été affecté à la mission"
										+ mission2.getNom());
							}
						});
				});
				break;

			case 6:
				System.out.println("Quel brigade voulez-vous ?");
				Scanner scChoixBrigade3 = new Scanner(System.in);
				String ChoixBrigade3 = scChoixBrigade3.nextLine();
				System.out.println("Quel poney voulez-vous ?");
				Scanner scChoixPoney2 = new Scanner(System.in);
				String ChoixPoney2 = scChoixPoney2.nextLine();

				brigadeList.forEach(brigade2 -> {
					if (brigade2.getNom().equals(ChoixBrigade3))
						poneyList.forEach(poney2 -> {
							if (poney2.getNom().equals(ChoixPoney2)) {
								brigade2.virer(poney2);
								System.out.println(
										"la poney " + poney2.getNom() + "a été viré de la brigade" + brigade2.getNom());
							}
						});
				});
				break;

			case 7:
				System.out.println("Quel brigade voulez-vous ?");
				Scanner scChoixBrigade4 = new Scanner(System.in);
				String ChoixBrigade4 = scChoixBrigade4.nextLine();
				System.out.println("Quel missions voulez-vous ?");
				Scanner scChoixMission2 = new Scanner(System.in);
				String ChoixMission2 = scChoixMission2.nextLine();

				missionList.forEach(mission2 -> {
					if (mission2.getNom().equals(ChoixMission2))
						brigadeList.forEach(brigade2 -> {
							if (brigade2.getNom().equals(ChoixBrigade4)) {
								mission2.terminer(brigade2);
								System.out.println(
										"la brigade " + brigade2.getNom() + "a terminé la mission" + mission2.getNom());
							}
						});
				});
				break;

			case 8:
				poneyList.forEach(System.out::println);
				break;

			case 9:
				brigadeList.forEach(System.out::println);
				break;

			case 10:
				missionList.forEach(System.out::println);
				break;

			case 11:
				System.out.println("Quel poney voulez-vous supprimer ?");
				Scanner scSupPoney = new Scanner(System.in);
				String SupPoney = scSupPoney.nextLine();

				poneyList.forEach(poney2 -> {
					if (poney2.getNom().equals(SupPoney)) {
						poneyList.remove(poney2);
					}
				});
			case 12:
				System.out.println("Quel brigade voulez-vous supprimer ?");
				Scanner scSupBrigade = new Scanner(System.in);
				String SupBrigade = scSupBrigade.nextLine();

				brigadeList.forEach(brigade2 -> {
					if (brigade2.getNom().equals(SupBrigade)) {
						brigadeList.remove(brigade2);
					}
				});
				break;

			case 13:
				System.out.println("Quel mission voulez-vous supprimer ?");
				Scanner scSupMission = new Scanner(System.in);
				String SupMission = scSupMission.nextLine();

				missionList.forEach(mission2 -> {
					if (mission2.getNom().equals(SupMission)) {
						missionList.remove(mission2);
					}
				});
			default:
				return;

			}

		}
	}
}