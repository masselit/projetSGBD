package modele.karnel;

import java.util.ArrayList;
import java.util.List;

import modele.type.TypeSGBD;

public class Schema implements _Schema{
	private final String nomDeLaRelation;
	private final Attribut<TypeSGBD<?>>[] attribut;
	private ClePrimaire clePrimaire;
	
	public Schema(String nomDeLaRelation,Attribut<TypeSGBD<?>>...attributs ){
		this.attribut =attributs ;
		this.nomDeLaRelation = nomDeLaRelation;
	}
}