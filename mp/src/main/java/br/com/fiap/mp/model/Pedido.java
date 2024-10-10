package br.com.fiap.model;

import java.math.BigDecimal;
import java.time.LocalDate;

public class Pedido{
  private String nomeProduto;
  private BigDecimal valorNegociado;
  private LocalDate dataDaEntrega;
  private String urlProduto;
  private String urlImagem;
  private String descricao;
  //criar getter e setters
  // Getters
    public String getNomeProduto() {
        return nomeProduto;
    }

    public BigDecimal getValorNegociado() {
        return valorNegociado;
    }

    public LocalDate getDataDaEntrega() {
        return dataDaEntrega;
    }

    public String getUrlProduto() {
        return urlProduto;
    }

    public String getUrlImagem() {
        return urlImagem;
    }

    public String getDescricao() {
        return descricao;
    }

    // Setters
    public void setNomeProduto(String nomeProduto) {
        this.nomeProduto = nomeProduto;
    }

    public void setValorNegociado(BigDecimal valorNegociado) {
        this.valorNegociado = valorNegociado;
    }

    public void setDataDaEntrega(LocalDate dataDaEntrega) {
        this.dataDaEntrega = dataDaEntrega;
    }

    public void setUrlProduto(String urlProduto) {
        this.urlProduto = urlProduto;
    }

    public void setUrlImagem(String urlImagem) {
        this.urlImagem = urlImagem;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }
}
