package servlet.activity;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import dbutil.DbUtil;
import entity.Users;

public class UserLoginServlet extends HttpServlet {

	public void service(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html;charset=utf-8");
		request.setCharacterEncoding("utf-8");
		
		String user_name = request.getParameter("user_name");
		String user_pwd = request.getParameter("user_pwd");
		
		
		QueryRunner run= new QueryRunner(DbUtil.dataSource);
        String sql = "select * from users where user_name = ? and user_pwd = ?";
        Object[] params={user_name,user_pwd};
        List<Users> list = null;
        try {
			list = (List<Users>) run.query(sql, new BeanListHandler<Users>(Users.class),params);
		} catch (SQLException e) {
			e.printStackTrace();
		}  
        for (Users user : list) {
        	if(user_name != null && user_pwd != null){
        		if(user_name.equals(user.getUser_name()) && user_pwd.equals(user.getUser_pwd())){
        			//�����Ҫ����Ϣ����session�������ڴ˴����
        			HttpSession session=request.getSession();
        			session.setAttribute("act_user",user);
        			String message = "��½�ɹ���";
        			request.setAttribute("message", message);
        			request.getRequestDispatcher("activity/index.jsp").forward(request, response);

        		}
        	}else{
        		String message = "�˺������������������룡";
    			request.setAttribute("message", message);
        		request.getRequestDispatcher("activity/login.jsp").forward(request, response);	
        	}
			
		}

	}

}
