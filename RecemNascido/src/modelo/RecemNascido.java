/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author Administrador
 */
public class RecemNascido {
    private Integer n_quarto;
    private String sexo;
    private String nome_mae;
    private Integer codigo;
    private Double peso;

    @Override
    public String toString() {
        return nome_mae;
    }

    public Integer getN_quarto() {
        return n_quarto;
    }

    public void setN_quarto(Integer n_quarto) {
        this.n_quarto = n_quarto;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getNome_mae() {
        return nome_mae;
    }

    public void setNome_mae(String nome_mae) {
        this.nome_mae = nome_mae;
    }

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Double getPeso() {
        return peso;
    }

    public void setPeso(Double peso) {
        this.peso = peso;
    }
}
