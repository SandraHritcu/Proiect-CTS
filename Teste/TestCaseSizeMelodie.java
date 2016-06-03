package Teste;

import Singleton.Melodie;
import junit.framework.TestCase;

public class TestCaseSizeMelodie extends TestCase {
	
	Melodie melodie;

	public TestCaseSizeMelodie(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testSizeMelodieValoriNormale(){
		melodie=new Melodie();
		int size=15;
		melodie.setSize(size);
		assertEquals("Verificare size melodie pentru valori normale", size, melodie.getSize());
		
		
	}
	
	public void testSizeMelodieValoareNula(){
		int size=0;
		try{
		melodie.setSize(size);
		fail("O melodie nu poate avea 0 MB");
		}catch (Exception e){
			
		}
		
	}
	
	public void testSizeMelodieValoriNegative(){
		int size=-1;
		try{
			melodie.setSize(size);
			fail("O melodie nu poate avea size-ul negativ");
		}catch (Exception e){
			
		}
		
		
	}
	

}
