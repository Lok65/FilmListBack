package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name ="Users")
public class User implements Serializable {
    //Attributes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;

    @Column(length = 50, nullable = false)
    private String name, email;

    @Column(length = 20, nullable = false)
    private String password;

    @ManyToMany
    private List<Actor> favoriteActors = new ArrayList<>();
    @ManyToMany
    private List<Film> favoriteFilms = new ArrayList<>();
    @OneToMany(mappedBy = "user")
    private List<Review> reviews = new ArrayList<>();
    @ManyToMany
    private List<Film> watchlist = new ArrayList<>();

    //Constructors
    public User() {
    }

    public User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    //Getters & Setters


    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    //toString
    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                '}';
    }

    //Methods

}
