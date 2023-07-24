package com.mvc;

import com.DAO.ImpDAO;
import com.DAO.config.Appconfig;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.servlet.ModelAndView;

import com.DAO.ImpDAO;

@Controller
public class MainController 
{
	@GetMapping("/")
	public ModelAndView first()
	{
		ModelAndView m1= new ModelAndView("chapter1");
		List<User> l2=new ArrayList<User>();
		//ClassPathXmlApplicationContext c=new ClassPathXmlApplicationContext("/com/DAO/SpringAppconfig.xml");
		AnnotationConfigApplicationContext a1=new AnnotationConfigApplicationContext(Appconfig.class);
		ImpDAO d=a1.getBean("DAOBean",ImpDAO.class);
		l2.addAll(d.users());
		System.out.println(l2);
		m1.addObject("Sai",l2);
		return m1;
	}

}
