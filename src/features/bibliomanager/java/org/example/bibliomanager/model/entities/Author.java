package org.example.bibliomanager.model.entities;

public class Author {
    private final int id;
    private final String name;

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Author(int id, String nombre) {
        this.id = id;
        this.name = nombre;
    }

}
