package com.example.SS.servicies;

import com.example.SS.entities.Produto;
import com.example.SS.repositories.ProdutoRepository;
import com.example.SS.serviciesImplements.ProdutoImp;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ProdutoService implements ProdutoImp {

    private final ProdutoRepository produtoRepository;

    public ProdutoService(ProdutoRepository produtoRepository) {
        this.produtoRepository = produtoRepository;
    }

    @Override
    public Produto createProduto(Produto produto) {
        return produtoRepository.save(produto);
    }

    @Override
    public List<Produto> getAllProdutos() {
        return produtoRepository.findAll();
    }

    @Override
    public Optional<Produto> getProdutoById(Long id) {
        return produtoRepository.findById(id);
    }

    @Override
    public void deleteProduto(Long id) {
        produtoRepository.deleteById(id);
    }

    @Override
    public Produto updateProduto(Long id, Produto produto) {
        return produtoRepository.save(produto);
    }
}
