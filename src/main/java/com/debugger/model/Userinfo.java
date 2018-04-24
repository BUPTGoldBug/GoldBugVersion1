package com.debugger.model;

public class Userinfo {
  private Long id;
  private java.sql.Timestamp create_time;
  private String user_name;
  private String user_phone;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public java.sql.Timestamp getCreate_time() {
    return create_time;
  }

  public void setCreate_time(java.sql.Timestamp create_time) {
    this.create_time = create_time;
  }

  public String getUser_name() {
    return user_name;
  }

  public void setUser_name(String user_name) {
    this.user_name = user_name;
  }

  public String getUser_phone() {
    return user_phone;
  }

  public void setUser_phone(String user_phone) {
    this.user_phone = user_phone;
  }
}
