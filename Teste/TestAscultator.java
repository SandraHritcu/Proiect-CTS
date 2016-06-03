package Teste;
import Composit.Ascultator;
import Composit.IPlaylist;
import junit.framework.TestCase;

public class TestAscultator extends TestCase {
	
	Ascultator ascultator=new Ascultator();
	IPlaylist playlist;
	
	public TestAscultator(String name) {
		super(name);
	}

	protected void setUp() throws Exception {
		super.setUp();
		ascultator.adaugaPlaylist(playlist);
			
	}

	protected void tearDown() throws Exception {
		super.tearDown();
		ascultator=null;
	}
	
	
	public void testStergerePlaylist() throws Exception {
		
		ascultator.stergePlaylist(playlist);
		assertEquals(0.0, ascultator.calculeazaSuma(),0.0);
		
		
	}
	
	public void testStergerePlaylistInexistent(){
		IPlaylist playlist2 = new Ascultator();
		try{
			ascultator.stergePlaylist(playlist2);
			fail("Playlistul nu a fost gasit");
		}catch (Exception e){
			
		}
	}
	
		
	}
	


