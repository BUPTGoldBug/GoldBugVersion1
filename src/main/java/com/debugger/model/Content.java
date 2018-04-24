
package com.debugger.model;

import com.debugger.pojo.BugInfo;

public class Content {
  private Long id;
  private String ans_1;
  private String ans_2;
  private String ans_3;
  private String ans_4;
  private Long bug_id;
  private Long content_type;
  private String description;
  private String key_;
  private String question;
  private Double score;
  private int arIndex;

  public int getArIndex() {
    return arIndex;
  }

  public void setArIndex(int arIndex) {
    this.arIndex = arIndex;
  }
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public String getAns_1() {
    return ans_1;
  }

  public void setAns_1(String ans_1) {
    this.ans_1 = ans_1;
  }

  public String getAns_2() {
    return ans_2;
  }

  public void setAns_2(String ans_2) {
    this.ans_2 = ans_2;
  }

  public String getAns_3() {
    return ans_3;
  }

  public void setAns_3(String ans_3) {
    this.ans_3 = ans_3;
  }

  public String getAns_4() {
    return ans_4;
  }

  public void setAns_4(String ans_4) {
    this.ans_4 = ans_4;
  }

  public Long getBug_id() {
    return bug_id;
  }

  public void setBug_id(Long bug_id) {
    this.bug_id = bug_id;
  }

  public Long getContent_type() {
    return content_type;
  }

  public void setContent_type(Long content_type) {
    this.content_type = content_type;
  }

  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public String getKey_() {
    return key_;
  }

  public void setKey_(String key_) {
    this.key_ = key_;
  }

  public String getQuestion() {
    return question;
  }

  public void setQuestion(String question) {
    this.question = question;
  }

  public Double getScore() {
    return score;
  }

  public void setScore(Double score) {
    this.score = score;
  }

  public void transfromBugInfo(com.debugger.pojo.Content bgContent,Long bugId){

     ans_1 =bgContent.getAns_1();
     ans_2 = bgContent.getAns_2();
      ans_3=bgContent.getAns_3();
      ans_4=bgContent.getAns_4();
      bug_id=bugId;
      content_type=new Long(bgContent.getContentType());
      description=bgContent.getDescription();
      key_=bgContent.getKey_();
      question=bgContent.getQuestion();
      score=bgContent.getScore();
      arIndex = bgContent.getArIndex();

  }
}
