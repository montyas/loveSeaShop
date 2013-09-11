package com.lovesea.message.bean;

public class ParentButton {
	private SubButton[] sub_button;
	private String name;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public SubButton[] getSub_button() {
		return sub_button;
	}

	public void setSub_button(SubButton[] sub_button) {
		this.sub_button = sub_button;
	}

}
