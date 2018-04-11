package modele.karnel.state.full;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

import modele.bdd.Bdd;
import modele.karnel.ClePrimaire;
import modele.karnel._Schema;
import modele.karnel.state.StateFullRelation;
import modele.karnel.tuple.Tuple;

/**
 * Création d'une relation dans un fichier
 *
 */
public class StateFullInFileRelation extends StateFullRelation{

	private static int key = 0;
	private String url;
	private DataOutputStream dos;
	private DataInputStream dis;
	private RandomAccessFile file;
	private Map<Integer,Long> tuples = new TreeMap<>();

	/**
	 * Constructeur d'une relation et qui créer un fichier pour stocker la relation
	 * @param bd définit la base de données 
	 * @param nom définit le nom de la relation
	 * @param schema définit le schéma de la relation
	 */
	public StateFullInFileRelation(Bdd bd, String nom, _Schema schema) {
		super(bd, nom, schema);
		this.url ="./src/filesDonnees/"+this.nom()+".tuples";
		try {
			this.file = new RandomAccessFile(new File(url), "rws");
			dos = new DataOutputStream(new FileOutputStream(new File(url)));
			dis = new DataInputStream(new FileInputStream(new File(url)));
		} catch (FileNotFoundException e) {
			System.err.println("Impossible de créer la relation :" + e.getMessage());
			//e.printStackTrace();
		}
		
	}
	
	/**
	 * La cardinalité
	 * @return la taille de la relation
	 */
	public Long cardinalite() {
		return (long) tuples.size();
	}
	
	/**
	 * Permet d'ajouter un Tuple dans un fichier
	 * @parm tup ajoute un nouveau tuple dans la relation
	 */
	@Override public void add(Tuple tup) {
		tup.serialisation(dos);
		tuples.put(key++,key * this.schema().sizeTuple());//pour savoir a quelle emplacement regarder
		
	}

	@Override
	public void supp(ClePrimaire cp) {
		
	}
	
	
	/**
	 * Permet de parcourir plus facilement la relation
	 * @return Un itérator de Tuple
	 */
	@Override public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Long> it = tuples.values().iterator();
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public Tuple next() {
				it.next();
				return new Tuple().deserialisation(dis, schema());}
		};
	}
}
