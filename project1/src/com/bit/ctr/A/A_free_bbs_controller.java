package com.bit.ctr.A;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bit.model.Free_bbs_Dao;
import com.bit.model.Free_bbs_Dto;

@WebServlet("/guest/")
public class A_free_bbs_controller extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		RequestDispatcher rd = req.getRequestDispatcher("../add.jsp");
		Free_bbs_Dao dao = new Free_bbs_Dao();
		Free_bbs_Dto a = new Free_bbs_Dto();
		List<Free_bbs_Dto> list=null;

			list = dao.selectAll();

		
		req.setAttribute("alist", list);
		rd.forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	}

}
