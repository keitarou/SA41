/**
	@class Asgmt02
 */
package local.hal.sa41.webjava.chap1;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class Asgmt02 extends HttpServlet {
	/**
		doGet

		@param	HttpServletRequest	request
		@param	HttpServletResponse	response

		@note	output HTML
	*/
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>No.2</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>No.2</h1>");
		sb.append("</body>");
		sb.append("</html>");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(sb);
		out.flush();
		out.close();
	}

}
