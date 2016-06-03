package Teste;

import factory.ArtistInternational;
import junit.framework.TestCase;

public class TestArtistInternational extends TestCase {
	
	String numeArtist="";
	String nationalitate="";
	int salariu;
	
	ArtistInternational artist=new ArtistInternational(numeArtist, nationalitate, salariu);

	public TestArtistInternational(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	public void testConstructorValoriNormale(){
		String nameArtist="";
		String nationality="";
		int salary=1000;
		artist=new ArtistInternational(nameArtist, nationality, salary);
		assertEquals("Verifica constructor numeArtist ", nameArtist, artist.getNumeArtist());
		assertEquals("Verifica constructor pentru nationalitate",nationality, artist.getNationalitate());
		assertEquals("Verifica constructor pentru salariu", salary, artist.getSalariu());	
		
	}
	
	public void testConstructorValoriNule(){
		String nume=null;
		String nationalitate=null;
		int salariu=100;
		try{
			artist=new ArtistInternational(nume, nationalitate, salariu);
			fail("Lipsa nume artist si nationalitatea acestuia");
		}catch(Exception e){
			
		}
		
		
		
	}
	
	public void testSetterNumeNul(){
		String numeArtist=null;
		try{
			artist.setNumeArtist(numeArtist);
			fail("Numele nu poate fi null");
			
		}catch(Exception e){
			
		}
	}
	
	public void testVarstaMinima() throws Exception{
		int varstaMinima=5;
		artist.setVarstaArtist(varstaMinima);
		assertEquals("Verificare setVarsta cu varstaMinima ", varstaMinima, artist.getVarstaArtist());
		
	}
	
	public void testSubVarstaMinima() throws Exception{
		int varstaInvalida=3;
		
		try{
			artist.setVarstaArtist(varstaInvalida);
			fail("varsta nepotrivita");
			
		}catch (Exception e){
			
		}
	}

}
