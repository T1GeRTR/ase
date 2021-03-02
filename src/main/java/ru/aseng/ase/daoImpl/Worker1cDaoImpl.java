package ru.aseng.ase.daoImpl;

import org.springframework.stereotype.Component;
import ru.aseng.ase.model.Worker1c;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

@Component
public class Worker1cDaoImpl implements ru.aseng.ase.dao.Worker1cDao {
    @Override
    public List<Worker1c> getAll() {
        List<Worker1c> workers1c = new ArrayList<>();
        workers1c.add(new Worker1c(1, "Ракишев Талгат Адылханович", "123456Talgat", "Постоянная", "РТА", 40000, "рублей", "Engineer", "OPISI", "ASE", LocalDate.now(), null));
        workers1c.add(new Worker1c(2, "Баранцев Михаил Сергеевич", "123456Mikhail", "Постоянная", "БМС", 41000, "рублей", "Engineer", "OPISI", "ASE", LocalDate.now(), null));
        workers1c.add(new Worker1c(3, "Бисимбеков Мейрам Манарбекович", "123456Meyram", "Постоянная", "БММ", 50000, "рублей", "Engineer", "OPISI", "ASE", LocalDate.now(), null));
        workers1c.add(new Worker1c(4, "Вычужанин Никита Александрович", "123456Nikita", "Постоянная", "ВНА", 49000, "рублей", "Engineer", "OPISI", "ASE", LocalDate.now(), null));
        return workers1c;
    }
}
