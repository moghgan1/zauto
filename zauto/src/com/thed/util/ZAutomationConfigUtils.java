package com.thed.util;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.thed.model.zautoconf.ZAutomationModel;

public class ZAutomationConfigUtils {

	private static final String ZACONFIG_JSON = "zaconfig.json";
	private static final String ZACONFIG_FIND_JSON = "zaconfigfind.json";
	
	public static String fetchZAutomationTaskConfig(String absolutePath) {
		
		File file = new File(absolutePath + File.separator + "conf" + File.separator + ZACONFIG_JSON);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return null;
		}
//		System.out.println(file.getAbsolutePath());
//		JsonReader jr = null;
//		try {
//			jr = new JsonReader(new FileReader(file));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		Gson gson = new Gson();
//		
//		ZAutomationModel zaConfigObj = gson.fromJson(jr, ZAutomationModel.class);
//		
//		return zaConfigObj;
		String content = null;
		try {
			content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		return content;

	}
	
	public static boolean SaveZAutomationTaskConfig(JSONObject zaconfigStr, String absolutePath, String key) {
		
		String fetchZAutomationTaskConfig = fetchZAutomationTaskConfig(absolutePath);
		
		JSONObject jObj = null;
				if(fetchZAutomationTaskConfig == null || fetchZAutomationTaskConfig.equals("")) {
					jObj = new JSONObject();
				} else {
					jObj = new JSONObject(fetchZAutomationTaskConfig);
				}
				
		
			jObj.put(key, zaconfigStr);
		
		boolean status = true;
		File file = new File(absolutePath + File.separator + "conf" + File.separator + ZACONFIG_JSON);
		
//		String zaconfigStr = "{\"zautomation\": {\"projects\": [{\"project\": {\"id\": 1,\"name\": \"Sample Project\",\"releases\": [{\"id\": 1,\"name\": \"Release 1.0\",\"automationFrameworkSelected\": \"selenium\"}]}}]}}";
 
		try (FileWriter fileWriter = new FileWriter(file)) {
			try {
				fileWriter.write(jObj.toString());
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
		return status;
	}

	public static void SaveZAutomationTaskFindConfig(String uniqueId, String absolutePath, String projRel) {
		

		
		String fetchZAutomationTaskConfig = fetchZAutomationTaskFindConfig(absolutePath);
		
		JSONObject jObj = null;
				if(fetchZAutomationTaskConfig == null || fetchZAutomationTaskConfig.equals("")) {
					jObj = new JSONObject();
				} else {
					jObj = new JSONObject(fetchZAutomationTaskConfig);
				}
				
		
			jObj.put(uniqueId, projRel);
		
		boolean status = true;
		File file = new File(absolutePath + File.separator + "conf" + File.separator + ZACONFIG_FIND_JSON);
		
//		String zaconfigStr = "{\"zautomation\": {\"projects\": [{\"project\": {\"id\": 1,\"name\": \"Sample Project\",\"releases\": [{\"id\": 1,\"name\": \"Release 1.0\",\"automationFrameworkSelected\": \"selenium\"}]}}]}}";
 
		try (FileWriter fileWriter = new FileWriter(file)) {
			try {
				fileWriter.write(jObj.toString());
				fileWriter.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (IOException e1) {
			e1.printStackTrace();
		}
		
	}
	
public static String fetchZAutomationTaskFindConfig(String absolutePath) {
		
		File file = new File(absolutePath + File.separator + "conf" + File.separator + ZACONFIG_FIND_JSON);
		if(!file.exists()) {
			try {
				file.createNewFile();
			} catch (IOException e) {
				e.printStackTrace();
			}
			return null;
		}
		String content = null;
		try {
			content = new String(Files.readAllBytes(Paths.get(file.getAbsolutePath())));
		} catch (IOException e) {
			e.printStackTrace();
		}
		return content;

	}
}
