package com.example.SS.serviciesImplements;

import com.example.SS.entities.Produto;

import java.util.List;
import java.util.Optional;

public interface ProdutoImp {

    public Produto createProduto(Produto produto);
    public List<Produto> getAllProdutos();
    public Optional<Produto> getProdutoById(Long id);
    public Produto updateProduto(Long id, Produto produto);
    public void deleteProduto(Long id);
}
