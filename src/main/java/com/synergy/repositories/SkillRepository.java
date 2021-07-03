package com.synergy.repositories;

import com.synergy.models.Skill;

import java.util.List;

public interface SkillRepository {

    Skill findBySkillId(Integer skillId);

    Skill findBySkillName(String skillName);

    List<Skill> findAllSkills();
}
