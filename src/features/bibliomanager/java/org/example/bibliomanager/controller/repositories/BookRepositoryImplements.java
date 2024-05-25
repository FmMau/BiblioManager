package org.example.bibliomanager.controller.repositories;

import org.example.bibliomanager.controller.datasource.BookDatasourceImplements;
import org.example.bibliomanager.controller.datasources.AuthDatasourceImplements;
import org.example.bibliomanager.model.datasources.AuthDatasource;
import org.example.bibliomanager.model.datasources.BookDatasource;
import org.example.bibliomanager.model.entities.Book;
import org.example.bibliomanager.model.repositories.BookRepository;

import java.util.ArrayList;

public class BookRepositoryImplements extends BookRepository {
    BookDatasource datasource = new BookDatasourceImplements();
    @Override
    public ArrayList<Book> getBooks() {
        return datasource.getBooks();
    }

    @Override
    public Book getBooksById(int id) {
        return datasource.getBooksById(id);
    }

    @Override
    public ArrayList<Book> getBooksByGenre(String genre) {
        return datasource.getBooksByGenre(genre);
    }

    @Override
    public ArrayList<Book> getBooksByQuery(String query) {
        return datasource.getBooksByQuery(query);
    }

    @Override
    public ArrayList<String> getGenres() {
        return datasource.getGenres();
    }
}