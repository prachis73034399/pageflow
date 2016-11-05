package com.bridgelabz.model;
import java.io.File;
import java.util.Date;

public class csvread
{
	private Integer playerId;
	private String sessionID;
	private Integer age;
	private String pageId;
	private String battingstyle ;
	private String bowlingstyle ;
	private String image ;
	private String img;
	private String teamName;
	public csvread () {}
	public csvread (String sessionId, Integer age, String pageId, String nationality, String battingstyle, String  bowlingstyle) 
	{
		setSessionId(sessionId);
		setPageId(pageId);
		setAge(age);
		setBattingstyle(battingstyle);
		setBowlingstyle(bowlingstyle);
		
	}

	public boolean isNew() 
	{
		return playerId == null;
	}

	public Integer getPlayerId() 
	{
		return playerId;
	}
	public void setPlayerId(Integer playerId) 
	{
		this.playerId = playerId;
	}
	public String getSessionId() 
	{
		return sessionID;
	}
	public void setSessionId(String playerName)
	{
		this.sessionID = playerName;
	}
	public Integer getAge()
	{
		return age;
	}
	public void setAge(Integer age) 
	{
		this.age = age;
	}
	public String getPageId() 
	{
		return pageId;
	}
	public void setPageId(String pageId) 
	{
		this.pageId = pageId;
	}
	public String getBattingstyle()
	{
		return battingstyle;
	}
	public void setBattingstyle(String battingstyle) 
	{
		this.battingstyle = battingstyle;
	}
	public String getBowlingstyle() 
	{
		return bowlingstyle;
	}
	public void setBowlingstyle(String bowlingstyle) 
	{
		this.bowlingstyle = bowlingstyle;
	}
	
	
	public String getImage() 
	{
		return image;
	}
	public void setImage(String image)
	{
		this.image = image;
	}
	
	public String getImg()
	{
		return img;
	}
	public void setImg(String img)
	{
		this.img = img;
	}
	public String getTeamName()
	{
		return teamName;
	}
	public void setTeamName(String teamName)
	{
		this.teamName = teamName;
	}
}
