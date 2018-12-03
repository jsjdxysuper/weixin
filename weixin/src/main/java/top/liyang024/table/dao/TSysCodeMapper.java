package top.liyang024.table.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import top.liyang024.table.domain.TSysCode;
import top.liyang024.table.domain.TSysCodeExample;
import top.liyang024.table.domain.TSysCodeKey;
@Component
public interface TSysCodeMapper {
    long countByExample(TSysCodeExample example);

    int deleteByExample(TSysCodeExample example);

    int deleteByPrimaryKey(TSysCodeKey key);

    int insert(TSysCode record);

    int insertSelective(TSysCode record);

    List<TSysCode> selectByExample(TSysCodeExample example);

    TSysCode selectByPrimaryKey(TSysCodeKey key);

    int updateByExampleSelective(@Param("record") TSysCode record, @Param("example") TSysCodeExample example);

    int updateByExample(@Param("record") TSysCode record, @Param("example") TSysCodeExample example);

    int updateByPrimaryKeySelective(TSysCode record);

    int updateByPrimaryKey(TSysCode record);
}