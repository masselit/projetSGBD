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
				if(o.getClass().equals(Integer.class)){
					IntegerSGBD.TYPE.serialisation(os, (Integer) o);
					
				}else if(o.getClass().equals(Boolean.class)){
					BooleanSGBD.TYPE.serialisation(os, (Boolean) o);
					
				}else if(o.getClass().equals(Character.class)){
					CharacterSGBD.TYPE.serialisation(os, (Character) o);
					
				}else if(o.getClass().equals(Byte.class)){
					ByteSGBD.TYPE.serialisation(os, (Byte) o);
					
				}else if(o.getClass().equals(Double.class)){
					DoubleSGBD.TYPE.serialisation(os, (Double) o);
					
				}else if(o.getClass().equals(Long.class)){
					LongSGBD.TYPE.serialisation(os, (Long) o);
					
				}else if(o.getClass().equals(Short.class)){
					ShortSGBD.TYPE.serialisation(os, (Short) o);
					
				}else if(o.getClass().equals(Float.class)){
					FloatSGBD.TYPE.serialisation(os, (Float) o);
					
				}else if(o.getClass().equals(String.class)){
					StringSGBD.TYPE.serialisation(os, (String) o);
				}else{
					System.out.println("rien");
				}
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}
	
	public void deserialisation(DataInputStream is){
		int i =0;
		try{
			System.out.println("toto");
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

}
