package ru.aseng.ase.mybatis.mappers;

import org.apache.ibatis.annotations.*;
import ru.aseng.ase.model.Worker;

import java.util.List;

public interface WorkerMapper {

    @Insert({"<script>",
            "INSERT INTO worker (id1c, idPf, name, post, dept, firm, type, individ, startDate, endDate, th, cost, currency) VALUES",
            "<foreach item='worker' collection= 'list' separator=', '>",
            "(#{worker.id1c}, #{worker.idPf}, #{worker.name}, #{worker.post}, #{worker.dept}, #{worker.firm}, #{worker.type}, " +
                    "#{worker.individ}, #{worker.startDate}, #{worker.endDate}, #{worker.th}, #{worker.cost}, #{worker.currency})",
            "</foreach>",
            "</script>"})
    @Options(useGeneratedKeys = true, keyProperty = "worker.id")
    Integer insert(@Param("list") List<Worker> list);

    @Update({"UPDATE worker SET id1c = #{worker.id1c}, idPf = #{worker.idPf}, name = #{worker.name}, post = #{worker.post}, dept = #{worker.dept} " +
            "firm = #{worker.firm}, type = #{worker.type}, individ = #{worker.individ}, startDate = #{worker.startDate}, endDate = #{worker.endDate} " +
            "th = #{worker.th}, cost = #{worker.cost}, currency = #{worker.currency} WHERE id = #{worker.id}"})
    boolean update(@Param("worker") Worker worker);

    @Update({"UPDATE worker SET type = `deleted` WHERE id = #{id}"})
    boolean delete(@Param("id") int id);

    @Select({"SELECT * FROM worker"})
    List<Worker> getAll();
}
