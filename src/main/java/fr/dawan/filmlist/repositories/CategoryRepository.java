package fr.dawan.filmlist.repositories;

import fr.dawan.filmlist.entities.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category,Long> {

    @Query(value="SELECT c FROM Category c WHERE c.name=:name")
    List<Category> findCategoryByName(String name);

}
