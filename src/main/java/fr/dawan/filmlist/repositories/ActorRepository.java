package fr.dawan.filmlist.repositories;

import fr.dawan.filmlist.entities.Actor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ActorRepository extends JpaRepository<Actor,Long> {

    @Query(value="SELECT a FROM Actor a WHERE a.name=:name")
    List<Actor> findActorByName(String name);

}
