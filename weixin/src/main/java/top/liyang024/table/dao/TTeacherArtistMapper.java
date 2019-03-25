package top.liyang024.table.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.liyang024.table.domain.TTeacherArtist;
import top.liyang024.table.domain.TTeacherArtistExample;

public interface TTeacherArtistMapper {
    long countByExample(TTeacherArtistExample example);

    int deleteByExample(TTeacherArtistExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(TTeacherArtist record);

    int insertSelective(TTeacherArtist record);

    List<TTeacherArtist> selectByExample(TTeacherArtistExample example);

    TTeacherArtist selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TTeacherArtist record, @Param("example") TTeacherArtistExample example);

    int updateByExample(@Param("record") TTeacherArtist record, @Param("example") TTeacherArtistExample example);

    int updateByPrimaryKeySelective(TTeacherArtist record);

    int updateByPrimaryKey(TTeacherArtist record);
}