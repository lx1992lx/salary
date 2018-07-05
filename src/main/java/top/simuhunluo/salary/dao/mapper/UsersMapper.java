package top.simuhunluo.salary.dao.mapper;

import top.simuhunluo.salary.dao.model.UsersKey;
import top.simuhunluo.salary.dao.model.UsersWithBLOBs;

public interface UsersMapper {
    int deleteByPrimaryKey(UsersKey key);

    int insert(UsersWithBLOBs record);

    int insertSelective(UsersWithBLOBs record);

    UsersWithBLOBs selectByPrimaryKey(UsersKey key);

    int updateByPrimaryKeySelective(UsersWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(UsersWithBLOBs record);
}