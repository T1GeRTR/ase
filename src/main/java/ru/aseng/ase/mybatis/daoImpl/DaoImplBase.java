package ru.aseng.ase.mybatis.daoImpl;

import org.apache.ibatis.session.SqlSession;
import ru.aseng.ase.mybatis.mappers.WorkerMapper;
import ru.aseng.ase.mybatis.utils.MyBatisUtils;

public class DaoImplBase {

    protected SqlSession getSession() {
        MyBatisUtils.initSqlSessionFactory();
        return MyBatisUtils.getSqlSessionFactory().openSession();
    }

    protected WorkerMapper getWorkerMapper(SqlSession sqlSession) {
        return sqlSession.getMapper(WorkerMapper.class);
    }
}