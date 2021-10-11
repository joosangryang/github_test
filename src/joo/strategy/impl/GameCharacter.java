package joo.strategy.impl;

import joo.strategy.inf.WeaponInf;

public class GameCharacter {
	
	private WeaponInf weapon;

	public WeaponInf getWeapon() {
		return weapon;
	}

	public void setWeapon(WeaponInf weapon) {
		this.weapon = weapon;
	}
	
	public void attack() {
		if(weapon == null) {
			System.out.println("hand attack!!");
		}else {
			weapon.attack();
		}
	}

}
