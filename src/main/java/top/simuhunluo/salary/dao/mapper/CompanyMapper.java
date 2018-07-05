package top.simuhunluo.salary.dao.mapper;

import top.simuhunluo.salary.dao.model.Company;

public interface CompanyMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKeyWithBLOBs(Company record);

    int updateByPrimaryKey(Company record);
}