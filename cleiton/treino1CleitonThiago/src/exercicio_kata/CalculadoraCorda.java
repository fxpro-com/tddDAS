package exercicio_kata;

import java.util.ArrayList;
import java.util.List;

public class CalculadoraCorda {
	
	ArrayList<String> calcCorda = new ArrayList<String>();

	public int Add(String string1) {
		calcCorda.add(string1);
		
		if(string1 == "")
			return 0;
		
		return Integer.parseInt(string1);
		
		
	}

}
