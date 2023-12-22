package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="Reviews")
public class Review implements Serializable {
    //Attributes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;

    private String description;
    @Column(length = 1)
    private int score;

    @ManyToOne
    private Film film;
    @ManyToOne
    private User user;

    //Constructors

    public Review() {
    }

    public Review(String description, int score, Film film, User user) {
        this.description = description;
        this.score = score;
        this.film = film;
        this.user = user;
    }

    //Getters & Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getScore() {
        return score;
    }

    public void setScore(int score) {
        this.score = score;
    }

    public Film getFilm() {
        return film;
    }

    public void setFilm(Film film) {
        this.film = film;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    //toString

    @Override
    public String toString() {
        return "Review{" +
                "id=" + id +
                ", description='" + description + '\'' +
                ", score=" + score +
                '}';
    }

    //Methods

}
