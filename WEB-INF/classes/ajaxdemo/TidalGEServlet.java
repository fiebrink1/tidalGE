
package ajaxdemo;

import java.io.IOException;
import javax.servlet.ServletException;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
//import javax.servlet.annotation.*;
 

/**
 * Servlet implementation class ActionServlet
 */

//@WebServlet("/tidaltok")
public class TidalGEServlet extends HttpServlet {

  private static final long serialVersionUID = 1L;


  public TidalGEServlet() {
  // TODO Auto-generated constructor stub
  }


  protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  String name=null;
  name = "Hello Idiot"+request.getParameter("user");
  if(request.getParameter("user").toString().equals("")){
  name="Hello Idiot User";
  }
  response.setContentType("text/plain");  
  response.setCharacterEncoding("UTF-8"); 
  response.getWriter().write(name); 
  }


  protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
  // TODO Auto-generated method stub

  }

}
