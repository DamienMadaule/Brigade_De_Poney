import java.util.ArrayList;
import java.util.Scanner;

public class GestionPoney {

	public static void main(String[] args) {
		ArrayList<Poney> poneyList = new ArrayList<Poney>();
		ArrayList<Brigade> brigadeList = new ArrayList<Brigade>();
		ArrayList<Mission> missionList = new ArrayList<Mission>();
		Brigade testBrigade = new Brigade("TestBrigade");
		brigadeList.add(testBrigade);
		Mission testMission = new Mission("TestMission");
		missionList.add(testMission);
		while (true) {
			System.out.println("MENU:");
			System.out.println("Créer un nouveau poney --------------> 1 ");
			System.out.println("Créer une brigade -------------------> 2 ");
			System.out.println("Créer une mission -------------------> 3 ");
			System.out.println("Ajouter un poney a une brigade ------> 4 ");
			System.out.println("Affecter une brigade a une missions -> 5 ");
			System.out.println("Retire un poney a une brigade -------> 6 ");
			System.out.println("Terminer une mission ----------------> 7 ");
			System.out.println("Afficher les poneys -----------------> 8 ");
			System.out.println("Affcher les brigades ----------------> 9 ");
			System.out.println("Afficher les missions ---------------> 10");
			System.out.println("Supprimer un poney ------------------> 11");
			System.out.println("Supprimer une mission ---------------> 12");
			System.out.println("Supprimer une brigade ---------------> 13");
			System.out.println("Ajouter un troufion -----------------> 14");
			System.out.println("Ajouter un chef ---------------------> 15");
			System.out.println("Commencer une mission ---------------> 16");

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
				/*
				 * Brigade selected = brigadeList.stream() .filter(findBrigade ->
				 * findBrigade.getNom().equals(ChoixBrigade3)).findFirst().get(); if (selected
				 * != null) { Poney poy = poneyList.stream().filter(findBrigade ->
				 * findBrigade.getNom().equals(ChoixBrigade3)) .findFirst().get(); if (poy !=
				 * null) { selected.getPoneyList().remove(poy); } }
				 */

				break;

			case 7:
				System.out.println("Quel missions voulez-vous ?");
				Scanner scChoixMission2 = new Scanner(System.in);
				String ChoixMission2 = scChoixMission2.nextLine();

				brigadeList.forEach(brigade2 -> {
					if (brigade2.getMission().getNom().equals(ChoixMission2)) {
						brigade2.setMission(null);
						System.out.println("la brigade " + brigade2.getNom() + "a terminé la mission");
					}
				});

				break;

			case 8:
				poneyList.forEach(poney2 -> System.out.println(poney2.getNom()));

				break;

			case 9:
				brigadeList.forEach(brigade2 -> System.out.println(brigade2.getNom()));

				break;

			case 10:
				missionList.forEach(mission2 -> System.out.println(mission2.getNom()));

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

				break;
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

				break;
			case 14:
				System.out.println("Quel est le nom du Troufion ?");
				Scanner scNomTroufion = new Scanner(System.in);
				String nomTroufion = scNomTroufion.nextLine();
				Troufion troufion = new Troufion(nomTroufion, "Troufion");
				poneyList.add(troufion);

				break;
			case 15:
				System.out.println("Quel est le nom du chef?");
				Scanner scNomChef = new Scanner(System.in);
				String nomChef = scNomChef.nextLine();
				Chef chef = new Chef(nomChef, "Chef");
				poneyList.add(chef);

				break;
			case 16:
				System.out.println("Quel mission faut-t-il commencer?");
				Scanner scMissionCommencer = new Scanner(System.in);
				String MissionCommencer = scMissionCommencer.nextLine();
				missionList.forEach(mission2 -> {
					if (mission2.getNom().equals(MissionCommencer))
						mission2.Commencer(mission2);
				});
				break;
			default:

				return;

			}

		}
	}
}