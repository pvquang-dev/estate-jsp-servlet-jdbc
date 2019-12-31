package com.marcusdacoregio.authservice.enums;

public enum RolesType implements RolesInterface{
	PROJECT("Project"),
	TEST_SUITE("TestSuite"),
	TEST_CASE("TestCase"),
	TEST_EXCUTION("TestExcution"),
	DASH_BOARD("DashBoard"),
	ENVIRONMENT("Environment"),
	ORGANISATION("Organisation");
    private String type;
    
    private RolesType(String type) {
		this.type = type;
	}

	@Override
	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}
    
    
 
}

