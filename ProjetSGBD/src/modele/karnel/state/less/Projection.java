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

public class Projection extends StateLessRelationUnaire {
	
//	private String selection;

/*	public Selection(String nom, _Schema schema,  _Relation r, Attribut... params ){
		
		super(nom, schema,r);
		_Schema sch = new Schema(params);
		
//		this.selection = selection;
	}*/
	private final int[] indexes;
	
	public Projection(_Relation r, _Schema schema ){
		super("selection("+r.nom(),schema, r);
		indexes = new int[schema.degre()];
		_Schema s = r.schema();
		for(Attribut a : schema.indexOf(a)) {
			s.iterator();
		}
	}
	
	@Override public Iterator<Tuple> iterator() {
		// TODO Auto-generated method stub
		return new Iterator<Tuple>() {
			Iterator<Tuple> it = r.iterator();
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public Tuple next() {
				Tuple t = it.next();
				Object[] x = new Object[indexes.length];
				for(int i =0; i<indexes.length ;i++) x[i]= t.get(indexes[i]);
				new Tuple(x);
				return it.next();
			}
		};
	}

	@Override
	public void execut() {
		// TODO Auto-generated method stub
		
	}
}
