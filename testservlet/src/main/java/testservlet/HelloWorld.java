package testservlet;


import java.io.*;
import javax.servlet.*;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
//@WebServlet(name="mytest")

public class HelloWorld extends HttpServlet {
 
  private String message;

  public void init() throws ServletException
  {

      message = "Hello World!!!";
  }

  public void doGet(HttpServletRequest request,
                    HttpServletResponse response)
            throws ServletException, IOException
  {
      
    request.getRequestDispatcher("/index.jsp").forward(request, response);
    int[] arr = new int[10];
    for(int i = 0; i<10; i++){
    	arr[i] = i;
    }
    
  }
  
  public void destroy()
  {
      
  }
}