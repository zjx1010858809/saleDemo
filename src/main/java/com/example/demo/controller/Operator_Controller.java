package com.example.demo.controller;

import com.alibaba.fastjson.JSON;
import com.example.demo.entity.Operator;
import com.example.demo.service.Operator_Service;
import com.example.demo.utils.JsonInfo;
import com.example.demo.utils.SearchInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import java.util.ArrayList;
import java.util.HashMap;

@Controller
@RequestMapping(value = {"Operator", "zlb"})
public class Operator_Controller {
    private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Operator_Controller.class);

    @Autowired
    Operator_Service oservice;

    //初始界面数据加载
    @RequestMapping("index")
    @ResponseBody
    public HashMap<String, Object> index(String name, SearchInfo info) throws Exception {
        log.info("[index]——name:" + name + "，info:" + JSON.toJSONString(info));
        HashMap<String, Object> m = new HashMap<String, Object>();
        // data
        ArrayList<Operator> list = new ArrayList<Operator>();
        String where = "";
        if (name == null) {
            where = "";
        } else if (name == "") {
            where = "";
        } else {
            where = "where nike like '%" + name + "%'";
            info.setWhere(where);
        }
        list = (ArrayList<Operator>) oservice.index(info);
        // count
        int count = oservice.selectSize(info).get(0).getCount();
        m.put("data", list);
        m.put("count", count);
        m.put("msg", "");
        m.put("code", 0);
        return m;
    }

    //进入新增界面
    @RequestMapping("add")
    @ResponseBody
    public ModelAndView add() throws Exception {
        log.info("[add]");
        ModelAndView mv = new ModelAndView();
//        mv.addObject("schoolName", oservice.getbyid(school_id));
        mv.setViewName("operator/operatorEdit");
        return mv;
    }

    //进入编辑界面
    @RequestMapping("edit")
    public ModelAndView edit(int id) throws Exception {
        log.info("[edit]——id：" + id);
        ModelAndView mv = new ModelAndView();
        Operator oper = oservice.getById(id);
        mv.addObject("oper", oper);
        mv.setViewName("operator/operatorEdit");
        return mv;
    }

    //新增
    @RequestMapping("insert")
    protected @ResponseBody
    JsonInfo insert(Operator o) {
        log.info("[insert——operator:]" + JSON.toJSONString(o));
        int i = oservice.insert(o);
        if (i > 0) {
            return new JsonInfo(1, "添加成功！");
        } else {
            return new JsonInfo(0, "添加失败！");
        }
    }

    //编辑
    @RequestMapping("update")
    protected @ResponseBody
    JsonInfo update(Operator oper, ModelMap m) {
        log.info("[update]——operator:" + JSON.toJSONString(oper));
        oservice.update(oper);
        return new JsonInfo(1, "修改成功！");
    }

    //重置密码
    @RequestMapping("resetPwd")
    protected @ResponseBody
    JsonInfo resetPwd(int id, String password) {
        log.info("[resetPwd]——id：" + id + ",password：" + password);
        oservice.updatePass(id);
        return new JsonInfo(1, "密码重置成功!");
    }

    //用户查看个人信息
//	@RequestMapping("personView")
//	public ModelAndView personView(HttpSession sesssion) throws Exception {
//		ModelAndView mv = new ModelAndView();
//		Login registers = (Login) sesssion.getAttribute("registers");
//		int id = registers.getId();
//		Operator u = oservice.getById(id);
//		/*if(u.getType() == 0) {
//			mv.addObject("userView", u);
//			mv.setViewName("users/studentView");
//		}else {*/
//			mv.addObject("userView", u);
//			mv.setViewName("users/teacherView");
//		/*}*/
//		return mv;
//	}
}
