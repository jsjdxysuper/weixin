package top.liyang024.table.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import top.liyang024.table.domain.TUploadres;
import top.liyang024.table.domain.TUploadresExample;

@Component
public interface TUploadresMapper {
    long countByExample(TUploadresExample example);

    int deleteByExample(TUploadresExample example);

    int deleteByPrimaryKey(String cFilename);

    int insert(TUploadres record);

    int insertSelective(TUploadres record);

    List<TUploadres> selectByExample(TUploadresExample example);

    TUploadres selectByPrimaryKey(String cFilename);

    int updateByExampleSelective(@Param("record") TUploadres record, @Param("example") TUploadresExample example);

    int updateByExample(@Param("record") TUploadres record, @Param("example") TUploadresExample example);

    int updateByPrimaryKeySelective(TUploadres record);

    int updateByPrimaryKey(TUploadres record);
}