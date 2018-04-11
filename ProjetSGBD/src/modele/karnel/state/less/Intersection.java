package modele.karnel.state.less;

import java.util.Iterator;

import modele.karnel._Relation;
import modele.karnel._Schema;
import modele.karnel.tuple.Tuple;

public class Intersection extends StateLessRelationBinaire {

	
	
	protected Intersection(String nom, _Schema schema, _Relation r1, _Relation r2) {
		super(nom, schema, r1, r2);
		// TODO Auto-generated constructor stub
	}
	@Override
	public void execut() {
		
	}
	public Iterator<Tuple> iteration() {
		return null;
	}
	
	@Override
	public Iterator<Tuple> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
