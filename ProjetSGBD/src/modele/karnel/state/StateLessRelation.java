package modele.karnel.state;

import modele.karnel.Relation;
import modele.karnel._Schema;
import modele.karnel.operateur._Operateur;
/**
 * Classe de structure de l'application traitement 
 * 
 */
public abstract class StateLessRelation extends Relation implements _Operateur{

	/**
	 * Constructeur qui appel le constructeur de realtion accèsible uniquement par ses fils
	 * @param nom de la relation
	 * @param schema définit une relation
	 */
	protected StateLessRelation(String nom, _Schema schema) {
		super(nom, schema);
	}

}
