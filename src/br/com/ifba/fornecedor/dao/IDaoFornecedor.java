/**
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.fornecedor.dao;

import br.com.ifba.fornecedor.model.Fornecedor;
import br.com.ifba.infrastructure.basedao.IBaseDao;
import java.util.List;

/**
 *
 * @author Everton
 */
public interface IDaoFornecedor extends IBaseDao<Fornecedor>{
    
    public abstract List<Fornecedor> findByName(String name);
}
