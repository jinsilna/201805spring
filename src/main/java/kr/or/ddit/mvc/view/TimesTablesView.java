package kr.or.ddit.mvc.view;

import java.io.PrintWriter;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.View;

// 구구단을 출력하는 customView
// spring customview를 만들기위해서는 view interface를 구현할 필요가 있다.
public class TimesTablesView implements View{

	//html
	@Override
	public String getContentType() {
		
		return null;
	}

	// 이곳이 중요 
	@Override
	public void render(Map<String, ?> model, HttpServletRequest request, HttpServletResponse response)
			throws Exception {
		
		// jsp에서 가져옴 = TimesTablesServlet
		response.setContentType("text/html; charset=utf-8");
		PrintWriter pw = response.getWriter();
		
		// http://localhost:8081/customViewBeanName?tables=5
		String tables = request.getParameter("tables");
		Integer tabless = Integer.parseInt(tables);
		
		pw.print("<!DOCTYPE html>");
		pw.print("   <html>");
		pw.print("      <style type='text/css'>");
		pw.print("         td {border : 1px solid red}");
		pw.print("      </style>");
		pw.print("      <head>");
		pw.print("         <meta charset='UTF-8'>");
		pw.print("         <title>timesTables.html</title>");
		pw.print("      </head>");
		pw.print("      <body>");
		pw.print("         <table>");

		for(int j= 1; j < 10; j++){
			pw.print("   <tr>");
			for(int i = 2; i < tabless +1; i ++){
				pw.print("      <td>" + i + "*" + j + "=" + i*j +"</td>");
			}
			pw.print("   </tr>");
		}
		pw.print("         </table>");
		pw.print("      </body>");
		pw.print("</html>");
	}
}










