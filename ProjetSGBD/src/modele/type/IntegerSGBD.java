package modele.type;

public class IntegerSGBD extends TypeSGBD<Integer> {

	@Override
	public Integer getValeur() {
		return valeur;
	}

	@Override
	public void setValeur(Integer valeur) {
		super.valeur = valeur;
	}

}
