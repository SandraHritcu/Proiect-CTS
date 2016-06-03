package Teste;

import Singleton.Melodie;
import junit.framework.TestCase;

public class TestCaseConstructorMelodie extends TestCase {
	
	Melodie melodie;
	
	public TestCaseConstructorMelodie(String nume){
		super(nume);
	}

	protected void setUp() throws Exception{
		super.setUp();
		
	}
	
	protected void tearDown() throws Exception{
		super.tearDown();
	}
	
	public void testConstructorValoriNormale(){
		String numeMelodie="Hello";
		String gen="pop";
		melodie=new Melodie(numeMelodie, gen);
		assertEquals("Verificare constructor numeMelodie", numeMelodie,melodie.getNumeMelodie());
		assertEquals("Verificare contstructor gen melodie",gen, melodie.getGen());
	}
	
	public void testConstructorNumeNull(){
		String numeMelodie=null;
		String gen="rock";
		try{
		melodie=new Melodie(numeMelodie, gen);
		fail("Lipsa nume melodie");
		}
		catch (Exception e){
			
		}
		
		
		
		
	}

}
