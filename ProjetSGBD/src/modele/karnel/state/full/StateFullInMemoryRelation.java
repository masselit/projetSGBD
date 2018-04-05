package modele.karnel.state.full;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel.state.StateFullRelation;
import modele.karnel.tuple.Tuple;

public class StateFullInMemoryRelation extends StateFullRelation {

	private Map<Integer,Tuple> map;
	
	public StateFullInMemoryRelation(String str,Bdd bd) {
		super(str, bd);
		map = new HashMap<>();
	}
	
	@Override
	public void add(Tuple tup) {
		map.put(map.size()+1, tup);
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
