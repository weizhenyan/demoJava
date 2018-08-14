package filter;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import entity.Users;

public class LoginFilter implements Filter {

	@Override
	public void destroy() {
		System.out.println("----Filter����----");

	}

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain filterChain)
			throws IOException, ServletException {
		// ��������������Ҫ�õ�request,response,session����
		  HttpServletRequest servletRequest = (HttpServletRequest) request;
		  HttpServletResponse servletResponse = (HttpServletResponse) response;
		  HttpSession session = servletRequest.getSession();
		  // ����û������URI
		  String path = servletRequest.getRequestURI();
		  //System.out.println(path);
		  // ��session��ȡ�û���Ϣ
		  String User = (String) session.getAttribute("User");
		  /*������Constants.java������д����������˵�ҳ��
		  for (int i = 0; i < Constants.NoFilter_Pages.length; i++) {
		   if (path.indexOf(Constants.NoFilter_Pages[i]) > -1) {
		    chain.doFilter(servletRequest, servletResponse);
		    return;
		   }
		  }*/
		  // ��½ҳ���������
		  if(path.indexOf("/activity/login.jsp") > -1) {
			  filterChain.doFilter(servletRequest, servletResponse);
		   return;
		  }
		  // �ж����û��ȡ��Ա����Ϣ,����ת����½ҳ��
		  if (User == null || "".equals(User)) {
		   // ��ת����½ҳ��
		   servletResponse.sendRedirect("/travel/activity/login.jsp");
		  } else {
		   // �Ѿ���½,�����˴�����
			  filterChain.doFilter(request, response);
		  }
        
//ԭʼ����������
//		 // ��request��response����һЩԤ����
//        request.setCharacterEncoding("UTF-8");
//        response.setCharacterEncoding("UTF-8");
//        response.setContentType("text/html;charset=UTF-8");
//        
//        System.out.println("----����service֮ǰִ��һ�δ���----");
//        filterChain.doFilter(request, response); // ִ��Ŀ����Դ������
//        System.out.println("----����service֮��ִ��һ�δ���----");

	}

	@Override
	public void init(FilterConfig arg0) throws ServletException {
		System.out.println("----Filter��ʼ��----");

	}

}
