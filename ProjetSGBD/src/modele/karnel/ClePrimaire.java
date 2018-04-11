package modele.karnel;


import java.util.Map;
import java.util.TreeMap;

/**
 * D�finit une cl� primaire
 *
 */
public class ClePrimaire {
	/**
	 * Attribut statique stock toutes les cl�s primaires
	 */
	private final static Map<Integer,String> key = new TreeMap<>();
	
	/**
	 * Constructeur de la cl� primaire
	 * @param nameRelation
	 * @param key
	 * @throws Exception si la cl� existe d�j�
	 */
	public ClePrimaire(String nameRelation,int key) throws Exception{
		if(uniqueKey(key,nameRelation)){
			ClePrimaire.key.put(key,nameRelation);
		}else{
			throw new IllegalArgumentException("Erreur Cl� d�j� pr�sente");
		}
	}
	
	/**
	 * Garentie que chaque cl� prmaire est unique dans �a relation
	 * @param key
	 * @param relation
	 * @return true si la cl� primaire n'exite pas et faux si il exite d�j�
	 */
	private boolean uniqueKey(int key,String relation){
		if(ClePrimaire.key.containsKey(key) && ClePrimaire.key.get(key).equals(relation)){
			return false;
		}else{
			return true;
		}
		
	}
	
	
}
