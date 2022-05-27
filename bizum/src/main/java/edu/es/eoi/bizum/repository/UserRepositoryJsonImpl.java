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

public class UserRepositoryJsonImpl implements UserRepository {

	static Gson gson = new GsonBuilder().setPrettyPrinting().create();

	public boolean createUser(User user) {

		try {

			Reader reader = new FileReader(new File("src/main/resources/users.json"));

			List<UserJson> users = new Gson().fromJson(reader, new TypeToken<List<UserJson>>() {
			}.getType());

			if (users == null) {
				users = new ArrayList<UserJson>();
			} else {
				for (UserJson userJson : users) {
					if (userJson.getTelephone().equals(user.getTelephone())) {
						System.out.println("usuario ya existente");
						return false;
					}
				}
			}

			UserJson json = new UserJson();
			json.setTelephone(user.getTelephone());
			json.setUser(user);

			users.add(json);

			Gson gson = new GsonBuilder().setPrettyPrinting().create();
			FileWriter writter = new FileWriter(new File("src/main/resources/users.json"), false);
			gson.toJson(users, writter);

			writter.close();

		} catch (Exception e) {
			e.printStackTrace();
			return false;
		}

		return true;
	}
	
	public User findUserByTelephone(String telephone) {

		try {

			Reader reader = new FileReader(new File("src/main/resources/users.json"));
			List<UserJson> users = new Gson().fromJson(reader, new TypeToken<List<UserJson>>() {
			}.getType());

			for (UserJson userJson : users) {
				if (userJson.getTelephone().equals(telephone)) {									
					return userJson.getUser();
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return null;
	}

	public User login(String username, String password) {

		try {

			Reader reader = new FileReader(new File("src/main/resources/users.json"));
			List<UserJson> users = new Gson().fromJson(reader, new TypeToken<List<UserJson>>() {
			}.getType());

			for (UserJson userJson : users) {
				if (userJson.getUser().getUsername().equals(username)) {
					if(userJson.getUser().getPassword().equals(password)) {
						return userJson.getUser();
					}else {
						System.out.println("password incorrecto");
						return null;
					}					
				}
			}

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}

		return null;
	}
}
