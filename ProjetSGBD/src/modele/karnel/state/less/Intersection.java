package modele.karnel.state.less;

import java.util.Iterator;

import modele.karnel._Relation;
import modele.karnel._Schema;
import modele.karnel.tuple.Tuple;

public class Intersection extends StateLessRelationBinaire {

	
	public final int lengthSchema;
	/**
	 * Constructeur d'une intersection
	 * @param nom
	 * @param schema
	 * @param relation1
	 * @param relation2
	 */
	public Intersection ( _Schema schema, _Relation relation1,_Relation relation2){
		super("intersection(" + relation1.nom() +"+"+relation2.nom(), schema, relation1, relation2);
		lengthSchema = schema.degre();
		System.out.println(lengthSchema);
	}
	@Override
	public void execut() {
		
	}
	
	/**
	 * Permet de parcourir plus facilement deux Tuples dans deux relations
	 * @return Un itérator de Tuple
	 */
	@Override public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Tuple> it = r1.iterator();
			Iterator<Tuple> it2 = r2.iterator();
			@Override public boolean hasNext() {return it.hasNext() && it2.hasNext();}
			@Override public Tuple next() {
				Tuple t = it.next();
				Tuple t2 = it2.next();
				
				Object[] x = new Object[lengthSchema*2];
				int p = 0;
				for(int i = 0; i < lengthSchema ; i++) {
					x[i] = t.get(r1.schema().indexOf(schema().ofIndex(i)));
					p = i + 2;
					x[p] = t2.get(r2.schema().indexOf(schema().ofIndex(i)));
				}	
				return new Tuple(x);
			}
		};
	}
}
