package calculadora;

public class Calculadora {
	
		
    public int sumar(int primero, int segundo) {
        return primero + segundo;
    }

    public int restar(int primero, int segundo) {
        return primero - segundo;
    }

    public int multiplicar(int multiplo, int multiplicando) {
        return multiplo * multiplicando;
    }

    public int dividir(int divisor, int dividendo) {
       try {
        return divisor / dividendo;
       }catch (Exception e) {
    	   e.printStackTrace();
    	   return 0;
       }
    }

    public double calcularAreaCirculo(double radio) {
        return Math.PI * radio * radio;
    }
    
    public double calcularVolumenCilindro(double radio, double altura) {
        return calcularAreaCirculo(radio) * altura;
    }

}
