package com.bit.ctr.J;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Grade_check_Dao;
import com.bit.model.Grade_check_Dto;
import com.bit.model.Student_Dao;
import com.bit.model.Student_Dto;

public class J_stu_list_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		Student_Dao a = new Student_Dao();
		Student_Dto b = new Student_Dto();
		Grade_check_Dao c = new Grade_check_Dao();
		Grade_check_Dto d = new Grade_check_Dto();
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
