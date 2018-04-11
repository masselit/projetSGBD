package modele.karnel.state.less;

import java.util.Iterator;

import modele.karnel._Relation;
import modele.karnel.tuple.Tuple;

public class Identite extends StateLessRelationUnaire {

	public Identite(_Relation r) {
		super("identite("+r.nom(), r.schema(), r);
	}

	@Override
	public void execut() {
		
	}

	@Override
	public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Tuple> it = r.iterator();
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public Tuple next() {return it.next();}
		};
	}
}
