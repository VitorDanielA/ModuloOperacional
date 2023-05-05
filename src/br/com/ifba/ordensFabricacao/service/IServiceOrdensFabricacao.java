/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.ordensFabricacao.service;
import br.com.ifba.ordensFabricacao.model.OrdensFabricacao;
import java.util.List;
/**
 *
 * @author Everton
 */
public interface IServiceOrdensFabricacao {
    public abstract OrdensFabricacao saveOrdensFabricacao(OrdensFabricacao ordem);
    public abstract OrdensFabricacao updateOrdensFabricacao(OrdensFabricacao ordem);
    public abstract void deleteOrdensFabricacao(OrdensFabricacao ordem);
    public abstract List<OrdensFabricacao> getAllOrdensFabricacao();
    public List<OrdensFabricacao> findByNameOrdensFabricacao(String name);
    public OrdensFabricacao findByIdOrdensFabricacao(Long id);
}
