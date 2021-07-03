package com.synergy.models;

import java.util.List;

public final class Occupation {

    // variables
    private Integer occupationId;
    private String occupationName;
    private List<Skill> skillsUsedInOccupation;

    // constructor
    public Occupation(Integer occupationId, String occupationName, List<Skill> skillsUsedInOccupation) {
        this.occupationId = occupationId;
        this.occupationName = occupationName;
        this.skillsUsedInOccupation = skillsUsedInOccupation;
    }

    // getters
    public Integer getOccupationId() {
        return occupationId;
    }
    public String getOccupationName() {
        return occupationName;
    }
    public List<Skill> getSkillsUsedInOccupation() {
        return skillsUsedInOccupation;
    }

}
