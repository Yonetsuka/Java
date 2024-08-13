package br.com.fiap.main;

import javax.swing.*;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class PokemonHashMap {
    public static void main(String[] args) {
        HashMap<String,String> pokedex = new HashMap<String,String>();
        do{
            try{
                String nome,tipo;
                do{
                    nome = JOptionPane.showInputDialog(null,"Coloque o nome do pokémon!(Coloque \"FIM\" " +
                            "para finalizar) ");
                    if(!nome.equals("FIM")){
                        tipo = JOptionPane.showInputDialog(null,"Coloque o tipo do pokémon anterior!");
                        if(pokedex.containsKey(nome)){
                            JOptionPane.showMessageDialog(null,"Pokémon já cadastrado");
                        }else{
                            pokedex.put(nome,tipo);
                        }
                    }
                }while(!nome.equals("FIM"));
                String escolha = JOptionPane.showInputDialog(null,"Digite um tipo de pokémon");
                List<String> pokemonsTipo = new ArrayList<String>();
                if(pokedex.containsValue(escolha)){
                    for(String i: pokedex.keySet()){
                        if(pokedex.get(i).equalsIgnoreCase(escolha)){
                            pokemonsTipo.add(i);
                        }
                    }
                    JOptionPane.showMessageDialog(null,"Os pokémons são: " + pokemonsTipo);
                }else{
                    JOptionPane.showMessageDialog(null,"Não tem pokémons com esse tipo");
                }
            }catch(Exception e){
                JOptionPane.showMessageDialog(null,e.getMessage());
            }
        }while(JOptionPane.showConfirmDialog(null,"Deseja continuar ?","Atenção",
                JOptionPane.YES_NO_OPTION,JOptionPane.QUESTION_MESSAGE)==0);
        JOptionPane.showMessageDialog(null,"Fim do programa");
    }
}
