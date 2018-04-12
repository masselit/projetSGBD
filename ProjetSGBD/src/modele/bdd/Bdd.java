package modele.bdd;

import java.util.HashMap;
import java.util.Map;

import modele.karnel.state.StateFullRelation;
/**
 * Super classe qui détient l'enssemble des relations
 *
 */
public class Bdd {
	/**
	 * Attribut 
	 */
	private final Map<String,StateFullRelation> relations = new HashMap<>();
	
	/**
	 * Ajouter des relations à la base de données
	 * @param r est une relation `StateFullRelatio`
	 */
	public void add(StateFullRelation r){ relations.put(r.nom(), r);}
	
	/**
	 * Retourne une relation en fonction du nom
	 * @param nom de la relation
	 * @return La relation de type `StateFullRelatio`
	 */
	public StateFullRelation get(String nom){
		return relations.get(nom);
	}
}
