package modele.karnel.tuple;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.util.Iterator;

import modele.type.BooleanSGBD;
import modele.type.ByteSGBD;
import modele.type.CharacterSGBD;
import modele.type.DoubleSGBD;
import modele.type.FloatSGBD;
import modele.type.IntegerSGBD;
import modele.type.LongSGBD;
import modele.type.ShortSGBD;
import modele.type.StringSGBD;
import modele.type.TypeSGBD;

public class Tuple implements Iterable<Object>{

	private final Object[] valeurs;
	
	public Tuple(Object... valeurs){
		this.valeurs = valeurs;
	}

	public void serialisation(DataOutputStream os){
		for(Object o : this){
			try {
				if(o.getClass().isInstance(IntegerSGBD.TYPE)){
					IntegerSGBD.TYPE.serialisation(os, (Integer) o);
					
				}else if(o.getClass().isInstance(BooleanSGBD.TYPE)){
					BooleanSGBD.TYPE.serialisation(os, (Boolean) o);
					
				}else if(o.getClass().isInstance(CharacterSGBD.TYPE)){
					CharacterSGBD.TYPE.serialisation(os, (Character) o);
					
				}else if(o.getClass().isInstance(ByteSGBD.TYPE)){
					ByteSGBD.TYPE.serialisation(os, (Byte) o);
					
				}else if(o.getClass().isInstance(DoubleSGBD.TYPE)){
					DoubleSGBD.TYPE.serialisation(os, (Double) o);
					
				}else if(o.getClass().isInstance(LongSGBD.TYPE)){
					LongSGBD.TYPE.serialisation(os, (Long) o);
					
				}else if(o.getClass().isInstance(ShortSGBD.TYPE)){
					ShortSGBD.TYPE.serialisation(os, (Short) o);
					
				}else if(o.getClass().isInstance(FloatSGBD.TYPE)){
					FloatSGBD.TYPE.serialisation(os, (Float) o);
					
				}else if(o.getClass().isInstance(StringSGBD.TYPE)){
					StringSGBD.TYPE.serialisation(os, (String) o);
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deserialisation(DataInputStream is){
		int i =0;
		try{
			while(is.available()>0){
				TypeSGBD<?> obj = (TypeSGBD<?>) new Object();
				valeurs[i++] = obj.deserialisation(is);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Iterator<Object> iterator() {
		return new Iterator<Object>() {
			private int index = 0;
			@Override public boolean hasNext() {return index<valeurs.length;}
			@Override public Object next() {return valeurs[index++];}
		};
	}

	public Object get(int i) {
		return valeurs[i];
	}

}
