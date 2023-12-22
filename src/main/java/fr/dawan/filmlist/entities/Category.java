package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Entity
@Table(name ="Categories")
public class Category implements Serializable {
    //Attributes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;
    @Column(length = 50, nullable = false)
    private String name;
    @ManyToMany(mappedBy = "categories")
    private List<Film> films = new ArrayList<>();

    //Constructors

    public Category() {
    }

    public Category(String name, List<Film> films) {
        this.name = name;
        this.films = films;
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

    public List<Film> getFilms() {
        return films;
    }

    public void setFilms(List<Film> films) {
        this.films = films;
    }

    //toString
    @Override
    public String toString() {
        return "Category{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //Methods

}
