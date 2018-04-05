package modele.karnel.state;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel.Relation;
import modele.karnel._Schema;
import modele.karnel.tuple._Tuple;

public abstract class StateFullRelation extends Relation {
	
	public StateFullRelation(String str,_Schema sch, Bdd bd){

	}
	
	public StateFullRelation(String str, Bdd bd){
		
	}
	
	public abstract void add(_Tuple tup);
	
	public abstract void supp(ClePrimaire cp);
}