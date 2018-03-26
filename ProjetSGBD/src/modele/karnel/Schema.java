package modele.karnel;

import java.util.ArrayList;
import java.util.List;

import modele.type.TypeSGBD;

public class Schema implements _Schema{
	private String nomDeLaRelation;
	private List<Attribut> attribut;
	private ClePrimaire clePrimaire;
	
	public Schema(String nomDeLaRelation){
		this.attribut = new ArrayList<Attribut>();
		this.nomDeLaRelation = nomDeLaRelation;
	}
}