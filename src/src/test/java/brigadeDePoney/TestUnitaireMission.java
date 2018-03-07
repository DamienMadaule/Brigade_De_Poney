package brigadeDePoney;

import BrigadeDePoney.Brigade;
import BrigadeDePoney.Chef;
import BrigadeDePoney.Mission;
import BrigadeDePoney.Poney;
import junit.framework.*;

public class TestUnitaireMission extends TestCase {

	private static final Mission m =new Mission("m");
	private static final Poney p = new Poney("p", "g");
	private static final Brigade b = new Brigade("b");
	private static final Chef c = new Chef("p", "g");
	
	public void testAffecterBrigade() throws Exception {
		assertEquals(true,m.affecter(b));
	}
	
	public void testMissionCommencer() throws Exception {
		m.affecter(b);
		assertEquals(false, m.Commencer(m));
	}
	
	public void testIsEnCours() throws Exception {
		m.affecter(b);
		 m.Commencer(m);
		assertEquals(false, m.isEnCours());
	}
	public void testTerminer() throws Exception {
		
	}
}
