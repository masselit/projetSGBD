package modele.karnel.state.less;

import java.util.Iterator;

import modele.karnel._Relation;
import modele.karnel._Schema;
import modele.karnel.tuple.Tuple;

public class Intersection extends StateLessRelationBinaire {

	
	public Intersection (String nom, _Schema schema, _Relation relation1,_Relation relation2){
		super("intersection(" + nom, schema, relation2, relation2);
		
	}
	@Override
	public void execut() {
		
	}
	@Override
	public Iterator<Tuple> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
