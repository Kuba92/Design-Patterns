package co.devfoundry.designpatterns.adapter;

import co.devfoundry.designpatterns.adapter.api.LibraryAPI;
import co.devfoundry.designpatterns.adapter.api.LibraryAPIv2;

import java.time.LocalDate;

public class APIAdapter implements LibraryAPI {

    private LibraryAPIv2 api;
    private User user;

    public APIAdapter(LibraryAPIv2 api, User user) {
        this.api = api;
        this.user = user;
    }

    @Override
    public boolean isAvalible(String bookTitle) {
        return api.numberOfAviableCopies(bookTitle)>0;
    }

    @Override
    public LocalDate dueDate(String bookTitle, String pesel) {
        return api.dueDate(bookTitle, user.getFirstName(), user.getLastName(), user.getDateOfBirth());
    }

    @Override
    public boolean reserve(String bookTitle, String pesel) {
        return false;
    }
}
