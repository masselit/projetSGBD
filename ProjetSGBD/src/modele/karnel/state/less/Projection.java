package modele.karnel.state.less;

import java.util.Iterator;

import modele.karnel.Attribut;
import modele.karnel.Relation;
import modele.karnel.Schema;
import modele.karnel._Relation;
import modele.karnel._Schema;
import modele.karnel.tuple.Tuple;
import modele.type.IntegerSGBD;
import modele.type.StringSGBD;

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
	 * Constructeur d'une projection version String
	 * @param r est une Relation
	 * @param attributs est la suite d'Attribut donné sous forme de String
	 * 
	 * Construit la liste des Attributs
	 */
	public Projection(_Relation r, String... attributs ){
		super("selection("+r.nom(),r.schema(), r);
		//cas où le nombre d'attribut rentré est inférieur au nombre dans le schéma de la relation
		if(schema().degre() <= attributs.length){
			Attribut[] temp = new Attribut[attributs.length];
			int i = 0;
			for(String str : attributs){
				temp[i] = schema().ofName(str);
				i++;
			}
			lesAttributSelect = temp;
		}
		//cas où il a plus d'attribut que dans le schéma de la relation
		else{
			
			Attribut[] temp = new Attribut[0];
			lesAttributSelect = temp;
		}	
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
