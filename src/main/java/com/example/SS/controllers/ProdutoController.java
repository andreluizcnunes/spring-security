package com.example.SS.controllers;

import com.example.SS.entities.Produto;
import com.example.SS.servicies.ProdutoService;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("api/v1/produto")
public class ProdutoController {

    private final ProdutoService produtoService;

    public ProdutoController(ProdutoService produtoService) {
        this.produtoService = produtoService;
    }

    @PostMapping
    public Produto createProduto(@RequestBody Produto produto) {
        return produtoService.createProduto(produto);
    }

    @GetMapping
    public List<Produto> getAllProdutos() {
        return produtoService.getAllProdutos();
    }

    @GetMapping("{id}")
    public Optional<Produto> getProdutoById(@PathVariable Long id) {
        return produtoService.getProdutoById(id);
    }

    @PutMapping("{id}")
    public Produto updateProduto(@PathVariable Long id, @RequestBody Produto produto) {
        return produtoService.updateProduto(id, produto);
    }

    @DeleteMapping("{id}")
    public void deleteProduto(@PathVariable Long id) {
        produtoService.deleteProduto(id);
    }
}
