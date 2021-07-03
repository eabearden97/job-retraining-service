package com.synergy.repositories.mappers;

import com.synergy.models.Skill;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class SkillMapper implements RowMapper<Skill> {

    @Override
    public Skill mapRow(ResultSet resultSet, int i) throws SQLException {
        Skill skill = new Skill();
        skill.setSkillId(resultSet.getInt("skillId"));
        skill.setSkillName(resultSet.getString("skillName"));
        return skill;
    }
}
