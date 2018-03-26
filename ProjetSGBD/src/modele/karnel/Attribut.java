package modele.karnel;

import modele.type.TypeSGBD;

/**
 * 
 * @author Thibaut Masselin
 *
 */

public class Attribut<T extends TypeSGBD<?>> {
	protected String libelle;
	protected TypeSGBD type;
	
	public String toString(){
		return null;
	}
	
	public Attribut<T> clone(Attribut<T> attr){
		return null;
	}
}
