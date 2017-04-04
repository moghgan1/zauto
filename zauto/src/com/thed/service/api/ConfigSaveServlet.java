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
 * Servlet implementation class ConfigSaveServlet
 */
@WebServlet("/config/save")
public class ConfigSaveServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ConfigSaveServlet() {
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

		String aframwork = request.getParameter("aframwork");
		String scriptpath = request.getParameter("scriptpath");
		String zbotagenmachine = request.getParameter("zbotagenmachine");
		String projId = request.getParameter("projId");
		String releaseId = request.getParameter("releaseId");
		
		JSONObject zaconfig = new JSONObject();
		zaconfig.put("aframwork", aframwork);
		zaconfig.put("scriptpath", scriptpath);
		zaconfig.put("zbotagenmachine", zbotagenmachine);
		
		ZAutomationConfigUtils.SaveZAutomationTaskConfig(zaconfig, absolutePath, projId+ ":::"+ releaseId);
		
		doGet(request, response);
	}

}
