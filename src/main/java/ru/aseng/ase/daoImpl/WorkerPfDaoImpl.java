package ru.aseng.ase.daoImpl;

import org.springframework.stereotype.Component;
import ru.aseng.ase.dao.WorkerPfDao;
import ru.aseng.ase.model.WorkerPf;

import java.util.ArrayList;
import java.util.List;

@Component
public class WorkerPfDaoImpl implements WorkerPfDao {

    @Override
    public List<WorkerPf> getAll() {
        List<WorkerPf> workersPf = new ArrayList<>();
        workersPf.add(new WorkerPf(1, "Талгат", "Ракишев", "raksihev", "t1gerok.tr@gmail.com"));
        workersPf.add(new WorkerPf(2, "Михаил", "Баранцев", "barancev", "t1gerok.tr@gmail.com"));
        workersPf.add(new WorkerPf(3, "Мейрам", "Бисимбеков", "bisimbekov", "t1gerok.tr@gmail.com"));
        workersPf.add(new WorkerPf(4, "Никита", "Вычужанин", "vichuzhanin", "t1gerok.tr@gmail.com"));
        return workersPf;
    }
}
