package fr.dawan.filmlist.repositories;

import fr.dawan.filmlist.entities.Film;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface FilmRepository extends JpaRepository<Film,Long> {

    @Query(value="SELECT f FROM Film f WHERE f.title=:title")
    List<Film> findFilmByName(String title);

}
