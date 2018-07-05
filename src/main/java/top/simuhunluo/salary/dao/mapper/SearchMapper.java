package top.simuhunluo.salary.dao.mapper;

import top.simuhunluo.salary.dao.model.Search;
import top.simuhunluo.salary.dao.model.SearchKey;

public interface SearchMapper {
    int deleteByPrimaryKey(SearchKey key);

    int insert(Search record);

    int insertSelective(Search record);

    Search selectByPrimaryKey(SearchKey key);

    int updateByPrimaryKeySelective(Search record);

    int updateByPrimaryKey(Search record);
}