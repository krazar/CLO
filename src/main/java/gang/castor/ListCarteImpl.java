package gang.castor;

import java.util.ArrayList;
import java.util.List;

public class ListCarteImpl implements ListCarte {

	private List<Carte> myPrivateList;

	public ListCarteImpl() {
		myPrivateList = new ArrayList<Carte>();
	}

	public void addCarte(Carte carte) {
		myPrivateList.add(carte);

	}

	public int size() {
		return myPrivateList.size();
	}

}
