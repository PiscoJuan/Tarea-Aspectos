package aspectos;

public aspect Observer {
	pointcut printColor() : 
		call (void tarea.Main.method*(..));
	
	after():printColor() {
		String Name = thisJoinPoint.getSignature().getName();
		if(Name.equals("method1")) {
			System.out.println("CYAN");
		}else if(Name.equals("method2")){
			System.out.println("MAGENTA");
		}else {
			System.out.println("AMARILLO");
		}
	}
}
