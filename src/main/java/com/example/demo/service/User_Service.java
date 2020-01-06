package com.example.demo.service;

import com.example.demo.entity.User;
import com.example.demo.utils.UserSearchInfo;

import java.util.List;

public interface User_Service {
	public List<User> select(UserSearchInfo info);
	public List<User> selectSize(UserSearchInfo info);
	public int insert(User u);
	public int studentUpdate(User u);
	public int teacherUpdate(User u);
//	public List<College> selectCollege(int school_id);
	public int delete();
	public User getById(int id);
}
