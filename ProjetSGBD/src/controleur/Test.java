package controleur;
import modele.bdd.Bdd;
import modele.commande.Print;
import modele.karnel.Attribut;
import modele.karnel.Schema;
import modele.karnel._Schema;
import modele.karnel.state.StateFullRelation;
import modele.karnel.state.full.StateFullInMemoryRelation;
import modele.karnel.state.less.Identite;
import modele.karnel.state.less.Projection;
import modele.karnel.tuple.Tuple;
import modele.type.IntegerSGBD;
import modele.type.StringSGBD;

public class Test {

	public static void main(String[] args) {
		Bdd bd = new Bdd();
		
		_Schema schema = new Schema(
				new Attribut("C1", IntegerSGBD.TYPE),
				new Attribut("C2", StringSGBD.TYPE)
				);
		StateFullRelation r = new StateFullInMemoryRelation(bd, "RELATION", schema);
		bd.add(r);
		
		
		bd.get("RELATION").add(new Tuple(123,"MORAT"));
		bd.get("RELATION").add(new Tuple(1234,"MASSELIN"));
		bd.get("RELATION").add(new Tuple(12434,"DERVIEUX"));
		
		new Print(bd.get("RELATION")).execute();
		new Print(new Identite(bd.get("RELATION"))).execute();
		
		System.out.println("PROJECTION C1 :");
		_Schema schema1 = new Schema(
				new Attribut("C2", StringSGBD.TYPE)
				);		
		new Print(new Projection(bd.get("RELATION"), schema1)).execute();

		
	}

}
