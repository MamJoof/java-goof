   package io.github.benas.todolist.web.action;

   import java.sql.Connection;
   import java.sql.DriverManager;
   import java.sql.ResultSet;
   import java.sql.Statement;
   import javax.servlet.http.HttpServletRequest;

   public class UserLookupAction {

       public ResultSet findUser(HttpServletRequest request) throws Exception {
           String name = request.getParameter("name");
           Connection conn = DriverManager.getConnection("jdbc:h2:mem:todolist");
           Statement stmt = conn.createStatement();
           return stmt.executeQuery("SELECT * FROM users WHERE name = '" + name + "'");
       }
   }
