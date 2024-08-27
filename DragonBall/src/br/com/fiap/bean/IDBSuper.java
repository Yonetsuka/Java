package br.com.fiap.bean;

/**
 *  Interfafce para gravar cartas de dragon ball
 *  @author Cássio Eid Kobayashi Yonetsuka RM:99678
 *  @version 1.0
 */


public interface IDBSuper {
    public DragonBallSuper ler(String path);
    public String gravar(String path);
}
