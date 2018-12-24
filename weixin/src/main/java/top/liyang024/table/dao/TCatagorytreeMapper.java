package top.liyang024.table.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.liyang024.table.domain.TCatagorytree;
import top.liyang024.table.domain.TCatagorytreeExample;

public interface TCatagorytreeMapper {
    long countByExample(TCatagorytreeExample example);

    int deleteByExample(TCatagorytreeExample example);

    int deleteByPrimaryKey(String cUid);

    int insert(TCatagorytree record);

    int insertSelective(TCatagorytree record);

    List<TCatagorytree> selectByExample(TCatagorytreeExample example);

    TCatagorytree selectByPrimaryKey(String cUid);

    int updateByExampleSelective(@Param("record") TCatagorytree record, @Param("example") TCatagorytreeExample example);

    int updateByExample(@Param("record") TCatagorytree record, @Param("example") TCatagorytreeExample example);

    int updateByPrimaryKeySelective(TCatagorytree record);

    int updateByPrimaryKey(TCatagorytree record);
}