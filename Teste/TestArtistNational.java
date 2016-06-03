package Teste;

import factory.ArtistNational;
import junit.framework.TestCase;



public class TestArtistNational extends TestCase {
	String numeArtist="";
	String nationalitate="";
	int salariu;
	
	ArtistNational artist=new ArtistNational(numeArtist, salariu, nationalitate);

	public TestArtistNational(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}

	public void testConstructorValoriNule(){
		
		String nume=null;
		String nationalitate=null;
		int salariu=100;
		try{
			artist=new ArtistNational(nume, salariu, nationalitate);
			fail("Lipsa nume artist si lipsa nationalitate");
		}
		catch(Exception e){
			
		}	
		
	}
	
	public void testSetterSalariuValoareNormala(){
		int salariu=100;
		artist.setSalariu(salariu);
		assertEquals("Verificare setSalariu pentru valori normala", salariu, artist.getSalariu());
		
		
	}
	
	public void testSetterSalariuNul(){
		int salariu=0;
		
		try{
			artist.setSalariu(salariu);
			fail("Salariul nu poate fi null");
			
		}catch (Exception e){
			
		}
	}
	
	public void testSetterSalariuValoareNegativa(){
		int salariu=-1;
		try{
			artist.setSalariu(salariu);
			fail("Salariul nu poate fi negativ");
		}
		catch(Exception e){
			
		}
	}
}
