package top.simuhunluo.salary.dao.mapper;

import top.simuhunluo.salary.dao.model.LatestSalary;
import top.simuhunluo.salary.dao.model.LatestSalaryKey;

public interface LatestSalaryMapper {
    int deleteByPrimaryKey(LatestSalaryKey key);

    int insert(LatestSalary record);

    int insertSelective(LatestSalary record);

    LatestSalary selectByPrimaryKey(LatestSalaryKey key);

    int updateByPrimaryKeySelective(LatestSalary record);

    int updateByPrimaryKey(LatestSalary record);
}