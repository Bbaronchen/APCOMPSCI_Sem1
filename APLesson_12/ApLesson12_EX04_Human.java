public class ApLesson12_EX04_Human
{
	private String hair, eyes, skin;
	
	public ApLesson12_EX04_Human(String h, String e, String s) 
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setCustom(String h, String e, String s)
	{
		hair = h;
		eyes = e;
		skin = s;
	}
	
	public void setHair(String h) 
	{
		hair = h;
	}
	
	public void setEyes(String e) 
	{
		eyes = e;
	}
	
	public void setSkin(String s)
	{
		skin = s;
	}
	
	public String getHair()
	{
		return hair;
	}
	
	public String getEyes() 
	{
		return eyes;
	}
	
	public String getSkin()
	{
		return skin;
	}
}
