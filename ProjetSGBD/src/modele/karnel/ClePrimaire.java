package modele.karnel;


import modele.type.IntegerSGBD;
import modele.type.TypeSGBD;

public class ClePrimaire extends Attribut<TypeSGBD> {
	private TypeSGBD<IntegerSGBD> clePrimaire;
	
	public ClePrimaire(IntegerSGBD clePrimaire){
		this.clePrimaire =(TypeSGBD) clePrimaire;
	}
	
	
	
}
