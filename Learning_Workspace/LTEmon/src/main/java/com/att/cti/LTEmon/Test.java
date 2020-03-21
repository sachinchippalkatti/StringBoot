package com.att.cti.LTEmon;

import java.io.IOException;
import java.util.List;

import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.fasterxml.jackson.core.JsonParseException;

public class Test {

	private static String JSON = "{\r\n" + " \"person\": [\r\n" + " {\r\n"
		      + " \"id\": \"11\",\r\n" + " \"name\": \"John\",\r\n"
		      + " \"city\": \"NewYork\",\r\n" + " \"phone\": 7647388372,\r\n"
		      + " \"facebook\": \"JohnTheGreat\"\r\n" + " }\r\n" + " ]\r\n" + " } ";
		 
		  public static void main(String args[]) throws JsonParseException,
		      JsonMappingException, IOException {
		 
		    ObjectMapper objectMapper = new ObjectMapper();
		    //objectMapper.disable(DeserializationFeature.FAIL_ON_UNKNOWN_PROPERTIES);
		    Community c = objectMapper.readValue(JSON, Community.class);
		 
		    for (Person p : c.getPerson()) {
		      System.out.println(p);
		    }
		 
		  }
		 
		  static class Community {
		    private List<Person> person;
		 
		    public List<Person> getPerson() {
		      return person;
		    }
		 
		    public void setPerson(List<Person> person) {
		      this.person = person;
		    }
		 
		  }
		 
		  static class Person {
		    private int id;
		    private String name;
		    private String city;
		    private long phone;
		    private String facebook;
		 
		    public String getFacebook() {
				return facebook;
			}

			public void setFacebook(String facebook) {
				this.facebook = facebook;
			}

			public int getId() {
		      return id;
		    }
		 
		    public void setId(int id) {
		      this.id = id;
		    }
		 
		    public String getName() {
		      return name;
		    }
		 
		    public void setName(String name) {
		      this.name = name;
		    }
		 
		    public String getCity() {
		      return city;
		    }
		 
		    public void setCity(String city) {
		      this.city = city;
		    }
		 
		    public long getPhone() {
		      return phone;
		    }
		 
		    public void setPhone(long phone) {
		      this.phone = phone;
		    }
		 
		    @Override
		    public String toString() {
		      return "Person [id=" + id + ", name=" + name + ", city=" + city
		          + ", phone=" + phone + "]";
		    }
		 
		  }

}
