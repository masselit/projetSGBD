package modele.karnel.state.full;

import java.util.Iterator;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel._Schema;
import modele.karnel.state.StateFullRelation;
import modele.karnel.tuple.Tuple;

public class StateFullInFileRelation extends StateFullRelation{



	public StateFullInFileRelation(Bdd bd, String nom, _Schema schema) {
		super(bd, nom, schema);
		
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
	@Override
	public Iterator<Tuple> iterator() {
		// TODO Auto-generated method stub
		return null;
	}
}
