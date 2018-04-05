package modele.karnel.state.full;

import java.util.Iterator;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel._Schema;
import modele.karnel.state.StateFullRelation;
import modele.karnel.tuple._Tuple;

public class StateFullInMemoryRelation extends StateFullRelation {

	public StateFullInMemoryRelation(String str, _Schema sch, Bdd bd) {
		super(str, sch, bd);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void add(_Tuple tup) {
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
	
	public Iterator<_Tuple> iteration() {
		return null;
	}
	
	public Long cardinalite() {
		return null;
	}
	
	public _Tuple get(Comparable<?> compa){
		return null;
	}
	
	public _Tuple get(){
		return null;
	}
}
