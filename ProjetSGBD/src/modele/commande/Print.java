package modele.commande;

import modele.karnel._Relation;
import modele.karnel.tuple.Tuple;

public class Print implements Commande{
	private final _Relation r;
	public Print(_Relation r) {
		this.r=r;
	}
	public void execute(){
		for(Tuple t : r){
			for(Object o : t){
				System.out.print(o+" ");
			}
			System.out.println();
		}
	}
}
