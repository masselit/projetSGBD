package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class CharacterSGBD extends TypeSGBD<Character> {

	@Override
	public void serialisation(DataOutputStream os, Character data) throws IOException {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Character deserialisation(DataInputStream is) throws IOException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Character parse(String data) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int taille() {
		// TODO Auto-generated method stub
		return 0;
	}

}
