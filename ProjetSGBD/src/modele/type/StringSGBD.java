package modele.type;

public class StringSGBD extends TypeSGBD<String> {
	
	@Override
	public String getValeur() {
		return valeur;
	}

	@Override
	public void setValeur(String valeur) {
		super.valeur = valeur;
	}
}