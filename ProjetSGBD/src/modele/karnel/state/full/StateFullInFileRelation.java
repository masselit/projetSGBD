package modele.karnel.state.full;

import java.io.DataOutputStream;
import java.io.File;
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

public class StateFullInFileRelation extends StateFullRelation{

	private static int key = 0;
	private RandomAccessFile file;
	private Map<Integer,Long> tuples = new TreeMap<>();

	public StateFullInFileRelation(Bdd bd, String nom, _Schema schema) {
		super(bd, nom, schema);
		
		try {
			this.file = new RandomAccessFile(new File("src/filesDonnees/"+nom+".tuples"), nom);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	@Override public void add(Tuple tup) {
		
		try {
			tup.serialisation(new DataOutputStream(new FileOutputStream(file.getFD())));
			tuples.put(key++,file.getFilePointer());
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void supp(ClePrimaire cp) {
		// TODO Auto-generated method stub
	}
	
	
	@Override public Iterator<Tuple> iterator() {
		return new Iterator<Tuple>() {
			Iterator<Tuple> it ;
			@Override public boolean hasNext() {return it.hasNext();}
			@Override public Tuple next() {return it.next();}
		};
	}
}
