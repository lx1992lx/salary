package top.simuhunluo.salary.dao.mapper;

import top.simuhunluo.salary.dao.model.HotCompany;
import top.simuhunluo.salary.dao.model.HotCompanyKey;

public interface HotCompanyMapper {
    int deleteByPrimaryKey(HotCompanyKey key);

    int insert(HotCompany record);

    int insertSelective(HotCompany record);

    HotCompany selectByPrimaryKey(HotCompanyKey key);

    int updateByPrimaryKeySelective(HotCompany record);

    int updateByPrimaryKeyWithBLOBs(HotCompany record);

    int updateByPrimaryKey(HotCompany record);
}