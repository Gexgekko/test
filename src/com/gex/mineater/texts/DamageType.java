package com.gex.mineater.texts;

public enum DamageType {
	FIRE(1, "Fire effect"),
	POISON(2, "Poison effect"),
	ELECTRICITY(3, "Electricity effect"),
	ICE(4, "Icw effect"),
	PHYSICAL(5, "Physical effect");
	
	private int type;
	private String text;
	
	DamageType(int type, String text) {
		this.type = type;
		this.text = text;
	}

	public int getType() {
		return type;
	}

	public void setType(int type) {
		this.type = type;
	}

	public String getText() {
		return text;
	}

	public void setText(String text) {
		this.text = text;
	}
	
	
}
