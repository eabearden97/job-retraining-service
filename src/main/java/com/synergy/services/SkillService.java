package com.synergy.services;

import com.synergy.models.Skill;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface SkillService {

    Skill findBySkillId(Integer skillId);

    Skill findBySkillName(String skillName);

    List<Skill> findAllSkills();

}
