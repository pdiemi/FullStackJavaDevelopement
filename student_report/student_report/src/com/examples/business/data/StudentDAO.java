package com.examples.business.data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;

public class StudentDAO {
private Connection conn;
    private Statement stmt;
    private static final String uname="system";
    private static final String password="amarjeet";

    private static final String driver="oracle.jdbc.driver.OracleDriver";
    private static final String dburl="jdbc:oracle:oci8:@";

    public StudentDAO()
    {
      try
      {
         Class.forName(driver);
         conn=DriverManager.getConnection(dburl,uname,password);
         stmt=conn.createStatement();
      }catch(Exception e)
      {
    	  System.out.println("<StudentDAO>Exception ="+e);
      }
    }
      public ArrayList fetchStudentData()
      {
    	  ResultSet rs = null;
    	  ArrayList list = null;
    	  Student stud = null;
    	  try
    	  {
    		  rs = stmt.executeQuery("select student_roll_no,student_name,student_gender,maths_marks,physics_marks,chemistry_marks,computer_science_marks from student_master");
    		  list = new ArrayList();
    		  while(rs.next())
    		  {
    			  stud = new Student();
    			  stud.setRollNo(rs.getInt("student_roll_no"));
    			  stud.setName(rs.getString("student_name"));
    			  stud.setGender(rs.getString("student_gender"));
    			  stud.setMaths(rs.getInt("maths_marks"));
    			  
    			  stud.setPhysics(rs.getInt("physics_marks"));
    			  stud.setChemistry(rs.getInt("chemistry_marks"));
    			  stud.setCompscience(rs.getInt("computer_science_marks"));
    			  list.add(stud);
    		  }
    		  
    	  }
    	  catch(Exception e)
    	  {
    		  System.out.println("<fetchStudentData>Exception ="+e);
    	  }
    	  return list;
      }

   

}
