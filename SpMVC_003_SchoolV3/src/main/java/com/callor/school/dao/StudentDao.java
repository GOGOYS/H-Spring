package com.callor.school.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.callor.school.dbconfig.DBConnection;
import com.callor.school.dbconfig.DBContract;
import com.callor.school.domain.StudentVO;

/*
 * Dao 클래스
 * Data Access Object
 * DB와 연동하여 SQL을 보내고, 데이터를 수신하는 기능을 수행한다.
 */

// 자바의 컴포넌트로 만들어라
@Component
public class StudentDao {
	
	private final Connection dbConn;
	
	public StudentDao() {
		dbConn = DBConnection.getDBConnection();
	}
	
	public List<StudentVO> selectAll(){
		
		 /*
		  * PreparedStatement : JDBC를 통하여 DBMS에게 Query를 보내고 데이터를 수신하는 객체
		  */
		PreparedStatement pStr = null;
		String sql = DBContract.ST.SELECT;
		
		//sql 문을 전달할 준비
		try {
			pStr = dbConn.prepareStatement(sql);
			//이 명령이 실행되면 SELECT문이 DB로 전달이 되고 그 결과를 rSet에 담는다.
			ResultSet rSet = pStr.executeQuery();
			
			List<StudentVO> stList = new ArrayList<>();
			
			while(rSet.next()){					
				StudentVO stVO = new StudentVO();
				stVO.setStNum(rSet.getString(DBContract.ST_COL.ST_NUM));
				stVO.setStName(rSet.getString(DBContract.ST_COL.ST_NAME));
				stVO.setStDept(rSet.getString(DBContract.ST_COL.ST_DEPT));
				stVO.setStAddr(rSet.getString(DBContract.ST_COL.ST_ADDR));
				stVO.setStTel(rSet.getString(DBContract.ST_COL.ST_TEL));
				stVO.setIntGrade(rSet.getInt(DBContract.ST_COL.ST_GRADE));
				
				stList.add(stVO);
			}
			rSet.close();
			pStr.close();
			
			return stList;
		} catch (SQLException e) {
			
		}
		
		return null;
		
	}// end selectAll
	
	public StudentVO findByNum(String stNum) {
		
		PreparedStatement pStr =null;
		
		String sql = DBContract.ST.SELECT;
		
		sql += "WHERE st_num = ?";
		
		try {
			
			pStr = dbConn.prepareStatement(sql);
			pStr.setString(1, stNum);
			ResultSet rSet = pStr.executeQuery();
			rSet.next();
			StudentVO stVO = new StudentVO();
			stVO.setStNum(rSet.getString(DBContract.ST_COL.ST_NUM));
			stVO.setStName(rSet.getString(DBContract.ST_COL.ST_NAME));
			stVO.setStDept(rSet.getString(DBContract.ST_COL.ST_DEPT));
			stVO.setStAddr(rSet.getString(DBContract.ST_COL.ST_ADDR));
			stVO.setStTel(rSet.getString(DBContract.ST_COL.ST_TEL));
			stVO.setIntGrade(rSet.getInt(DBContract.ST_COL.ST_GRADE));
			
			rSet.close();
			pStr.close();
			return stVO;
		} catch (SQLException e) {
			
		}
		
		return null;
	}
	
}
