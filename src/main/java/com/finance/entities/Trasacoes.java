package com.finance.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "TB_TRANSACOES")
public class Trasacoes implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_ID_TRANSACAO")
    private int idTransacao;

    @NonNull
    @Column(name = "CO_DATA_TRANSACAO")
    private Date data;

    @NonNull
    @Column(name = "CO_NOME_TRANSACAO")
    private String nomeTransacao;

    @Column(name = "CO_DESC_TRANSACAO")
    private String descTransacao;

    @NonNull
    @Column(name = "CO_VALOR_TRANSACAO")
    private double valor;

    @NonNull
    @Column(name = "CO_TIPO_TRANSACAO")
    private boolean tipoTransacao;

    @NonNull
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_ID_USUARIO")
    private int idUsuario;

    public Trasacoes() {
    }

    public int getIdTransacao() {
        return idTransacao;
    }

    public void setIdTransacao(int idTransacao) {
        this.idTransacao = idTransacao;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public String getNomeTransacao() {
        return nomeTransacao;
    }

    public void setNomeTransacao(String nomeTransacao) {
        this.nomeTransacao = nomeTransacao;
    }

    public String getDescTransacao() {
        return descTransacao;
    }

    public void setDescTransacao(String descTransacao) {
        this.descTransacao = descTransacao;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

    public boolean isTipoTransacao() {
        return tipoTransacao;
    }

    public void setTipoTransacao(boolean tipoTransacao) {
        this.tipoTransacao = tipoTransacao;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    @Override
    public String toString() {
        return "Trasacoes{" +
                "idTransacao=" + idTransacao +
                ", data=" + data +
                ", nomeTransacao='" + nomeTransacao + '\'' +
                ", descTransacao='" + descTransacao + '\'' +
                ", valor=" + valor +
                ", tipoTransacao=" + tipoTransacao +
                ", idUsuario=" + idUsuario +
                '}';
    }

}
