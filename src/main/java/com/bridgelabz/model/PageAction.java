package com.bridgelabz.model;

public class PageAction 
{
	private String pageId;
	private String actionId ;
	private String pageName ;
	
	public PageAction (String pageId, String actionId, String pageName) 
	{
		setPageId(pageId);
		setActionId(actionId);
		setPageName(pageName);
		
	}
	public String getPageId() 
	{
		return pageId;
	}
	
	public void setPageId(String pageId)
	{
		this.pageId = pageId;
	}
	
	public String getPageName() 
	{
		return pageName;
	}
	
	public void setPageName(String pageName)
	{
		this.pageName = pageName;
	}
	
	public String getActionId() 
	{
		return pageId;
	}
	
	public void setActionId(String actionId)
	{
		this.actionId = actionId;
	}
}

