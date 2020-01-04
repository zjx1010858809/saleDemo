package com.example.demo.service;


import com.example.demo.entity.Operator;
import com.example.demo.utils.SearchInfo;

import java.util.List;

public interface Operator_Service {
	public List<Operator> selectall();
	
	public List<Operator> index(SearchInfo info);
	
	public List<Operator> selectSize(SearchInfo info);
	
	public int insert(Operator o);
	
	public void updatePass(int id);
	
	public void update(Operator oper);
	
	public Operator getById(int id); 
	
}
