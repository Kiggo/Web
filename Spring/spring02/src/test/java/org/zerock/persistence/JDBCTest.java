package org.zerock.persistence;

import static org.junit.Assert.fail;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

import lombok.extern.log4j.Log4j;

@Log4j
public class JDBCTest {
	static {
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
		} catch (Exception e) {
			fail(e.getMessage());
		}
	}
	@Test
	public void testConnection() {
		try(Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE",
				"scott","tiger")){
			log.info(con);
		}
		catch(Exception e){
			fail(e.getMessage());
			
		}
	}
}
