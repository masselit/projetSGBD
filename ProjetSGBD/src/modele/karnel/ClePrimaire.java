package modele.karnel;


import modele.type.TypeSGBD;

public class ClePrimaire extends Attribut<TypeSGBD<?>> {
	
	public ClePrimaire(String libelle, TypeSGBD type) {
		super(libelle, type);
		
	}
	
	@Override
	public boolean isClePrimaire(){
		return true;
	}
	
}
