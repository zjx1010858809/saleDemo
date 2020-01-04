package com.example.demo.mapper;

import com.example.demo.entity.Operator;
import com.example.demo.utils.SearchInfo;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("Operator_Mapper")
public interface Operator_Mapper {
	
	@Select(value = "select * from operator")
	public List<Operator> selectall();
	
	@Select(value = "select * from operator ${where} ${limits}")
	public List<Operator> index(SearchInfo info);
	
	@Select("select count(id) count from operator ${where}")
	public List<Operator> selectSize(SearchInfo info);
	
	//添加管理员
	@Insert("insert into operator(nike,pass,name,type,tel,power,status,comments) values(#{nike},'3032B963A259075B964B07153D3C4B70',#{name},#{type},#{tel},#{power},#{status},#{comments})")
	public int insert(Operator o);
	
	//重置密码
	@Update("update operator set pass='3032B963A259075B964B07153D3C4B70' where id=#{id}")
	public void updatePass(int id);
	
	//修改管理员信息
	@Update("update operator set name=#{name},type=#{type},tel=#{tel},power=#{power},status=#{status},comments=#{comments} where id=#{id}")
	public void update(Operator oper);
	
	//
	@Select(value = "select * from operator where id=#{id}")
	public Operator getById(int id); 
	
}
