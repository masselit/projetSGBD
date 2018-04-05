package modele.karnel.state;

import java.util.Map;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel.Relation;
import modele.karnel._Schema;
import modele.karnel.tuple.Tuple;

public abstract class StateFullRelation extends Relation {
	
	
	public StateFullRelation(String str, Bdd bd){
		
	}
	
	public abstract void add(Tuple tup);
	
	public abstract void supp(ClePrimaire cp);
}