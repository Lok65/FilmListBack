package fr.dawan.filmlist.repositories;

import fr.dawan.filmlist.entities.Producer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ProducerRepository extends JpaRepository<Producer,Long> {

    @Query(value="SELECT p FROM Producer p WHERE p.name=:name")
    List<Producer> findProducerByName(String name);

}
