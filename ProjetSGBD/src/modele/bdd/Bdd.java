package modele.bdd;

import java.util.HashMap;
import java.util.Map;

import modele.karnel.state.StateFullRelation;

public class Bdd {
	private final Map<String,StateFullRelation> relations = new HashMap<>();
	
	public void add(StateFullRelation r){ relations.put(r.nom(), r);}
	
	public StateFullRelation get(String nom){
		return relations.get(nom);
	}
}
