package modele.karnel;

import modele.type.TypeSGBD;

/**
 * 
 * @author Thibaut Masselin
 *
 */

public class Attribut<T extends TypeSGBD<?>> {
	protected String libelle;
	protected TypeSGBD<T> type;
	
	public Attribut(String libelle, TypeSGBD<T> type){
		this.libelle = libelle;
		this.type = type;
	}
	
	public boolean isClePrimaire(){
		return false;
	}
	
	public String getName(){
		return libelle;
	}
	
	public Attribut<T> clone(Attribut<T> attr){
		return null;
	}
	
	public boolean equal(Attribut<T> att) {
		if ((this.libelle == att.libelle) && (this.type == att.type)) {
			return 1;
		}
		return 0;
	}
}
