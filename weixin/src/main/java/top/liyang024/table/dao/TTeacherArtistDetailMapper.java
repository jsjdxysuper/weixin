package top.liyang024.table.dao;

import java.util.List;
import org.apache.ibatis.annotations.Param;
import top.liyang024.table.domain.TTeacherArtistDetail;
import top.liyang024.table.domain.TTeacherArtistDetailExample;

public interface TTeacherArtistDetailMapper {
    long countByExample(TTeacherArtistDetailExample example);

    int deleteByExample(TTeacherArtistDetailExample example);

    int deleteByPrimaryKey(Integer cId);

    int insert(TTeacherArtistDetail record);

    int insertSelective(TTeacherArtistDetail record);

    List<TTeacherArtistDetail> selectByExample(TTeacherArtistDetailExample example);

    TTeacherArtistDetail selectByPrimaryKey(Integer cId);

    int updateByExampleSelective(@Param("record") TTeacherArtistDetail record, @Param("example") TTeacherArtistDetailExample example);

    int updateByExample(@Param("record") TTeacherArtistDetail record, @Param("example") TTeacherArtistDetailExample example);

    int updateByPrimaryKeySelective(TTeacherArtistDetail record);

    int updateByPrimaryKey(TTeacherArtistDetail record);
}