//package cmpt350a3;
//
//import java.io.BufferedReader;
//import java.io.File;
//import java.io.FileReader;
//import java.io.IOException;
//import java.io.InputStream;
//import java.io.InputStreamReader;
//import java.io.PrintWriter;
//import java.nio.file.Files;
//
//import javax.servlet.ServletException;
//import javax.servlet.annotation.WebServlet;
//import javax.servlet.http.HttpServlet;
//import javax.servlet.http.HttpServletRequest;
//import javax.servlet.http.HttpServletResponse;
//
//
//
///**
// * Servlet implementation class ViewOrder
// */
//@WebServlet("/order/view/*")
//public class ViewOrder extends HttpServlet {
//	private static final long serialVersionUID = 1L;
//       
//    /**
//     * @see HttpServlet#HttpServlet()
//     */
//    public ViewOrder() {
//        super();
//        // TODO Auto-generated constructor stub
//    }
//
//	/**
//	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		String orderNumber = request.getRequestURI();
//		String orderPath = request.getServletContext().getRealPath("order");
//		File testFile = new File(orderPath + "/test.txt");
//		if (! testFile.exists()){
//			testFile.createNewFile();
//		}
//		PrintWriter fileWriter = new PrintWriter(testFile);
//		fileWriter.write("test writing");
//		fileWriter.close();
//		InputStream in = Files.newInputStream(testFile.toPath());
//		BufferedReader reader = new BufferedReader(new InputStreamReader(in));
//		String line = null;
//			    
//		PrintWriter out = response.getWriter();
////		String path = getServletContext().getRealPath("order");
////		File testFile = new java.io.File(path + "/test.txt");
////		out.append(String.valueOf(testFile.exists()));
//		while ((line = reader.readLine()) != null) {
//	        out.append(line);
//	    }
//		out.append("Hi");
//		out.close();
//	}
//
//	/**
//	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
//	 */
//	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//		// TODO Auto-generated method stub
//	}
//
//}
