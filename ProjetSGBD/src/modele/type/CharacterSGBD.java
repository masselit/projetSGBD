package modele.type;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;

public class CharacterSGBD extends TypeSGBD<Character> {
	public static final CharacterSGBD TYPE = new CharacterSGBD();
	private CharacterSGBD() { }
	
	@Override
	public void serialisation(DataOutputStream os, Character data) throws IOException {
		os.writeChar(data);
		
	}

	@Override
	public Character deserialisation(DataInputStream is) throws IOException {
		return is.readChar();
	}

	@Override
	public Character parse(String data) {
		Character c = data.charAt(0);
		return c;
	}

	@Override
	public int taille() {
		return 1;
	}
	
	public int compare(char a,char b) {
		return Character.compare(a,b);
	}
}
