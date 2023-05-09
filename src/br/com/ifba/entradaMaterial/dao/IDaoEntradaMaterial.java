package br.com.ifba.entradaMaterial.dao;

import br.com.ifba.entradaMaterial.model.EntradaMaterial;
import br.com.ifba.infrastructure.basedao.IBaseDao;
import java.util.List;

/**
 *
 * @author clebinho
 */
public interface IDaoEntradaMaterial extends IBaseDao<EntradaMaterial>{
    public abstract List<EntradaMaterial> findByName(String name);
}
