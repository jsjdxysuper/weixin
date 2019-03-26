package top.liyang024.wechat.teacherartist.serv;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import top.liyang024.table.dao.TTeacherArtistDetailMapper;
import top.liyang024.table.dao.TTeacherArtistMapper;
import top.liyang024.table.domain.TTeacherArtist;
import top.liyang024.table.domain.TTeacherArtistDetail;
import top.liyang024.table.domain.TTeacherArtistDetailExample;
import top.liyang024.table.domain.TTeacherArtistExample;

@Component
public class TeacherArtistServ {
	@Autowired
	TTeacherArtistMapper tTeacherArtistMapper;
	
	@Autowired
	TTeacherArtistDetailMapper tTeacherArtistDetailMapper;
	
	public List<TTeacherArtist>retrieveTeacherArtistListByParent(Integer parentId){
		TTeacherArtistExample example = new TTeacherArtistExample();
		if(null==parentId)
			example.createCriteria().andCParentIdIsNull();
		else
			example.createCriteria().andCParentIdEqualTo(parentId);
		example.setOrderByClause("c_index");
		List<TTeacherArtist> selectByExample = tTeacherArtistMapper.selectByExample(example);
		
		return selectByExample;
	}
	
	public TTeacherArtist retrieveTeacherArtistById(Integer personId){
		TTeacherArtistExample example = new TTeacherArtistExample();
		example.createCriteria().andCIdEqualTo(personId);
		List<TTeacherArtist> selectByExample = tTeacherArtistMapper.selectByExample(example);
		if(selectByExample.size()!=0)
			return selectByExample.get(0);
		else
			return null;
	}
	
	public List<TTeacherArtistDetail>retreiveTeacherArtistDetailTxtImg(int personId){
		TTeacherArtistDetailExample example = new TTeacherArtistDetailExample();
		List<String> typeList = new ArrayList<String>();
		typeList.add("txt");
		typeList.add("img");
		example.createCriteria().andCPersonIdEqualTo(personId).andCTypeIn(typeList);
		example.setOrderByClause("c_index");
		List<TTeacherArtistDetail> selectByExample = tTeacherArtistDetailMapper.selectByExample(example);
		return selectByExample;
	}
	
	public List<TTeacherArtistDetail>retreiveTeacherArtistDetailVideo(int personId){
		TTeacherArtistDetailExample example = new TTeacherArtistDetailExample();
		example.createCriteria().andCPersonIdEqualTo(personId).andCTypeEqualTo("video");
		example.setOrderByClause("c_index");
		List<TTeacherArtistDetail> selectByExample = tTeacherArtistDetailMapper.selectByExample(example);
		return selectByExample;
	}
}
