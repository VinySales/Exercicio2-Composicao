package application;

import java.time.Instant;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;

import entities.Comment;
import entities.Post;

public class Main {

	public static void main(String[] args) {
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
		
		Comment c1 = new Comment("Have a nice trip!");
		Comment c2 = new Comment("Wow thats awesome!");
		
		LocalDateTime date = LocalDateTime.parse("27/01/2000 23:40:23", dtf);
		Instant instant = date.atZone(ZoneId.systemDefault()).toInstant();
		
		Post p1 = new Post(instant , "Traveling to Paris", "Visiting this beatiful place!", 12);
		p1.addComment(c1);
		p1.addComment(c2);
		
		System.err.println(p1);
	}

}
