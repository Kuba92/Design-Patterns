package co.devfoundry.designpatterns.adapter.api;

import java.time.LocalDate;

public interface LibraryAPI {

    boolean isAvalible(String bookTitle);

    LocalDate dueDate(String bookTitle, String pesel);

    boolean reserve(String bookTitle, String pesel);
}
