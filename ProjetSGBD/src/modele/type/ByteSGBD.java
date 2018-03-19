package modele.type;

public class ByteSGBD extends TypeSGBD<Byte> {

	@Override
	public Byte getValeur() {
		return valeur;
	}

	@Override
	public void setValeur(Byte valeur) {
		super.valeur = valeur;
	}

}
