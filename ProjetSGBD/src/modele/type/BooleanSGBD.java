package modele.type;

public class BooleanSGBD extends TypeSGBD<Boolean> {

	@Override
	public Boolean getValeur() {
		return valeur;
	}

	@Override
	public void setValeur(Boolean valeur) {
		super.valeur = valeur;
	}

}
