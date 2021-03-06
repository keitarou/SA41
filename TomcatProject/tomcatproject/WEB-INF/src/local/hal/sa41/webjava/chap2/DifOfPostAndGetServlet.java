/**
	@class DifOfPostAndGetServlet
 */
package local.hal.sa41.webjava.chap2;

import java.io.IOException;
import java.io.PrintWriter;
import java.math.BigDecimal;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


public class DifOfPostAndGetServlet extends HttpServlet {
	/**
		doGet

		@param	HttpServletRequest	request
		@param	HttpServletResponse	response

		@note	output HTML
	*/
	public void doGet(HttpServletRequest request, HttpServletResponse response) throws IOException{
		
		request.setCharacterEncoding("UTF-8");
		String strWeight = request.getParameter("weight");
		String strHeight = request.getParameter("height");

		double weight = Double.parseDouble(strWeight);
		double height = Double.parseDouble(strHeight);

		BigDecimal bigBmi = new BigDecimal(weight / ((height/100)*(height/100)));
		bigBmi = bigBmi.setScale(1, BigDecimal.ROUND_HALF_EVEN);

		StringBuffer sb = new StringBuffer();
		sb.append("<html>");
		sb.append("<head>");
		sb.append("<title>PostとGetの違い</title>");
		sb.append("</head>");
		sb.append("<body>");
		sb.append("<h1>あなたのBMIは</h1>");
		sb.append(bigBmi);
		sb.append("<a href='/TomcatProject/chap2/showDifOfPostAndGet.html'>戻る</a>");
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
		doGet(request, response);
	}

}
