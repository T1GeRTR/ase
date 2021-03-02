package ru.aseng.ase.dao;

import ru.aseng.ase.exception.ServerException;
import ru.aseng.ase.model.Worker;

import java.util.List;

public interface WorkerDao {
    Worker insert(Worker worker);

    boolean update(Worker worker) throws ServerException;

    boolean delete(Integer workerId) throws ServerException;

    boolean insertAll(List<Worker> workers) throws ServerException;

    List<Worker> getAll() throws ServerException;
}
