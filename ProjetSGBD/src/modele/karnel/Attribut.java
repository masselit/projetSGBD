package modele.karnel;

import modele.type.TypeSGBD;

/**
 * Permet de definir le nom et le type
 *
 */

public class Attribut {
	/**
	 * Attributs
	 */
	protected String libelle;
	protected TypeSGBD<?> type;
	
	
	/**
	 * Constucteur d'Attribut
	 * @param libelle sous la forme d'un string
	 * @param type
	 */
	public Attribut(String libelle, TypeSGBD<?> type){
		this.libelle = libelle;
		this.type = type;
	}
	
	/**
	 * Renvoie le type de l'Attribut
	 * @return un fils de TypeSGBD
	 */
	public TypeSGBD<?> getType() {
		return type;
	}
	
	/**
	 * Renvoie le nom de l'Attribut
	 * @return un String
	 */
	public String getName(){
		return libelle;
	}
	
	/**
	 * Test l'égalité entre deux Attributs
	 * @param att est un Attribut
	 * @return vrai si les attribut ont le même nom et le même type
	 */
	public boolean equal(Attribut att) {
		if ((this.libelle.equals(att.libelle)) && (this.type == att.type)) {
			return true;
		}
		return false;
	}
	
	/**
	 * Renvoie la taille du type
	 * @return la taille sous fomre de long
	 */
	public long size(){
		return type.taille();
	}
	
	
}
