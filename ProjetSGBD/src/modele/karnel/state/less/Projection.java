package modele.karnel.state.less;

import java.util.Iterator;

import modele.karnel.Attribut;
import modele.karnel._Relation;
import modele.karnel._Schema;
import modele.karnel.tuple.Tuple;

/**
 * Permet de Sélectionné des colonne dans une Relation
 *
 */
public class Projection extends StateLessRelationUnaire {
	/**
	 * Atribut
	 */
	private final Attribut[] lesAttributSelect;
	/**
	 * Constructeur d'une projection version Schéma
	 * @param r est une Relation
	 * @param schema est une interface _Schema
	 * 
	 * Construit la liste des Attributs
	 */
	public Projection(_Relation r, _Schema schema ){
		super("selection("+r.nom(),r.schema(), r);
		Attribut[] temp = new Attribut[schema.degre()];		
		for(int i = 0;i<schema.degre();i++){
			temp[i] = schema.ofIndex(i);
		}
		lesAttributSelect = temp;
	}
	
	/**
	 * Permet de parcourir plus facilement un Tuple en rapport avec les bons Attributs
	 * @return Un itérator de Tuple
	 */
	@Override public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Tuple> it = r.iterator();
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public Tuple next() {
				Tuple t = it.next();
				Object[] x = new Object[lesAttributSelect.length];
				int i = 0;
				for(Attribut att : lesAttributSelect)x[i++]= t.get(schema().indexOf(att));
				return new Tuple(x);
			}
		};
	}

	@Override
	public void execut() {
		
	}
}
