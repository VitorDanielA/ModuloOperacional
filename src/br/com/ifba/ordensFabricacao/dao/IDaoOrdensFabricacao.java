/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.ordensFabricacao.dao;

import br.com.ifba.infrastructure.basedao.IBaseDao;
import br.com.ifba.ordensFabricacao.model.OrdensFabricacao;
import java.util.List;

/**
 *
 * @author Everton
 */
public interface IDaoOrdensFabricacao extends IBaseDao<OrdensFabricacao> {
     public abstract List<OrdensFabricacao> findByName(String name);
}
