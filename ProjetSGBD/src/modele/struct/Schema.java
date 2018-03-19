package modele.struct;

import java.util.ArrayList;
import java.util.List;

public class Schema {
	private String nomDeLaRelation;
	private List<Attribut> attribut;
	private ClePrimaire clePrimaire;
	
	public Schema(String nomDeLaRelation){
		this.attribut = new ArrayList<Attribut>();
		this.nomDeLaRelation = nomDeLaRelation;
	}
}
