package com.synergy.repositories.impl;

import com.synergy.models.Skill;
import com.synergy.repositories.SkillRepository;
import com.synergy.repositories.mappers.SkillMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;


import java.util.List;

@Repository
public class SkillRepositoryImpl implements SkillRepository {

    @Autowired private final JdbcTemplate jdbcTemplate;

    public SkillRepositoryImpl(JdbcTemplate jdbcTemplate) {
        this.jdbcTemplate = jdbcTemplate;
    }

    @Override
    public Skill findBySkillId(Integer skillId) {
        final String sql = "select skillId, skillName from Skill where skillId = ?";
        return jdbcTemplate.query(sql, new SkillMapper(), skillId).stream()
                .findFirst().orElse(null);
    }

    @Override
    public Skill findBySkillName(String skillName) {
        final String sql = "select skillId, skillName from Skill where skillName = ?";
        return jdbcTemplate.query(sql, new SkillMapper(), skillName).stream()
                .findFirst().orElse(null);
    }

    @Override
    public List<Skill> findAllSkills() {
        final String sql = "select skillId, skillName from Skill;";
        return jdbcTemplate.query(sql, new SkillMapper());
    }
}
