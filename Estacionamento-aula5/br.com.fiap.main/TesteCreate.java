package br.com.fiap.main;

import java.sql.Connection;

public class TesteCreate{
  public static void main(String[] args){
    Connection con = ConnectionFactory.abrirConexao();

    Carro carro = new Carro();
    carro.setPlaca("KFSFV7658");
    carro.setCor("Vermelho");
    carro.setDescricao("Nissan Kicks");

    CarroDAO carroDAO = new CarroDAO(con);
    System.out.,println(carroDAO.inserir());
    
    ConnectionFactory.fecharCOnexao(con);
  }
}
