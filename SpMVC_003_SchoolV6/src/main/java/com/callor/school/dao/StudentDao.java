package com.callor.school.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.callor.school.model.StudentVO;

public interface StudentDao {
	@Select(" SELECT * FROM tbl_student ")
	public List<StudentVO> selectAll();
	
	//sql문에서는 $대신에 #표시를 해야한다 주의!
	@Select(" SELECT * FROM tbl_student " + " WHERE st_num = #{st_num} ")
	public StudentVO findByNum(String st_num);
	
	@Insert(SQL.STUDENT.INSERT)
	public int insert(StudentVO stVO);
	
	@Update(SQL.STUDENT.UPDATE)
	public int update(StudentVO stVO);
	
	@Delete(" DELETE FROM tbl_student WHERE st_num = #{st_num} ")
	public int delete(String st_num);
	
	
}
