package com.synergy.models;

public class Skill {

    // variables
    private Integer skillId;
    private String skillName;

    // constructor
    public Skill(Integer skillId, String skillName) {
        this.skillId = skillId;
        this.skillName = skillName;
    }
    public Skill() { }

    // getters
    public Integer getSkillId() {
        return skillId;
    }
    public String getSkillName() {
        return skillName;
    }

    // setters
    public void setSkillId(Integer skillId) {
        this.skillId = skillId;
    }
    public void setSkillName(String skillName) {
        this.skillName = skillName;
    }

}
