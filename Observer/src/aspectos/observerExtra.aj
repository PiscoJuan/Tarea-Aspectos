package aspectos;

public aspect observerExtra {
	pointcut comprobaryreiniciar() : 
		call (void tarea.Main.intro(..));
	
	after():comprobaryreiniciar() {
		String Name = thisJoinPoint.getSignature().getName();
			System.out.println("El color es correcto, volviendo a color original");
	}
}
