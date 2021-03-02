package ru.aseng.ase.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ru.aseng.ase.dao.Worker1cDao;
import ru.aseng.ase.dao.WorkerDao;
import ru.aseng.ase.dao.WorkerPfDao;
import ru.aseng.ase.daoImpl.Worker1cDaoImpl;
import ru.aseng.ase.daoImpl.WorkerPfDaoImpl;
import ru.aseng.ase.exception.ServerException;
import ru.aseng.ase.model.Worker;
import ru.aseng.ase.model.Worker1c;
import ru.aseng.ase.model.WorkerPf;
import ru.aseng.ase.mybatis.daoImpl.WorkerDaoImpl;

import java.util.ArrayList;
import java.util.List;

@Service
public class WorkerService {
    @Autowired
    WorkerDao workerDao = new WorkerDaoImpl();
    @Autowired
    Worker1cDao worker1cDao = new Worker1cDaoImpl();
    @Autowired
    WorkerPfDao workerPfDao = new WorkerPfDaoImpl();

    public boolean update() throws ServerException {
        List<Worker1c> workers1c = worker1cDao.getAll();
        List<WorkerPf> workersPf = workerPfDao.getAll();
        List<Worker> workers = workerDao.getAll();
        List<Worker> workersFrom1c = new ArrayList<>();
        for (Worker1c worker1c : workers1c) {
            int idPf = 0;
            for (WorkerPf workerPf : workersPf) {
                String namePf = workerPf.getLastName() + " " + workerPf.getName();
                String name1c = worker1c.getName().substring(0, namePf.length());
                if (namePf.equals(name1c)) {
                    idPf = workerPf.getId();
                    break;
                }
            }
            workersFrom1c.add(new Worker(worker1c.getId(), idPf, worker1c.getName(), worker1c.getPost(), worker1c.getDept(), worker1c.getFirm(), worker1c.getType(), worker1c.getIndivid(), worker1c.getStartDate(), worker1c.getEndDate(), worker1c.getTh(), worker1c.getCost(), worker1c.getCurrency()));
        }
        List<Worker> workersUpdate = new ArrayList<>();
        List<Integer> workersIdDelete = new ArrayList<>();
        for (int i = 0; i<workersFrom1c.size(); i++) {
            for (int j = 0; j < workers.size(); j++) {
                if (workers.get(j).getName().equals(workersFrom1c.get(i).getName())) {
                    if (!workers.get(j).equals(workersFrom1c.get(i))) {
                        workersUpdate.add(workers.get(j));
                        workers.remove(j);
                        workersFrom1c.remove(i);
                        break;
                    }
                }
            }
        }
        for (Worker worker : workers) {
            workersIdDelete.add(worker.getId());
        }
        workerDao.insertAll(workersFrom1c);
        for (Worker worker : workersUpdate) {
            workerDao.update(worker);
        }
        for (Integer workerId : workersIdDelete) {
            workerDao.delete(workerId);
        }
        return true;
    }
}
