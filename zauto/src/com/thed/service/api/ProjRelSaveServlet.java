package com.thed.service.api;

import java.io.IOException;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.json.JSONObject;

import com.thed.util.ZAutomationConfigUtils;

/**
 * Servlet implementation class ProjRelSaveServlet
 */
@WebServlet("/config/prsave")
public class ProjRelSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ProjRelSaveServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		ServletContext context = getServletContext();
		String absolutePath = context.getRealPath("./");

		String uniqueId = request.getParameter("uniqueId");
		String projId = request.getParameter("projId");
		String releaseId = request.getParameter("releaseId");
		
		System.out.println(uniqueId);
		System.out.println(projId);
		System.out.println(releaseId);
		
		ZAutomationConfigUtils.SaveZAutomationTaskFindConfig(uniqueId, absolutePath, projId+ ":::"+ releaseId);
		
			doGet(request, response);
	}

}
