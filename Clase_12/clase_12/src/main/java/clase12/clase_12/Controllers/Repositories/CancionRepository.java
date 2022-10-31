package clase12.clase_12.Controllers.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import clase12.clase_12.Models.Cancion;

@Repository
public interface CancionRepository extends CrudRepository<Cancion, Long>{

}
