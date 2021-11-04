package ifal.infonutri;

import org.springframework.data.repository.CrudRepository;

@org.springframework.stereotype.Repository
public interface Repository extends CrudRepository<Alimento, Integer> {
}
