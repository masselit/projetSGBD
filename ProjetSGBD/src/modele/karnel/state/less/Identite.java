package modele.karnel.state.less;

import java.util.Iterator;

import modele.karnel._Relation;
import modele.karnel.tuple.Tuple;
/**
 * Permet d'afficher la relation dans son enssemble
 *
 */
public class Identite extends StateLessRelationUnaire {

	/**
	 * Constructeur de l'identiter de la relation
	 * @param r est une interface de relation
	 */
	public Identite(_Relation r) {
		super("identite("+r.nom(), r.schema(), r);
	}

	/**
	 * Permet de parcourir plus facilement un Tuple dans une relation
	 * @return Un itérator de Tuple
	 */
	@Override public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Tuple> it = r.iterator();
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public Tuple next() {return it.next();}
		};
	}
	
	/**
	 * 
	 */
	@Override public void execut() {
		
	}
}
