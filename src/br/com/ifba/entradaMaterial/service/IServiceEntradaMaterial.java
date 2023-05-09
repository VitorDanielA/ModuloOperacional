package br.com.ifba.entradaMaterial.service;

import br.com.ifba.entradaMaterial.model.EntradaMaterial;
import java.util.List;

/**
 *
 * @author clebinho
 */
public interface IServiceEntradaMaterial {
    public abstract EntradaMaterial saveEntradaMaterial(EntradaMaterial entradaMaterial);
    public abstract EntradaMaterial updateEntradaMaterial(EntradaMaterial entradaMaterial);
    public abstract void deleteEntradaMaterial(EntradaMaterial entradaMaterial);
    public abstract List<EntradaMaterial> getAllEntradaMaterial();
    public List<EntradaMaterial> findByNameEntradaMaterial(String name);
    public EntradaMaterial findByIdEntradaMaterial(Long id);
}
