package edu.es.eoi.bizum.repository;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.Reader;
import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.reflect.TypeToken;

import edu.es.eoi.bizum.entity.User;
import edu.es.eoi.bizum.json.UserJson;

public class UserRepositoryJsonImpl {
	
	static Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	public boolean createUser(User user) {
				
		try {	
			
			Reader reader = new FileReader(new File("src/main/resources/users.json"));

			List<UserJson> users = new Gson().fromJson(reader, new TypeToken<List<UserJson>>() {}.getType());
		    
			if(users==null) {
				users=new ArrayList<UserJson>();
			}
						
			UserJson json=new UserJson();
			json.setTelephone(user.getTelephone());
			json.setUser(user);		
			
			users.add(json);
			
			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			FileWriter writter=new FileWriter(new File("src/main/resources/users.json"),false);	
			gson.toJson(users, writter);
			
			writter.close();
	
			
		} catch (Exception e) {			
			e.printStackTrace();
			return false;
		}
		
		return true;
	}

}
