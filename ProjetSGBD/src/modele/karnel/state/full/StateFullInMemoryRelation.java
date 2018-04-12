package modele.karnel.state.full;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel._Schema;
import modele.karnel.state.StateFullRelation;
import modele.karnel.tuple.Tuple;

/**
 * Création d'une relation en live dans la mémoire
 *
 */
public class StateFullInMemoryRelation extends StateFullRelation {
	/**
	 * Attributs
	 */
	private static int key=0;
	private Map<Integer,Tuple> map;
	
	/**
	 * Constructeur d'une relation dans la mémoire
	 * @param bd définit la base de données 
	 * @param nom définit le nom de la relation
	 * @param schema définit le schéma de la relation
	 */
	public StateFullInMemoryRelation(Bdd bd, String nom, _Schema schema) {
		super(bd,nom,schema);
		map = new HashMap<>();
	}
	
	/**
	 * Permet d'ajouter un Tuple en mémoire
	 * @parm tup ajoute un nouveau tuple dans la relation
	 */
	@Override public void add(Tuple tup) {
		map.put( key++, tup);
	}

	@Override public void supp(ClePrimaire cp) {
		// TODO Auto-generated method stub
	}
	
	
	/**
	 * La cardinalité
	 * @return la taille de la relation
	 */
	public Long cardinalite() {
		return (long) map.size();
	}
	
	/**
	 * Permet de parcourir plus facilement la relation
	 * @return Un itérator de Tuple
	 */
	@Override public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Tuple> it = map.values().iterator();
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public Tuple next() {return it.next();}
		};
	}
}
