
public class basicos {

 
    public static void cadenas() {
    	 String cadena;
         cadena="HolaMundo";
         System.out.println(cadena);
     }
	public static void logicos() {
		boolean logic=true;
		if(logic=true) {
			System.out.println("Verdadero");
		}
		else {
			System.out.println("false");
		}

	}


           //Mostrar en pantalla el contendido de las variables de tipos b�sicos.
           
           
          
	  /**
     * M�todo para mostrar ejemplos de tipos numericos.
     */
    
    public static void numericos() {

        //Estos son los tipos b�sicos
        byte elMasPeque;
        short chiquitin;
        int entero;
        long duplicaEntero;
        float grande;
        double doble;

        //Ejemplos de asignaci�n de valores a las variables de tipos b�sicos
        entero = 10;
        doble = 5.6;

        //Mostrar en pantalla el contendido de las variables de tipos b�sicos.
        System.err.println("Valor entero");
        System.out.println(entero);
        System.out.println("Valor doble");
        System.out.println(doble);
    }

  
public static void main(String[] args) {
	// TODO Auto-generated method stub
	 numericos();  // Llamada al m�todo
	 cadenas();
}
}

