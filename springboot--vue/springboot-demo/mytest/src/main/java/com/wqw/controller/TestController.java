package com.wqw.controller;

import com.wqw.common.Result;
import com.wqw.mapper.UserDao;
import com.wqw.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin
@RestController
@RequestMapping("/")
public class TestController {

	@Autowired
	private UserDao userDao;
	@RequestMapping(value = "test1",method = RequestMethod.GET)
	public String test1(){
		return "Test1";
	}

	@RequestMapping(value = "test2",method = RequestMethod.GET)
	public Result test2(){
//		User user=new User(1,"wqw","123");
		String username="wqw";
		User user=userDao.findUser(username);
		if(user!=null){
			System.out.println(user);
		}else {
			System.out.println("111");
		}
		return Result.Success(user);
	}
	@RequestMapping(value = "login",method = RequestMethod.GET)
	public Result login(String username){
		if (username==null){
			System.out.println("username不能为空");
			return Result.Error("username不能够为空");
		}else
			System.out.println(username);
		User user=userDao.findUser(username);
		if (user==null){
			return Result.Error("404用户找不到");
		}
		return Result.Success(user);
	}
}
