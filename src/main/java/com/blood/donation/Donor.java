
package com.blood.donation;

public class Donor {

private String D_ID;
private String D_Name;
private String D_City;
private String D_bloodGroup;
private String D_State;
private String D_MobileNo;

public Donor() {}

public Donor(String d_ID, String d_Name, String d_City, String d_bloodGroup, String d_State, String d_MobileNo) {
	super();
	D_ID = d_ID;
	D_Name = d_Name;
	D_City = d_City;
	D_bloodGroup = d_bloodGroup;
	D_State = d_State;
	D_MobileNo = d_MobileNo;
}

public String getD_ID() {
	return D_ID;
}

public void setD_ID(String d_ID) {
	D_ID = d_ID;
}

public String getD_Name() {
	return D_Name;
}

public void setD_Name(String d_Name) {
	D_Name = d_Name;
}

public String getD_City() {
	return D_City;
}

public void setD_City(String d_City) {
	D_City = d_City;
}

public String getD_bloodGroup() {
	return D_bloodGroup;
}

public void setD_bloodGroup(String d_bloodGroup) {
	D_bloodGroup = d_bloodGroup;
}

public String getD_State() {
	return D_State;
}

public void setD_State(String d_State) {
	D_State = d_State;
}

public String getD_MobileNo() {
	return D_MobileNo;
}

public void setD_MobileNo(String d_MobileNo) {
	D_MobileNo = d_MobileNo;
}

}