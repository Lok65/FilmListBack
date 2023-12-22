package fr.dawan.filmlist.repositories;

import fr.dawan.filmlist.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface UserRepository extends JpaRepository<User,Long> {

    @Query(value="SELECT u FROM User u WHERE u.name=:name")
    List<User> findUserByName(String name);

}
