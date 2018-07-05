package top.simuhunluo.salary.dao.mapper;

import org.apache.ibatis.annotations.Mapper;
import top.simuhunluo.salary.dao.model.Company;

import java.util.List;

@Mapper
public interface CompanyMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Company record);

    int insertSelective(Company record);

    Company selectByPrimaryKey(Integer cid);

    List<Company> selectAll();

    int updateByPrimaryKeySelective(Company record);

    int updateByPrimaryKeyWithBLOBs(Company record);

    int updateByPrimaryKey(Company record);
}