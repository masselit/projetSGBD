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
 * Cr�ation d'une relation en live dans la m�moire
 *
 */
public class StateFullInMemoryRelation extends StateFullRelation {
	/**
	 * Attributs
	 */
	private static int key=0;
	private Map<Integer,Tuple> map;
	
	/**
	 * Constructeur d'une relation dans la m�moire
	 * @param bd d�finit la base de donn�es 
	 * @param nom d�finit le nom de la relation
	 * @param schema d�finit le sch�ma de la relation
	 */
	public StateFullInMemoryRelation(Bdd bd, String nom, _Schema schema) {
		super(bd,nom,schema);
		map = new HashMap<>();
	}
	
	/**
	 * Permet d'ajouter un Tuple en m�moire
	 * @parm tup ajoute un nouveau tuple dans la relation
	 */
	@Override public void add(Tuple tup) {
		map.put( key++, tup);
	}

	@Override public void supp(ClePrimaire cp) {
		// TODO Auto-generated method stub
	}
	
	
	/**
	 * La cardinalit�
	 * @return la taille de la relation
	 */
	public Long cardinalite() {
		return (long) map.size();
	}
	
	/**
	 * Permet de parcourir plus facilement la relation
	 * @return Un it�rator de Tuple
	 */
	@Override public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Tuple> it = map.values().iterator();
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public Tuple next() {return it.next();}
		};
	}
}
