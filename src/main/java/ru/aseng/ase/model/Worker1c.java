package ru.aseng.ase.model;

import java.time.LocalDate;
import java.util.Objects;

public class Worker1c {
    private int id;
    private String name;
    private String th;
    private String type;
    private String individ;
    private int cost;
    private String currency;
    private String post;
    private String dept;
    private String firm;
    private LocalDate startDate;
    private LocalDate endDate;

    public Worker1c(int id, String name, String th, String type, String individ, int cost, String currency, String post, String dept, String firm, LocalDate startDate, LocalDate endDate) {
        this.id = id;
        this.name = name;
        this.th = th;
        this.type = type;
        this.individ = individ;
        this.cost = cost;
        this.currency = currency;
        this.post = post;
        this.dept = dept;
        this.firm = firm;
        this.startDate = startDate;
        this.endDate = endDate;
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

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIndivid() {
        return individ;
    }

    public void setIndivid(String individ) {
        this.individ = individ;
    }

    public int getCost() {
        return cost;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getPost() {
        return post;
    }

    public void setPost(String post) {
        this.post = post;
    }

    public String getDept() {
        return dept;
    }

    public void setDept(String dept) {
        this.dept = dept;
    }

    public String getFirm() {
        return firm;
    }

    public void setFirm(String firm) {
        this.firm = firm;
    }

    public LocalDate getStartDate() {
        return startDate;
    }

    public void setStartDate(LocalDate startDate) {
        this.startDate = startDate;
    }

    public LocalDate getEndDate() {
        return endDate;
    }

    public void setEndDate(LocalDate endDate) {
        this.endDate = endDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker1c worker1c = (Worker1c) o;
        return id == worker1c.id && cost == worker1c.cost && Objects.equals(name, worker1c.name) && Objects.equals(th, worker1c.th) && Objects.equals(type, worker1c.type) && Objects.equals(individ, worker1c.individ) && Objects.equals(currency, worker1c.currency) && Objects.equals(post, worker1c.post) && Objects.equals(dept, worker1c.dept) && Objects.equals(firm, worker1c.firm) && Objects.equals(startDate, worker1c.startDate) && Objects.equals(endDate, worker1c.endDate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, th, type, individ, cost, currency, post, dept, firm, startDate, endDate);
    }
}
