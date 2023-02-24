package ru.alishev.springcourse.FirstRestApp.exceptions;

public class PersonNotCreatedException extends RuntimeException {
    public PersonNotCreatedException(String message) {
        super(message);
    }
}
