package controleur;

import modele.karnel.Attribut;
import modele.karnel.ClePrimaire;
import modele.karnel.Schema;
import modele.karnel._Schema;
import modele.type.IntegerSGBD;
import modele.type.StringSGBD;

public class Main {

	public static void main(String[] args) {
		
		Attribut atr1 = new Attribut("",new StringSGBD());
		Attribut atr2 = new Attribut("",new StringSGBD());
		Attribut cle = new ClePrimaire("",new IntegerSGBD());
		_Schema sch = new Schema("relation N1",atr1,atr2,cle);
		
	}

}
