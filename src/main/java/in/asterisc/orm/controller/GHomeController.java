package in.asterisc.orm.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import in.asterisc.orm.model.Student;
import in.asterisc.orm.repo.MyJpa;

@RestController
public class GHomeController {
	
	@Autowired
	MyJpa j;
	
	@RequestMapping("/")
	String fun()
	{
		return "Hello Student";
	}
	
	@RequestMapping("/test1")
	Student fun2()
	{
		Student s=new Student(101,"Ram","Nagpur","78.3"); 
		return s;
	}
	
	
	@RequestMapping("/test2")
	ArrayList<Student> fun3()
	{
		Student s=new Student(101,"Ram","Nagpur","78.3");
		Student s1=new Student(102,"sham","Nagpur","78.3");
		Student s2=new Student(101,"Om","Nagpur","78.3");
		Student s3=new Student(109,"Geeta","Nagpur","78.3");
		Student s4=new Student(101,"ved","Nagpur","78.3");
		Student s5=new Student(107,"Ram","Nagpur","78.3");
	
		ArrayList<Student> sl=new ArrayList<>();
		sl.add(s);
		sl.add(s1);
		sl.add(s2);
		sl.add(s3);
		sl.add(s4);
		sl.add(s5);
		
		return sl;
	}
	
	
	

	@RequestMapping("/test3")
	List<Student> fun4()
	{
	 List<Student> s= j.findAll();
	 
	 return s;
	}

}
