package top.liyang024.table.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.liyang024.table.domain.TSysCodeVal;
import top.liyang024.table.domain.TSysCodeValExample;
import top.liyang024.table.domain.TSysCodeValKey;

public interface TSysCodeValMapper {
    long countByExample(TSysCodeValExample example);

    int deleteByExample(TSysCodeValExample example);

    int deleteByPrimaryKey(TSysCodeValKey key);

    int insert(TSysCodeVal record);

    int insertSelective(TSysCodeVal record);

    List<TSysCodeVal> selectByExample(TSysCodeValExample example);

    TSysCodeVal selectByPrimaryKey(TSysCodeValKey key);

    int updateByExampleSelective(@Param("record") TSysCodeVal record, @Param("example") TSysCodeValExample example);

    int updateByExample(@Param("record") TSysCodeVal record, @Param("example") TSysCodeValExample example);

    int updateByPrimaryKeySelective(TSysCodeVal record);

    int updateByPrimaryKey(TSysCodeVal record);
}