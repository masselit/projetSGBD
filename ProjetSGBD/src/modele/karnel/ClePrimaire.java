package modele.karnel;


import java.util.Map;
import java.util.TreeMap;

/**
 * Définit une clé primaire
 *
 */
public class ClePrimaire {
	/**
	 * Attribut statique stock toutes les clés primaires
	 */
	private final static Map<Integer,String> key = new TreeMap<>();
	
	/**
	 * Constructeur de la clé primaire
	 * @param nameRelation
	 * @param key
	 * @throws Exception si la clé existe déjà
	 */
	public ClePrimaire(String nameRelation,int key) throws Exception{
		if(uniqueKey(key,nameRelation)){
			ClePrimaire.key.put(key,nameRelation);
		}else{
			throw new IllegalArgumentException("Erreur Clé déjà présente");
		}
	}
	
	/**
	 * Garentie que chaque clé prmaire est unique dans ça relation
	 * @param key
	 * @param relation
	 * @return true si la clé primaire n'exite pas et faux si il exite déjà
	 */
	private boolean uniqueKey(int key,String relation){
		if(ClePrimaire.key.containsKey(key) && ClePrimaire.key.get(key).equals(relation)){
			return false;
		}else{
			return true;
		}
		
	}
	
	
}
