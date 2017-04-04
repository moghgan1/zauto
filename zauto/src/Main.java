import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import org.json.JSONArray;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.thed.model.zautoconf.ZAutomationModel;

public class Main {

	public static void main(String[] args) {
		
//		ZAutomationModel zaConfig = new ZAutomationModel();
//		
//		String zaconfigStr = "{\"zautomation\": {\"projects\": [{\"project\": {\"id\": 1,\"name\": \"Sample Project\",\"releases\": [{\"id\": 1,\"name\": \"Release 1.0\",\"automationFrameworkSelected\": \"selenium\"}]}}]}}";
// 
//		try (FileWriter file = new FileWriter("./zaconfig.json")) {
//			try {
//				file.write(zaconfigStr);
//				file.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
//		} catch (IOException e1) {
//			e1.printStackTrace();
//		}
//		
//		JsonReader jr = null;
//		try {
//			jr = new JsonReader(new FileReader(new File("./zaconfig.json")));
//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		}
//		Gson gson = new Gson();
//		
//		ZAutomationModel zaConfigObj = gson.fromJson(jr, ZAutomationModel.class);
//		 System.out.println(gson.toJson(zaConfigObj).toString());
		
		ZAutomationModel model = new ZAutomationModel();

		System.out.println(model);
	}
		
	}
