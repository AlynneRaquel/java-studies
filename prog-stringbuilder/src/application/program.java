package application;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import entities.Comment;
import entities.Post;

public class program {

	public static void main(String[] args) throws ParseException {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyy HH:mm:ss");	
		
		Comment comentario2 = new Comment("Wow that´s awesome");
		Comment comentario1 = new Comment("Have a nice trip!");
		
		Post p1 = new Post(
				sdf.parse("21/04/2023 13:05:44"),
				"Traveling to New Zealand",
				"I'm going to visit this wonderful country", 13);
				
		
		p1.addComment(comentario1);
		p1.addComment(comentario2);
		
		
		System.out.println(p1);
		
		
		
		
	}

}
