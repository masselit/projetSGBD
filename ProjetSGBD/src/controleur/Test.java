package controleur;
import modele.bdd.Bdd;
import modele.commande.Print;
import modele.karnel.Attribut;
import modele.karnel.Schema;
import modele.karnel._Schema;
import modele.karnel.state.StateFullRelation;
import modele.karnel.state.full.StateFullInFileRelation;
import modele.karnel.state.full.StateFullInMemoryRelation;
import modele.karnel.state.less.Identite;
import modele.karnel.state.less.Intersection;
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
		//StateFullRelation r = new StateFullInMemoryRelation(bd, "RELATION", schema);
		StateFullRelation r = new StateFullInFileRelation(bd,"RELATION",schema);
		StateFullRelation r2 = new StateFullInFileRelation(bd,"RELATION2",schema);
		
		bd.add(r);
		bd.get("RELATION").add(new Tuple(123,"MORAT"));
		bd.get("RELATION").add(new Tuple(1234,"MASSELIN"));
		bd.get("RELATION").add(new Tuple(12434,"DERVIEUX"));
		
		bd.add(r2);
		bd.get("RELATION2").add(new Tuple(123,"MORAT"));
		bd.get("RELATION2").add(new Tuple(1235,"VOSSIER"));
		bd.get("RELATION2").add(new Tuple(12435,"HERESAZ"));
		
		//new Print(bd.get("RELATION")).execute();
		
		System.out.println("\n -- IDENTITE RELATION :");
		new Print(new Identite(bd.get("RELATION"))).execute();
		
		System.out.println("\n -- PROJECTION C2 :");
		_Schema schema1 = new Schema(
				new Attribut("C2", StringSGBD.TYPE)
				);		
		new Print(new Projection(bd.get("RELATION"), schema1)).execute();

		System.out.println("\n -- PROJECTION C1 :");
		_Schema schema2 = new Schema(
				new Attribut("C1", IntegerSGBD.TYPE)
				);		
		new Print(new Projection(bd.get("RELATION"), schema2)).execute();
		
		System.out.println("\n -- PROJECTION C1:");
		
		new Print(new Projection(bd.get("RELATION"), new Schema(new Attribut("C1", bd.get("RELATION").schema().getTypeAttribut("C1"))))).execute();
		
		System.out.println("\n -- PROJECTION C1 et C2 :");	
		new Print(new Projection(bd.get("RELATION"), new Schema(new Attribut("C1", bd.get("RELATION").schema().getTypeAttribut("C1")),
																new Attribut("C2", bd.get("RELATION").schema().getTypeAttribut("C2"))) )).execute();
		
		System.out.println("\n -- INTERSECTION RELATION et RELATION2 :");	
		new Print(new Intersection(schema, bd.get("RELATION"), bd.get("RELATION2"))).execute();
	}

}
