package modele.karnel;

import modele.type.TypeSGBD;

/**
 * 
 * @author Thibaut Masselin
 *
 */

public class Attribut {
	protected String libelle;
	protected TypeSGBD<?> type;
	
	public Attribut(String libelle, TypeSGBD<?> type){
		this.libelle = libelle;
		this.type = type;
	}
	
	public boolean isClePrimaire(){
		return false;
	}
	
	public String getName(){
		return libelle;
	}
	
	public Attribut clone(Attribut attr){
		return null;
	}
	
	public boolean equal(Attribut att) {
		if ((this.libelle.equals(att.libelle)) && (this.type == att.type)) {
			return true;
		}
		return false;
	}
}
