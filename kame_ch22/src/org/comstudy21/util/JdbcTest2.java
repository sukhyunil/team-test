package org.comstudy21.util;

import java.sql.Connection;

public class JdbcTest2 {

	public static void main(String[] args) {
		System.out.println("H2 데이터베이스 연결");
		
		Connection conn = JdbcUtil.getConnection();
		System.out.println(conn);
		
		JdbcUtil.close(conn);
		System.out.println("close connection .");
	}

}
