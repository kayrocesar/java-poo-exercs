package entities;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class Post {

	private Date moment;
	private String title;
	private String content;
	private int likes;
	
	private List<Comment> comments= new ArrayList<>();
	
	public  Post() {
	
	}
	public Post(Date moment, String title, String content, int likes) {
		this.moment = moment;
		this.title = title;
		this.content = content;
		this.likes = likes;
	}

	public Date getMoment() {
		return moment;
	}
	public void setMoment(Date moment) {
		this.moment = moment;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public int getLikes() {
		return likes;
	}
	public void setLikes(int likes) {
		this.likes = likes;
	}
	
	public void addComment(Comment comment) {
		this.comments.add(comment);
	}
	public void removeComment(Comment comment) {
		this.comments.remove(comment);
	}
	@Override
	public String toString() {
		SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		String result="";
		for (Comment comment : comments) {
			result += "\n"+comment.getText();
		}
		return "" + title + "\n" +likes + " Likes - " + dateFormat.format(moment) +
				"\n" + content +
				"\nComments:" +result;
		
	}
	
	
	
	
	
	
}
