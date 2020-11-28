/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import model.Produto;

/**
 *
 * @author Marcelo Saorim
 */
public class ProdutoDAO {
    
    
    public double valorTotalNoEstoque(Produto obj){
        int qtde = obj.getQtde();
        double valor = obj.getPreco();
        return qtde * valor;
    }
    
    public void addProduto(int qtde, Produto obj){
        int qtdeAnterior = obj.getQtde();
        obj.setQtde(qtde + qtdeAnterior);
    }
    
    public void remProduto(int qtde, Produto obj){
        int qtdeAnterior = obj.getQtde();
        obj.setQtde(qtdeAnterior - qtde);
    }
}
