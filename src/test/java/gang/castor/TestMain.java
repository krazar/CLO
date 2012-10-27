package gang.castor;

import static org.mockito.Mockito.*;
import gang.castor.exception.MainOutOfIndexException;

import org.junit.Before;
import org.junit.Test;

public class TestMain {

	private Main main;
	private MainFactory factory;

	private Carte carte1;
	private Carte carte2;
	private Carte carte3;
	private Carte carte4;

	@Before
	public void setUp() {

		factory = new MainFactory();
		main = factory.creerMainVide();

		carte1 = mock(Carte.class);
		carte2 = mock(Carte.class);
		carte3 = mock(Carte.class);
		carte4 = mock(Carte.class);

		try {
			main.addCarte(carte1);
			main.addCarte(carte2);
			main.addCarte(carte3);
			main.addCarte(carte4);
		} catch (MainOutOfIndexException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Test
	public void testAjoutCarteA1Main() throws Exception {
		Carte carte = mock(Carte.class);
		main.addCarte(carte);
		verify(carte).notifyMain(main);
		
	}

	@Test(expected = MainOutOfIndexException.class)
	public void testMainPasPlusDe4Cartes() throws Exception {
		Carte carteFlood = mock(Carte.class);
		main.addCarte(carteFlood);
		
	}

}