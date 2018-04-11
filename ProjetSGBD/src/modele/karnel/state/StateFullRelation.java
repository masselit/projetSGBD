package modele.karnel.state;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel.Relation;
import modele.karnel._Schema;
import modele.karnel.tuple.Tuple;

/**
 * Class qui struture la création de realtion
 *
 */
public abstract class StateFullRelation extends Relation {
	/**
	 * Attribut
	 */
	protected Bdd bd;
	
	/**
	 * Constructeur qui appel le constructeur de realtion accèsible uniquement par ses fils
	 * @param bd est la base de données
	 * @param nom de la relation
	 * @param schema de la relation
	 */
	protected StateFullRelation(Bdd bd, String nom, _Schema schema ){
		super(nom,schema);
		this.bd = bd;
	}
	
	/**
	 * méthode abstraite qui oblige les classes fils à implémenter add
	 * @param tup le Tuple que l'on veu ajouter à la relation
	 */
	public abstract void add(Tuple tup);
	
	/**
	 * méthode abstraite qui oblige les classes fils à implémenter supp
	 * @param cp
	 */
	public abstract void supp(ClePrimaire cp);
}