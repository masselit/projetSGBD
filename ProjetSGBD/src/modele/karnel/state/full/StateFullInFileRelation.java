package modele.karnel.state.full;

import java.util.Iterator;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel._Schema;
import modele.karnel.state.StateFullRelation;
import modele.karnel.tuple.Tuple;

public class StateFullInFileRelation extends StateFullRelation{

	public StateFullInFileRelation(String str, _Schema sch, Bdd bd) {
		super(str, bd);
		// TODO Auto-generated constructor stub
	}
	public StateFullInFileRelation(String str, Bdd bd) {
		super(str, bd);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void add(Tuple tup) {
		// TODO Auto-generated method stub
	}

	@Override
	public void supp(ClePrimaire cp) {
		// TODO Auto-generated method stub
	}
	
	public void close(){
		
	}
	
	public void flush(){
		
	}
	
	public Iterator<Tuple> iteration() {
		return null;
	}
	
	public Long cardinalite() {
		return null;
	}
	
	public Tuple get(Comparable<?> compa){
		return null;
	}
	
	public Tuple get(){
		return null;
	}
}
