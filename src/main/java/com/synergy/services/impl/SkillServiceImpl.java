package com.synergy.services.impl;

import com.synergy.models.Skill;
import com.synergy.repositories.SkillRepository;
import com.synergy.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

import static java.util.Objects.isNull;

public class SkillServiceImpl implements SkillService {

    @Autowired SkillRepository skillRepository;

    public SkillServiceImpl(SkillRepository skillRepository) {
        this.skillRepository = skillRepository;
    }

    @Override
    public Skill findBySkillId(Integer skillId) {
        if (isNull(skillId)) {
            return null;
        }

        return skillRepository.findBySkillId(skillId);
    }

    @Override
    public Skill findBySkillName(String skillName) {
        if (isNull(skillName)) {
            return null;
        }

        return skillRepository.findBySkillName(skillName);
    }

    @Override
    public List<Skill> findAllSkills() {
        return skillRepository.findAllSkills();
    }
}
