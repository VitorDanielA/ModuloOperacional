/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package br.com.ifba.usuario.dao;

import br.com.ifba.infrastructure.basedao.IBaseDao;
import br.com.ifba.usuario.model.Usuario;
import java.util.List;

/**
 *
 * @author vitor
 */
public interface IDaoUsuario extends IBaseDao<Usuario>{
    public abstract List<Usuario> findByName(String name);
}
