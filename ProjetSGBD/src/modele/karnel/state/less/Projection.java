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
	
	private final Attribut[] lesAttributSelect;
	
	public Projection(_Relation r, _Schema schema ){
		super("selection("+r.nom(),r.schema(), r);
		Attribut[] temp = new Attribut[schema.degre()];		
		for(int i = 0;i<schema.degre();i++){
			temp[i] = schema.ofIndex(i);
		}
		lesAttributSelect = temp;
	}
	
	@Override public Iterator<Tuple> iterator() {
		// TODO Auto-generated method stub
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
		// TODO Auto-generated method stub
		
	}
}
