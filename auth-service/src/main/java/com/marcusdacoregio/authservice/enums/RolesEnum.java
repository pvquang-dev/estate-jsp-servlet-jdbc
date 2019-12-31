package com.marcusdacoregio.authservice.enums;

public enum RolesEnum {
	
	CREATE_PROJECT("Create_Project"),
    EDIT_PROJECT("Edit_Project"),
    MANAGER_MEMBER("Manager_Member"),
    
    ADD_MEMBER("Add_Member"),
    REMOVE_MEMBER("Remove_Member"),
    CHANGE_ROLES("Change_Roles"),
    
    CREATE_TEST_SUITE("Create_Test_Suite"),
    EDIT_TEST_SUITE("Create_Test_Suite"),
    DELETE_TEST_SUITE("Create_Test_Suite"),
    
    CREATE_TEST_CASE("Create_Test_Suite"),
    EDIT_TEST_CASE("Create_Test_Suite"),
    DELETE_TEST_CASE("Create_Test_Suite"),
    
    CREATE_JOB_EXCUTION("Create_Job_Excution"),
    EXCUTION("Excution"),
    UPDATE_EXCUTION_RESULT("Update_Excution_Result"),
    
    CREATE_WIDGET("Create_Widget"),
    EDIT_WIDGET("Edit_Widge"),
    DELETE_WIDGET("Delete_Widge"),
    
    CREATE_ENVIRONMENT("Create_Environment"),
    EDIT_ENVIRONMENT("Edit_Environment"),
    DELETE_ENVIRONMENT("Delete_Environment"),
    
	CREATE_ORGANISATION("Create_Organisation"),
    EDIT_ORGANISATION("Edit_Organisation"),
    DELETE_ORGANISATION("Delete_Organisation");
	private final String type;

    RolesEnum(String type) {
    	this.type = type;
    }
	
	public String getType() {
        return type;
    }

}
