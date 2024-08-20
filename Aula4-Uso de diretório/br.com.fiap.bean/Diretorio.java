package br.com.fiap.bean;

import java.io.File;

public class Diretorio {
    private File dir;

    public Diretorio(){}

    public File getDir() {
        return dir;
    }

    public void setDir(File dir) {
        this.dir = dir;
    }

    //métodos
    public boolean criaDiretorio(){
            dir = new File("d:/loja");
            if(!dir.exists()){
                dir.mkdir();
                System.out.println("Pasta criada com sucesso");
                return true;
            }else{
                System.out.println("Falha ao criar pasta");
                return false;
            }
    }

    public void listaDiretorio(){
        if(dir.isDirectory()){
            System.out.println("Conteúdo da pasta: " + dir);
            String[] lista = dir.list();
            if (lista != null) {
                for (String item: lista){
                    System.out.println(item);
                }
            }
        }else{
            System.out.println("Caminho informado incorreto!");
        }
    }

    public void excluiDiretorio(){
        String msg = "";
        if(dir.isDirectory()){
            if(dir.delete()){
                msg = dir.getName() + " excluido com sucesso";
            }else{
                if(excluirFilhos(dir)){
                    msg = dir.getName() + " excluido com sucesso";
                }else{
                    msg = "Falha ao excluir a pasta: " + dir.getName();
                }
            }
            System.out.println(msg);
        }
    }

    private boolean excluirFilhos(File dir){
        if(dir.isDirectory()){
            String[] arquivos = dir.list();
            for(String item: arquivos){
                boolean sucesso = excluirFilhos(new File(dir,item));
                if(sucesso){
                    System.out.println("Excluido: " + item);
                }else{
                    System.out.println("Incapaz de excluir");
                    return false;
                }
            }
        }
        return dir.delete();
    }
}
