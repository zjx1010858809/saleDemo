package com.example.demo.controller;

import com.example.demo.entity.User;
import com.example.demo.service.User_Service;
import com.example.demo.utils.JsonInfo;
import com.example.demo.utils.UserSearchInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;

@Controller
@RequestMapping("User")
public class User_Controller {
	@Autowired
	User_Service service;
//	@Autowired
//	School_Service sservice;

	@RequestMapping("index_json")
	@ResponseBody
	public HashMap<String, Object> select(UserSearchInfo info) throws Exception {
		HashMap<String, Object> m = new HashMap<String, Object>();
		String where;
		String whereSize;
		Integer school_id = info.getSchool_id();
		Integer college_id = info.getCollege_id();
		String nameinfo = info.getNameinfo();
		String telinfo = info.getTelinfo();
		Integer glevel = info.getGlevel();
		Integer ylevel = info.getYlevel();
		Integer slevel = info.getSlevel();
		Integer type = info.getType();
		
		// 查询
//		if (nameinfo == null) {
//			where = "where u.type="+type;
//			whereSize = "where u.type="+type;
//		} else if (school_id != null && college_id != null) {
//			where = "where u.school_id = "+school_id+" and u.college_id = "+college_id+" and u.type="+type;
//			whereSize = "where u.school_id = "+school_id+" and u.college_id = "+college_id+" and u.type="+type;
//		} else if (nameinfo != "" ) {
//			where = "where u.name like'%" + nameinfo + "%' and u.type="+type;
//			whereSize = "where u.name like'%" + nameinfo + "%' and u.type="+type;
//		} else if (telinfo != "" ) {
//			where = "where u.tel like'%" + telinfo + "%' and u.type="+type;
//			whereSize = "where u.tel like'%" + telinfo + "%' and u.type="+type;
//		} else if (glevel != null) {
//			where = "where u.glevel = " + glevel+" and u.type="+type;
//			whereSize = "where u.glevel = " + glevel+" and u.type="+type;
//		} else if (ylevel != null ) {
//			where = "where u.ylevel = " + ylevel+" and u.type="+type;
//			whereSize = "where u.ylevel = " + ylevel+" and u.type="+type;
//		} else if (slevel != null) {
//			where = "where u.ylevel = " + slevel+" and u.type="+type;
//			whereSize = "where u.ylevel = " + slevel+" and u.type="+type;
//		} else {
//			where = "where u.type="+type;
//			whereSize = "where u.type="+type;
//		}

		// data
		info.setWhere("");
		ArrayList<User> list = new ArrayList<User>();
		list = (ArrayList<User>) service.select(info);

		// count
		info.setWhere("");
		int count = service.selectSize(info).get(0).getCount();

		// Response
		m.put("data", list);
		m.put("count", count);
		m.put("msg", "");
		m.put("code", 0);
		return m;
	}
	
	@RequestMapping("insert")
	protected @ResponseBody
	JsonInfo insert(User u) {
		SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd HH:mm");//设置日期格式
		String createdate = df.format(new Date());
		u.setCreatedate(createdate);
		u.setOperator_id(1);
		int i = service.insert(u);
		if (i > 0) {
			return new JsonInfo(1, "添加成功！");
		} else {
			return new JsonInfo(0, "添加失败！");
		}
	}
	
	@RequestMapping("update")
	@ResponseBody
	protected JsonInfo update(User u, ModelMap m) {
		if(u.getType() == 0) {
			service.studentUpdate(u);
		}else if(u.getType() == 1){
			service.teacherUpdate(u);
		}
		return new JsonInfo(1,"修改成功！");
	}
	
	//修改页
	@RequestMapping("userUpdate")
	public ModelAndView userUpdate(int id) throws Exception {
		ModelAndView mv = new ModelAndView();
		User u = service.getById(id);
		if(u.getType() == 0) {
			mv.addObject("userUpdate", u);
			mv.setViewName("users/studentUpdate");
		}else {
			mv.addObject("userUpdate", u);
			mv.setViewName("users/teacherUpdate");
		}
		return mv;
	}
	
	//查看用户信息
	@RequestMapping("userView")
	public ModelAndView userView(int id) throws Exception {
		ModelAndView mv = new ModelAndView();
		User u = service.getById(id);
		if(u.getType() == 0) {
			mv.addObject("userView", u);
			mv.setViewName("users/studentView");
		}else {
			mv.addObject("userView", u);
			mv.setViewName("users/teacherView");
		}
		return mv;
	}
	

	
//	@RequestMapping("school")
//	@ResponseBody
//	public ArrayList<School> selectSchool() throws Exception {
//		ArrayList<School> listSchool = new ArrayList<School>();
//		listSchool = (ArrayList<School>) sservice.selectall();
//		return listSchool;
//	}
	
//	@RequestMapping("college")
//	@ResponseBody
//	public ArrayList<College> selectCollege(Integer school_id) throws Exception {
//		ArrayList<College> listCollege = new ArrayList<College>();
//		listCollege = (ArrayList<College>) service.selectCollege(school_id);
//		return listCollege;
//	}
}
