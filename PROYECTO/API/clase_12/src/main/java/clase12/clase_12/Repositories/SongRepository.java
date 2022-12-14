package clase12.clase_12.Repositories;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import clase12.clase_12.Models.Cancion;

@Repository
public interface SongRepository extends CrudRepository<Cancion, Long>{
    public Iterable<Cancion> getSongsByTitle(String title);
}
