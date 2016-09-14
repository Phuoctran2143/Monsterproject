package monster.model;

public class MarshmallowMonster
{

	private String name;
	private double antennaCount;
	private int eyeCount;
	private boolean hasBellyButton;
	private int armCount;
	private int noseCount;

	public MarshmallowMonster()
	{

		this.name = "no name here";
		this.antennaCount = -234.131235;
		this.eyeCount = -2345678; 
		this.hasBellyButton = false;
		this.armCount = 32436;
		this.noseCount = -7765;
	}

	public MarshmallowMonster(String name, double antennaCount, int eyeCount, Boolean hasBellyButton, int armCount, 
			int noseCount)
	{
		this.name = name;
		this.antennaCount = antennaCount;
		this.eyeCount = eyeCount;
		this.hasBellyButton = hasBellyButton;
		this.armCount = armCount;
		this.noseCount = noseCount;
			
	}	
    
	
	public String toString()
	{
		String description = "Name is " + this.name;
		
		return description;
	}
	public String getName()
	{
		return name;
	}
	public int getEyeCount()
	{
		return eyeCount;
	}
	public double getAntennaCount()
	{
		return antennaCount;
	}
	public boolean getHasBellyButton()
	{
		return hasBellyButton;
	}
	public int getArmCount()
	{
		return armCount;
	}
	public int getNoseCount()
	{
		return noseCount;
	}
}
