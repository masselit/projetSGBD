package modele.karnel.state.full;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel.Schema;
import modele.karnel._Schema;
import modele.karnel.state.StateFullRelation;
import modele.karnel.tuple.Tuple;

public class StateFullInMemoryRelation extends StateFullRelation {
	private static int key=0;
	private Map<Integer,Tuple> map;
	
	public StateFullInMemoryRelation(Bdd bd, String nom, _Schema schema) {
		super(bd,nom,schema);
		map = new HashMap<>();
	}
	
	@Override
	public void add(Tuple tup) {
		map.put( key++, tup);
	}

	@Override
	public void supp(ClePrimaire cp) {
		// TODO Auto-generated method stub
	}
	
//	public Tuple get(int key){
//		return map.get(key);
//	}
	
	public void close(){
		
	}
	
	public void flush(){
		
	}
	
	
	public Long cardinalite() {return (long) map.size();}
	

	@Override public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Tuple> it = map.values().iterator();
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public Tuple next() {return it.next();}
		};
	}
}
