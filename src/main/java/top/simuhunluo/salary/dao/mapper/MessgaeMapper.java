package top.simuhunluo.salary.dao.mapper;

public interface MessgaeMapper {
    int deleteByPrimaryKey(Integer cid);

    int insert(Messgae record);

    int insertSelective(Messgae record);

    Messgae selectByPrimaryKey(Integer cid);

    int updateByPrimaryKeySelective(Messgae record);

    int updateByPrimaryKeyWithBLOBs(Messgae record);

    int updateByPrimaryKey(Messgae record);
}