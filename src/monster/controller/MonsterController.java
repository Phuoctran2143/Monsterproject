package monster.controller;

import monster.model.MarshmallowMonster;

public class MonsterController
{
	private MarshmallowMonster MrHappy;
	
	public MonsterController() {
		
	
			MrHappy = new MarshmallowMonster("MrHappy", 2.4, 3, false, 2, 3);

	}
	public void start()
	{
		System.out.println("here is my monster:" + MrHappy);
	    System.out.println("My monster has the many eyes:" + MrHappy);
		}
	}	


