package com.gex.mineater.elements;

import com.gex.mineater.texts.DamageType;

public class TrapEffect {

	private int dam_turn; // DAMAGE PER TURN
	private int dam_direct; // DIRECT DAMAGE
	private int dam_duration; // DURATION IN TURNS OF DAMAGE
	private DamageType dam_type; // DAMAGE TYPE
	
	public TrapEffect(int dam_turn, int dam_direct, int dam_duration, DamageType dam_type) {
		super();
		this.dam_turn = dam_turn;
		this.dam_direct = dam_direct;
		this.dam_duration = dam_duration;
		this.dam_type = dam_type;
	}
	public int getDam_turn() {
		return dam_turn;
	}
	public void setDam_turn(int dam_turn) {
		this.dam_turn = dam_turn;
	}
	public int getDam_direct() {
		return dam_direct;
	}
	public void setDam_direct(int dam_direct) {
		this.dam_direct = dam_direct;
	}
	public int getDam_duration() {
		return dam_duration;
	}
	public void setDam_duration(int dam_duration) {
		this.dam_duration = dam_duration;
	}
	public DamageType getDam_type() {
		return dam_type;
	}
	public void setDam_type(DamageType dam_type) {
		this.dam_type = dam_type;
	}
	
	
}
