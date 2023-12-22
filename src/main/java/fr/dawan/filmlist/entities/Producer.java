package fr.dawan.filmlist.entities;

import jakarta.persistence.*;

import java.io.Serializable;

@Entity
@Table(name ="Producer")
public class Producer implements Serializable {
    //Attributes
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Version
    private int version;

    @Column(length = 50, nullable = false)
    private String name;

    //Constructors
    public Producer() {
    }

    public Producer(String name) {
        this.name = name;

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

    //toString
    @Override
    public String toString() {
        return "Producer{" +
                "id=" + id +
                ", name='" + name + '\'' +
                '}';
    }

    //Methods
}
