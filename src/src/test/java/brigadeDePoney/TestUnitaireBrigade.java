package brigadeDePoney;

import BrigadeDePoney.Brigade;
import BrigadeDePoney.Chef;
import BrigadeDePoney.Mission;
import BrigadeDePoney.Poney;
import junit.framework.*;

public class TestUnitaireBrigade extends TestCase {
	private static final Mission m =new Mission("m");
	private static final Poney p = new Poney("p", "g");
	private static final Brigade b = new Brigade("b");
	private static final Chef c = new Chef("p", "g");
	
	public void testRecruter() throws Exception {
			assertEquals(true, b.recruter(p));
		}
	public void testVirer() throws Exception{
			testRecruter();
			assertEquals(true, b.virer(p));
	}
}
