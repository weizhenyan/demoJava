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

import service.ActivityService;
import service.impl.ActiveServiceImpl;



public class AddActServlet extends HttpServlet {

	/**����һ���
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
        String act_user_id="1";
        String act_name=request.getParameter("act_name");
        act_name = new String(act_name.getBytes("iso-8859-1"),"utf-8");
        String act_desc=request.getParameter("act_desc");
        act_desc = new String(act_desc.getBytes("iso-8859-1"),"utf-8");
        String act_city=request.getParameter("act_city");
        act_city = new String(act_city.getBytes("iso-8859-1"),"utf-8");
        System.out.print(act_city);
        String act_amount=request.getParameter("act_amount");
        String act_apply_amount=request.getParameter("act_apply_amount");
        
		try {
			 //���ںϲ�
	        String year=request.getParameter("year");
	        String month=request.getParameter("month");
	        String day=request.getParameter("day");
	        String date = year+"-"+month+"-"+day;
	        SimpleDateFormat date1 = new SimpleDateFormat("yyyy-MM-dd");  
	        Date act_end_date	= new Date(date1.parse(date).getTime());//ת�����dateֵ
//	        Date act_end_date=Date.valueOf(date);
	        ActivityService service=new ActiveServiceImpl();
	        int i=service.addAct( Integer.parseInt(act_user_id), act_name, act_desc, act_city, Integer.parseInt(act_amount), Integer.parseInt(act_apply_amount), act_end_date);
		} catch (ParseException e) {
			e.printStackTrace();
		}
    
        //ת��һ������
        request.getRequestDispatcher("getActServlet1").forward(request, response);//ת��getRequestDispatcher
		out.flush();
		out.close();
	}

}
