package com.gex.mineater.elements;

public class Cell {
	boolean isFixed;
	boolean isSteppable;
	
	public Cell(boolean isFixed, boolean isSteppable) {
		this.isFixed = isFixed;
		this.isSteppable = isSteppable;
	}

	public boolean isFixed() {
		return isFixed;
	}

	public void setFixed(boolean isFixed) {
		this.isFixed = isFixed;
	}

	public boolean isSteppable() {
		return isSteppable;
	}

	public void setSteppable(boolean isSteppable) {
		this.isSteppable = isSteppable;
	}
	
	
}
