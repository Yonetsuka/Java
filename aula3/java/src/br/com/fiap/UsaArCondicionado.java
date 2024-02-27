package from br.com.fiap;

public class UsaArCondicionado{

    public static void main(String[] args) {
    		// TODO Auto-generated method stub
    		ArCondicionado arCondicionado1 = new ArCondicionado();
    		
    		arCondicionado1.temperatura = 30;
    		arCondicionado1.modo = "Ligado";
    		
    		
    		arCondicionado1.aumentarTemperatura();
    		arCondicionado1.trocarModo("Desligado");
    		arCondicionado1.mostrar();
    		
    		arCondicionado1.trocarModo("Ligado");
    		arCondicionado1.aumentarTemperatura();
    		arCondicionado1.aumentarTemperatura();
    		arCondicionado1.aumentarTemperatura();
    		arCondicionado1.mostrar();
    		
    	}

}
