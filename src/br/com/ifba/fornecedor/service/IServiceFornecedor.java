/**w
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.fornecedor.service;
import br.com.ifba.fornecedor.model.Fornecedor;
import java.util.List;
/**
 *
 * @author Everton
 */
public interface IServiceFornecedor {
    public abstract Fornecedor saveFornecedor(Fornecedor fornecedor);
    public abstract Fornecedor updateFornecedor(Fornecedor fornecedor);
    public abstract void deleteFornecedor(Fornecedor fornecedor);
    public abstract List<Fornecedor> getAllFornecedor();
    public List<Fornecedor> findByNameFornecedor(String name);
    public Fornecedor findByIdFornecedor(Long id);
}
