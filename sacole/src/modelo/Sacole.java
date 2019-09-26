/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;
 import java.time.LocalDate;
/**
 *
 * @author Administrador
 */
public class Sacole {
    private Integer codigo;
    private Integer nr_de_serie;
    private Double preco;
     private LocalDate data_de_validade;
    private String sabor;

    public Integer getCodigo() {
        return codigo;
    }

    public void setCodigo(Integer codigo) {
        this.codigo = codigo;
    }

    public Integer getNr_de_serie() {
        return nr_de_serie;
    }

    public void setNr_de_serie(Integer nr_de_serie) {
        this.nr_de_serie = nr_de_serie;
    }

    public Double getPreco() {
        return preco;
    }

    public void setPreco(Double preco) {
        this.preco = preco;
    }

    public LocalDate getData_de_validade() {
        return data_de_validade;
    }

    public void setData_de_validade(LocalDate data_de_validade) {
        this.data_de_validade = data_de_validade;
    }

    public String getSabor() {
        return sabor;
    }

    public void setSabor(String sabor) {
        this.sabor = sabor;
    }

    @Override
    public String toString() {
        return "Sacole{" + "sabor=" + sabor + '}';
    }

    
    
}
