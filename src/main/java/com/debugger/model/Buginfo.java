package com.debugger.model;

import com.debugger.pojo.BugInfo;

public class Buginfo {
  private Long id;
  private java.sql.Timestamp death_time;
  private Double end_lat;
  private Double end_lon;
  private boolean if_need_start_time;
  private boolean is_moved;
  private Long lifecount;
  private String planter;
  private java.sql.Timestamp start_time;
  private Double start_lat;
  private Double start_lon;




  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public java.sql.Timestamp getDeath_time() {
    return death_time;
  }

  public void setDeath_time(java.sql.Timestamp death_time) {
    this.death_time = death_time;
  }

  public Double getEnd_lat() {
    return end_lat;
  }

  public void setEnd_lat(Double end_lat) {
    this.end_lat = end_lat;
  }

  public Double getEnd_lon() {
    return end_lon;
  }

  public void setEnd_lon(Double end_lon) {
    this.end_lon = end_lon;
  }

  public boolean getIf_need_start_time() {
    return if_need_start_time;
  }

  public void setIf_need_start_time(boolean if_need_start_time) {
    this.if_need_start_time = if_need_start_time;
  }

  public boolean getIs_moved() {
    return is_moved;
  }

  public void setIs_moved(boolean is_moved) {
    this.is_moved = is_moved;
  }

  public Long getLifecount() {
    return lifecount;
  }

  public void setLifecount(Long lifecount) {
    this.lifecount = lifecount;
  }

  public String getPlanter() {
    return planter;
  }

  public void setPlanter(String planter) {
    this.planter = planter;
  }

  public java.sql.Timestamp getStart_time() {
    return start_time;
  }

  public void setStart_time(java.sql.Timestamp start_time) {
    this.start_time = start_time;
  }

  public Double getStart_lat() {
    return start_lat;
  }

  public void setStart_lat(Double start_lat) {
    this.start_lat = start_lat;
  }

  public Double getStart_lon() {
    return start_lon;
  }

  public void setStart_lon(Double start_lon) {
    this.start_lon = start_lon;
  }

  public  void  transfromBugInfo(BugInfo bugInfo){

     death_time =bugInfo.getDeathTime();
      end_lat =bugInfo.getEnd_lat();
      end_lon =bugInfo.getEnd_lon();
      if_need_start_time=bugInfo.isIfNeedStartTime();
      is_moved=bugInfo.isMoved();
      lifecount=new Long( bugInfo.getLifecount());
      planter=bugInfo.getPlanter();
      start_time=bugInfo.getStartTime();
      start_lat=bugInfo.getStart_lat();
      start_lon=bugInfo.getStart_lat();
  }
}
