package top.liyang024.wechat.teacherartist.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import top.liyang024.wechat.teacherartist.serv.TeacherArtistServ;
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;
import top.liyang024.table.domain.TSysCode;
import top.liyang024.table.domain.TTeacherArtist;
import top.liyang024.table.domain.TTeacherArtistDetail;

@Controller
public class TeacherArtistController {
	
	@Autowired
	TeacherArtistServ teacherArtistServ;
	
	
	@ResponseBody
	@RequestMapping(value="teacherArtistList",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String teacherArtistList(@RequestParam(value="parentId",required=false) Integer parentId) {
		List<TTeacherArtist> retrieveTeacherArtistList = teacherArtistServ.retrieveTeacherArtistListByParent(parentId);
		JSONArray ja = JSONArray.fromObject(retrieveTeacherArtistList); 
		return ja.toString();
	}
	
	@ResponseBody
	@RequestMapping(value="teacherArtistDetail",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String teacherArtistDetailTxtImg(@RequestParam(value="id",required=true) Integer id) {
		TTeacherArtist retrieveTeacherArtistById = teacherArtistServ.retrieveTeacherArtistById(id);
		List<TTeacherArtistDetail> retreiveTeacherArtistDetailTxtImg = teacherArtistServ.retreiveTeacherArtistDetailTxtImg(id);
		List<TTeacherArtistDetail> retreiveTeacherArtistDetailVideo = teacherArtistServ.retreiveTeacherArtistDetailVideo(id);
		JSONObject jo = new JSONObject();
		jo.accumulate("teacherArtistOutline", retrieveTeacherArtistById);
		jo.accumulate("teacherArtistTxtImgContent", retreiveTeacherArtistDetailTxtImg);
		jo.accumulate("teacherArtistVideoContent", retreiveTeacherArtistDetailVideo);
		
		return jo.toString();
	}
	
	@ResponseBody
	@RequestMapping(value="teacherArtistDetailVideo",produces={"text/html;charset=UTF-8;","application/json;charset=UTF-8;"})
	public String teacherArtistDetailVideo(@RequestParam(value="personId",required=true) Integer personId) {
		List<TTeacherArtistDetail> retreiveTeacherArtistDetailTxtImg = teacherArtistServ.retreiveTeacherArtistDetailVideo(personId);
		JSONArray ja = JSONArray.fromObject(retreiveTeacherArtistDetailTxtImg);
		return ja.toString();
	}
}
