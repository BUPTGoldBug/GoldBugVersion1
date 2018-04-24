package com.debugger.model;

import com.debugger.pojo.BugInfo;

public class Buginfo2 {
  private Long id;
  private Double lat;
  private Long lifecount;
  private Double lon;
  private int status;
  private Long bug_id_id;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public Double getLat() {
    return lat;
  }

  public void setLat(Double lat) {
    this.lat = lat;
  }

  public Long getLifecount() {
    return lifecount;
  }

  public void setLifecount(Long lifecount) {
    this.lifecount = lifecount;
  }

  public Double getLon() {
    return lon;
  }

  public void setLon(Double lon) {
    this.lon = lon;
  }

  public int getStatus() {
    return status;
  }

  public void setStatus(int status) {
    this.status = status;
  }

  public Long getBug_id_id() {
    return bug_id_id;
  }

  public void setBug_id_id(Long bug_id_id) {
    this.bug_id_id = bug_id_id;
  }
  public void  transfromBugInfo(BugInfo bugInfo,Long bugid_id){
    lat =bugInfo.getStart_lat();
    lifecount = new Long(bugInfo.getLifecount());
    lon =bugInfo.getStart_lon();
    status = -1;
    this. bug_id_id = bugid_id;


  }
}
