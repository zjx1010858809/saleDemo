package com.example.demo.serviceImpl;

import com.example.demo.entity.Operator;
import com.example.demo.mapper.Operator_Mapper;
import com.example.demo.service.Operator_Service;
import com.example.demo.utils.SearchInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Operator_ServiceImpl implements Operator_Service {
	private static final org.slf4j.Logger log = org.slf4j.LoggerFactory.getLogger(Operator_ServiceImpl.class);
	
	@Autowired
	Operator_Mapper odao;
	
	public List<Operator> index(SearchInfo info) {
		return odao.index(info);
	}
	
	public List<Operator> selectSize(SearchInfo info) {
		return odao.selectSize(info);
	}


	public int insert(Operator o) {
		return odao.insert(o);
	}

	public void updatePass(int id) {
		odao.updatePass(id);
	}

	public void update(Operator oper) {
		odao.update(oper);
	}

	public Operator getById(int id) {
		return odao.getById(id);
	}

	public List<Operator> selectall() {
		return odao.selectall();
	}

}
