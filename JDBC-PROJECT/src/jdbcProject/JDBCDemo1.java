package jdbcProject;
import java.sql.*;
public class JDBCDemo1 
{
	public static void main(String[] args) throws Exception 
	{
	 	// load the drivers
        Class.forName("com.mysql.cj.jdbc.Driver");
        
        //establish connection between java application with SQL database
        Connection con=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/sample", "root", "root");
        
        //create statement object
        Statement st=con.createStatement();
        
        //write and execute queries
        
        //String query="create table student(id int primary key,sname varchar(20))";
        
        //String query1="insert into student values(1,'Shwetha')";
        //String query2="insert into student values(2,'Priya')";
        //String query3="insert into student values(3,'Kusuma')";
        //String query4="insert into student values(4,'Nithya')";
        
        //String query5="delete from student where id=2";+-
        
        String query6="update student set sname='Ganavi' where id=5";
        
        
        //st.executeUpdate(query);
        //st.executeUpdate(query1);
        //st.executeUpdate(query2);
        //st.executeUpdate(query3);
        //st.executeUpdate(query4);
        //st.executeUpdate(query5);
        st.executeUpdate(query6);
        
        //System.out.println("student table created successfully!!!!");
        System.out.println("Row inserted successfully!!!!");
        
        //close the connections
        st.close();
        con.close();
	}
}
