package top.simuhunluo.salary.dao.mapper;

import top.simuhunluo.salary.dao.model.Salary;
import top.simuhunluo.salary.dao.model.SalaryKey;
import top.simuhunluo.salary.dao.model.SalaryWithBLOBs;

public interface SalaryMapper {
    int deleteByPrimaryKey(SalaryKey key);

    int insert(SalaryWithBLOBs record);

    int insertSelective(SalaryWithBLOBs record);

    SalaryWithBLOBs selectByPrimaryKey(SalaryKey key);

    int updateByPrimaryKeySelective(SalaryWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(SalaryWithBLOBs record);

    int updateByPrimaryKey(Salary record);
}