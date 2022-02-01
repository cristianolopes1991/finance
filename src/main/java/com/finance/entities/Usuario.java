package com.finance.entities;

import org.springframework.lang.NonNull;

import javax.persistence.*;
import java.io.Serializable;
import java.util.*;

@Entity
@Table(name = "TB_USUARIO")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CO_ID_USUARIO")
    private int idUsuario;

    @NonNull
    @OneToMany(cascade=CascadeType.ALL, fetch=FetchType.EAGER)
    @JoinColumn(name = "CO_ID_USUARIO", referencedColumnName = "CO_ID_USUARIO")
    private Set<Trasacoes> trasacoes = new HashSet<>();

    public Usuario() {
    }

    public Usuario(int idUsuario, Set<Trasacoes> trasacoes) {
        super();
        this.idUsuario = idUsuario;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public Set<Trasacoes> getTrasacoes() {
        return trasacoes;
    }

    public void setTrasacoes(Set<Trasacoes> trasacoes) {
        this.trasacoes = trasacoes;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Usuario usuario = (Usuario) o;
        return idUsuario == usuario.idUsuario && Objects.equals(trasacoes, usuario.trasacoes);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idUsuario, trasacoes);
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "idUsuario=" + idUsuario +
                ", trasacoes=" + trasacoes +
                '}';
    }

}
