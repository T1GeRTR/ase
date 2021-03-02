package ru.aseng.ase.model;

import java.time.LocalDate;
import java.util.Objects;

public class Worker {
    private int id;
    private int id1c;
    private int idPf;
    private String name;
    private String post;
    private String dept;
    private String firm;
    private String type;
    private String individ;
    private LocalDate startDate;
    private LocalDate endDate;
    private String th;
    private int cost;
    private String currency;

    public Worker(int id, int id1c, int idPf, String name, String post, String dept, String firm, String type, String individ, LocalDate startDate, LocalDate endDate, String th, int cost, String currency) {
        this.id = id;
        this.id1c = id1c;
        this.idPf = idPf;
        this.name = name;
        this.post = post;
        this.dept = dept;
        this.firm = firm;
        this.type = type;
        this.individ = individ;
        this.startDate = startDate;
        this.endDate = endDate;
        this.th = th;
        this.cost = cost;
        this.currency = currency;
    }

    public Worker(int id1c, int idPf, String name, String post, String dept, String firm, String type, String individ, LocalDate startDate, LocalDate endDate, String th, int cost, String currency) {
        this(0, id1c, idPf, name, post, dept, firm, type, individ, startDate, endDate, th, cost, currency);
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getId1c() {
        return id1c;
    }

    public void setId1c(int id1c) {
        this.id1c = id1c;
    }

    public int getIdPf() {
        return idPf;
    }

    public void setIdPf(int idPf) {
        this.idPf = idPf;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
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

    public String getTh() {
        return th;
    }

    public void setTh(String th) {
        this.th = th;
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

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Worker worker = (Worker) o;
        return id1c == worker.id1c && idPf == worker.idPf && cost == worker.cost && Objects.equals(name, worker.name) && Objects.equals(post, worker.post) && Objects.equals(dept, worker.dept) && Objects.equals(firm, worker.firm) && Objects.equals(type, worker.type) && Objects.equals(individ, worker.individ) && Objects.equals(startDate, worker.startDate) && Objects.equals(endDate, worker.endDate) && Objects.equals(th, worker.th) && Objects.equals(currency, worker.currency);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id1c, idPf, name, post, dept, firm, type, individ, startDate, endDate, th, cost, currency);
    }
}
