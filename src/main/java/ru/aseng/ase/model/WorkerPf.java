package ru.aseng.ase.model;

import java.util.Objects;

public class WorkerPf {
    private int id;
    private String name;
    private String lastName;
    private String login;
    private String email;

    public WorkerPf(int id, String name, String lastName, String login, String email) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.login = login;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        WorkerPf workerPf = (WorkerPf) o;
        return id == workerPf.id && Objects.equals(name, workerPf.name) && Objects.equals(lastName, workerPf.lastName) && Objects.equals(login, workerPf.login) && Objects.equals(email, workerPf.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, lastName, login, email);
    }
}
