package servlet.activity;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import service.ActivityMessageService;
import service.impl.ActivityMessageServiceImpl;



public class AddActMsgServlet extends HttpServlet {

	/**
	 * �������
		 * The doPost method of the servlet. <br>
		 *
		 * This method is called when a form has its tag value method equals to post.
		 * 
		 * @param request the request send by the client to the server
		 * @param response the response send by the server to the client
		 * @throws ServletException if an error occurred
		 * @throws IOException if an error occurred
		 */
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		//ȡ�ñ�����     
        String act_id=request.getParameter("act_id");
        String act_msg_fuser=request.getParameter("act_msg_fuser");
        String act_msg_acount=request.getParameter("act_msg_acount");
        act_msg_acount = new String(act_msg_acount.getBytes("iso-8859-1"),"utf-8");
        ActivityMessageService service=new ActivityMessageServiceImpl();
	    int i=service.addActmsg( Integer.parseInt(act_id), Integer.parseInt(act_msg_fuser), act_msg_acount);

        //ת��һ������
        request.getRequestDispatcher("getActServlet1").forward(request, response);//ת��getRequestDispatcher

		out.flush();
		out.close();
	}

}
