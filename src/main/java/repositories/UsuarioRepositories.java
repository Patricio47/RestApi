package repositories;

import models.ModeloUsuario;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface UsuarioRepositories extends CrudRepository<ModeloUsuario, Long> {
    public abstract ArrayList<ModeloUsuario> findByPrioridad(Integer prioridad);
}
