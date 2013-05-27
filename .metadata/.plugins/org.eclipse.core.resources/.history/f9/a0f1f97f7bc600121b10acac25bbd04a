/**
	@class PostAndGetServlet
 */
package local.hal.sa41.webjava.chap2;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class PostAndGetServlet extends HttpServlet {
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
		sb.append("<title>PostとGet</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>これはdoGetメソッド内で生成されたHTMLです。</h1>");
		sb.append("<a href='/TomcatProject/chap2/showPostAndGet.html'>戻る</a>");
		sb.append("</body>");
		sb.append("</html>");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(sb);
		out.flush();
		out.close();
	}

	/**
		doPost

		@param	HttpServletRequest	request
		@param	HttpServletResponse	response

		@note	output HTML
	*/
	public void doPost(HttpServletRequest request, HttpServletResponse response) throws IOException{
		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>PostとGet</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>これはdoPostメソッド内で生成されたHTMLです。</h1>");
		sb.append("<a href='/TomcatProject/chap2/showPostAndGet.html'>戻る</a>");
		sb.append("</body>");
		sb.append("</html>");
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		out.println(sb);
		out.flush();
		out.close();
	}

}
