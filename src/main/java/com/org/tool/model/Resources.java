package com.org.tool.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "resources")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Resources {
	
	@Id
	@GeneratedValue
	private int Resource_ID;
	private String Resource_Name;
	private String SOW_Category;
	private String Billing_Type;
	private String City;
	private String Shore;
	private String Skill_Set;
	
	public int getResource_ID() {
		return Resource_ID;
	}
	public void setResource_ID(int resource_ID) {
		Resource_ID = resource_ID;
	}
	public String getResource_Name() {
		return Resource_Name;
	}
	public void setResource_Name(String resource_Name) {
		Resource_Name = resource_Name;
	}
	public String getSOW_Category() {
		return SOW_Category;
	}
	public void setSOW_Category(String sOW_Category) {
		SOW_Category = sOW_Category;
	}
	public String getBilling_Type() {
		return Billing_Type;
	}
	public void setBilling_Type(String billing_Type) {
		Billing_Type = billing_Type;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getShore() {
		return Shore;
	}
	public void setShore(String shore) {
		Shore = shore;
	}
	public String getSkill_Set() {
		return Skill_Set;
	}
	public void setSkill_Set(String skill_Set) {
		Skill_Set = skill_Set;
	}
	@Override
	public String toString() {
		return "Resources [Resource_ID=" + Resource_ID + ", Resource_Name=" + Resource_Name + ", SOW_Category="
				+ SOW_Category + ", Billing_Type=" + Billing_Type + ", City=" + City + ", Shore=" + Shore
				+ ", Skill_Set=" + Skill_Set + "]";
	}
}
