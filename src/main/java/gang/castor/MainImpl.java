package gang.castor;

import gang.castor.exception.MainOutOfIndexException;


public class MainImpl implements Main {
	
	private ListCarte listCarte;  
	
	public MainImpl(){
		listCarte = new ListCarteImpl();
	}

	public void addCarte(Carte carte) throws MainOutOfIndexException {
		if(listCarte.size()>=4)
			throw new MainOutOfIndexException();
		
		listCarte.addCarte(carte);
		
	}

	

	

}
