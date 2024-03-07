package br.com.fiap;

import java.util.Scanner;

public class TesteArCondicionadoEncapsulada(){
  public static void main(String[] args) {
    while(true){
  		ArCondicionadoEncapsulado arCondicionado1 = new ArCondicionadoEncapsulado();
      Scanner scan;
      int resposta;
      String modo;
      try {
          			scan = new Scanner(System.in);
          			System.out.println("Mudar de modo(1) ");
                System.out.println("Aumentar a temperatura(2) ");
                System.out.println("Diminuir a temperatura(3) ");
                resposta = scan.nextInt();
                if(resposta == 1){
                  System.out("Digite o modo do ar condicionado(Ventilar, Aquecer, Resfriar): ");
                  resposta = scan.nextString();
                  arCondicionado1.trocarModo(resposta);
                  arCondicionado1.mostrar();
                }
                else if(resposta == 2){
                  arCondicionado1.aumentarTemperatura();
                  System.out("Temperatura aumentada");
                  arCondicionado1.mostrar();
                }
                else if(resposta == 2){
                  arCondicionado1.diminuirTemperatura();
                  System.out("Temperatura diminuida");
                  arCondicionado1.mostrar();
                }
          }
      catch (Exception e) {
          			// TODO: handle exception
          			System.out.println("Formato incorreto");
          }
  }
 }
}
