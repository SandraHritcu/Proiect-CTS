package Teste;

import Observer.CasaDeDiscuri;
import junit.framework.TestCase;

public class TestPerioadaActivitateCasaDeDiscuri extends TestCase {
	
	CasaDeDiscuri casaDiscuri;

	public TestPerioadaActivitateCasaDeDiscuri(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testPerioadaActivitateValoriNormale(){
		
		int perioadaActivitate=15;
		casaDiscuri=new CasaDeDiscuri();
		casaDiscuri.setPerioadaActivitate(perioadaActivitate);
		assertEquals("Test perioadaActivitate pentru valori normale", perioadaActivitate, casaDiscuri.getPerioadaActivitate());
	
	}
	
	public void testPerioadaActivitateMinima(){
		int perioadaActivitate=1;
		casaDiscuri=new CasaDeDiscuri();
		casaDiscuri.setPerioadaActivitate(perioadaActivitate);
		assertEquals("Test perioadaActivitate minima", perioadaActivitate, casaDiscuri.getPerioadaActivitate());
		
	}
	
	public void testPerioadaActivitateSubPerioadaMinima(){
		int perioadaActivitate=0;
		try{	
			casaDiscuri.setPerioadaActivitate(perioadaActivitate);
			fail("Perioada de activitate <1");
		
		}catch(Exception e){
			
		}
	}
	
}
