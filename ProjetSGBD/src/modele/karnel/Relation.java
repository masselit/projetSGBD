package modele.karnel;

/**
 * Défition de ce qu'est une relation
 *
 */
public abstract class Relation implements _Relation{
	/**
	 * Attributs
	 */
	private _Schema schema;
	private final String nom;
	
	/**
	 * Constructeur d'une realtion accèsible que par ses fils
	 * @param nom de la relation
	 * @param schema qui définit la relation
	 */
	protected Relation(String nom, _Schema schema) {
		this.nom=nom;
		this.schema=schema;
	}
	
	/**
	 * Renvoi le nom de la realtion
	 * @return nom
	 */
	@Override public String nom() {return nom;}
	/**
	 * Renvoi le schema de la relation
	 * @return interface schema
	 */
	@Override public _Schema schema() {return schema;}
}
