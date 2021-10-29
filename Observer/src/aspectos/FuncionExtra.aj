package aspectos;
import java.awt.*;
import javax.swing.*;

public aspect FuncionExtra {
	pointcut comprobaryreiniciar() : 
		call (void tarea.Main.intro(..));
	
	before():comprobaryreiniciar() {
		Object[] nombreChido = thisJoinPoint.getArgs();
		
		if(((JTextField) nombreChido[2]).getText().toLowerCase().equals(((String)nombreChido[1]).toLowerCase())) {
			System.out.println("El color es correcto. Buena percepcion!");
		}else {
			
			throw new RuntimeException("ese no es el color correcto");
   		}
		
		
	}
}
