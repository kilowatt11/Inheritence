package com.pnc;

import com.pnc.models.FireMonster;
import com.pnc.models.Monster;
import com.pnc.models.StoneMonster;
import com.pnc.models.WaterMonster;

public class TestMonster {

	public static void main(String[] args) {
		// Declare instances of the superclass, substituted by subclasses.
		Monster m1 = new FireMonster("r2u2");
		Monster m2 = new WaterMonster("u2r2");
		Monster m3 = new StoneMonster("r2r2");
		
		// Invoke the actual implementation
		System.out.println(m1.attack()); // Run FireMonster's attack()
		System.out.println(m2.attack()); // Run WaterMonster's attack()
		System.out.println(m3.attack()); // Run StoneMonster's attack()
		
		// m1 dies, generate a new instance and re-assign to m1.
		m1 = new StoneMonster("a2b2"); // upcast
		System.out.println(m1.attack()); // Run StoneMonster&#39;s attack()
		
		// We have a problem here!!!
		Monster m4 = new Monster("u2u2");
		System.out.println(m4.attack()); // garbage!!!
		
		
	}

}
