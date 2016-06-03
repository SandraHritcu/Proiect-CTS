package Teste;

import Strategy.CategorieRepertoriu;
import Strategy.ElementRepertoriu;
import junit.framework.TestCase;

public class TestCategorieRepertoriu extends TestCase {
	
	ElementRepertoriu element;
	String denumireCategorie="";
	CategorieRepertoriu repertoriu=new CategorieRepertoriu(denumireCategorie);
	

	public TestCategorieRepertoriu(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		
	}

	protected void tearDown() throws Exception {
		super.tearDown();
	}
	
	
	public void testAdaugareElementInRepertoriu(){
		
		element=new CategorieRepertoriu(denumireCategorie);
		repertoriu.adaugaElement(element);
		assertEquals(1, repertoriu.getSize());	
	}
	
	public void testConstructorDenumireNula(){
		String denumireCategorie=null;
		try{
			element=new CategorieRepertoriu(denumireCategorie);
			fail("Lipsa denumire categorie");
		}catch(Exception e){
			
		}
	}
	
	
	

}
