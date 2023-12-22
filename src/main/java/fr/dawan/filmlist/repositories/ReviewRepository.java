package fr.dawan.filmlist.repositories;

import fr.dawan.filmlist.entities.Film;
import fr.dawan.filmlist.entities.Review;
import fr.dawan.filmlist.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface ReviewRepository extends JpaRepository<Review,Long> {

    @Query(value="SELECT r FROM Review r WHERE r.film=:film")
    List<Review> findReviewByFilmId(Film film);

    @Query(value="SELECT r FROM Review r WHERE r.user=:user")
    List<Review> findReviewByUserId(User user);

    @Query(value="SELECT r FROM Review r WHERE r.id=:id")
    List<Review> findReviewById(int id);

    @Query(value="SELECT r FROM Review r WHERE r.score=:score")
    List<Review> findReviewByScore(int score);

}
