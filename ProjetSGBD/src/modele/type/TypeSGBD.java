package modele.type;

public abstract class TypeSGBD<T> {
	
	protected T valeur;
	
	public abstract T getValeur();
	
	public abstract void setValeur(T valeur);
}
