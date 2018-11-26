package top.liyang024.table.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import top.liyang024.table.domain.TUrl;
import top.liyang024.table.domain.TUrlExample;
@Component
public interface TUrlMapper {
    long countByExample(TUrlExample example);

    int deleteByExample(TUrlExample example);

    int deleteByPrimaryKey(String cId);

    int insert(TUrl record);

    int insertSelective(TUrl record);

    List<TUrl> selectByExample(TUrlExample example);

    TUrl selectByPrimaryKey(String cId);

    int updateByExampleSelective(@Param("record") TUrl record, @Param("example") TUrlExample example);

    int updateByExample(@Param("record") TUrl record, @Param("example") TUrlExample example);

    int updateByPrimaryKeySelective(TUrl record);

    int updateByPrimaryKey(TUrl record);
}