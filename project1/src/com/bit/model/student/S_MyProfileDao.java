package com.bit.model.student;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.bit.util.MyOracle;

public class S_MyProfileDao {
	private Connection conn;
	private PreparedStatement pstmt;
	private ResultSet rs;
	private S_MyProfileDto bean;
	public S_MyProfileDto selectOne(int idx) throws SQLException {
		String sql="SELECT * FROM student=?";
		
		try{
			try {
				conn=MyOracle.getConnection();
			} catch (ClassNotFoundException e) {
				e.printStackTrace();
			}
			pstmt=conn.prepareStatement(sql);
			pstmt.setInt(1, idx);
			rs=pstmt.executeQuery();
			while(rs.next()){
				bean.setId(rs.getString("id"));
				bean.setAddress(rs.getString("address"));
				bean.setBirth(rs.getString("birth"));
				bean.setEmail(rs.getString("email"));
				bean.setIdx(rs.getInt("idx"));
				bean.setName(rs.getString("name"));
				bean.setPhone(rs.getString("phone"));
			}
		}finally{
			if(rs!=null)rs.close();
			if(pstmt!=null)pstmt.close();
			if(conn!=null)conn.close();
		}
		return bean;
	}
}
