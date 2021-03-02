package ru.aseng.ase.mybatis.daoImpl;

import org.apache.ibatis.session.SqlSession;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Component;
import ru.aseng.ase.dao.WorkerDao;
import ru.aseng.ase.exception.ErrorCode;
import ru.aseng.ase.exception.ServerException;
import ru.aseng.ase.model.Worker;

import java.util.List;

@Component
public class WorkerDaoImpl extends DaoImplBase implements WorkerDao {
    private static final Logger LOGGER = LoggerFactory.getLogger(WorkerDaoImpl.class);

    @Override
    public Worker insert(Worker worker) {
        return null;
    }

    @Override
    public boolean update(Worker worker) throws ServerException {
        LOGGER.debug("DAO update");
        try (SqlSession sqlSession = getSession()) {
            try {
                getWorkerMapper(sqlSession).update(worker);
            } catch (RuntimeException e) {
                LOGGER.debug("Can't update workerId: {}", worker.getId(), e);
                throw new ServerException(ErrorCode.DATABASE_ERROR);
            }
            sqlSession.commit();
        }
        return true;
    }

    @Override
    public boolean delete(Integer workerId) throws ServerException {
        LOGGER.debug("DAO delete");
        try (SqlSession sqlSession = getSession()) {
            try {
                getWorkerMapper(sqlSession).delete(workerId);
            } catch (RuntimeException e) {
                LOGGER.debug("Can't delete workerId: {}", workerId, e);
                throw new ServerException(ErrorCode.DATABASE_ERROR);
            }
            sqlSession.commit();
        }
        return true;
    }

    @Override
    public boolean insertAll(List<Worker> workers) throws ServerException {
        LOGGER.debug("DAO insertAll");
        try (SqlSession sqlSession = getSession()) {
            try {
                getWorkerMapper(sqlSession).insert(workers);
            } catch (RuntimeException e) {
                LOGGER.debug("Can't insert All", e);
                throw new ServerException(ErrorCode.DATABASE_ERROR);
            }
            sqlSession.commit();
        }
        return true;
    }

    @Override
    public List<Worker> getAll() throws ServerException {
        LOGGER.debug("DAO getAll");
        try (SqlSession sqlSession = getSession()) {
            try {
                return getWorkerMapper(sqlSession).getAll();
            } catch (RuntimeException e) {
                LOGGER.debug("Can't get All", e);
                throw new ServerException(ErrorCode.DATABASE_ERROR);
            }
        }
    }
}
