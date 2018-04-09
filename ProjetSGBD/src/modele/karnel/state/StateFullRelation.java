package modele.karnel.state;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel.Relation;
import modele.karnel._Schema;
import modele.karnel.tuple.Tuple;

public abstract class StateFullRelation extends Relation {
	protected Bdd bd;
	
	public StateFullRelation(Bdd bd, String nom, _Schema schema ){
		super(nom,schema);
		this.bd = bd;
	}
	
	public abstract void add(Tuple tup);
	
	public abstract void supp(ClePrimaire cp);
}