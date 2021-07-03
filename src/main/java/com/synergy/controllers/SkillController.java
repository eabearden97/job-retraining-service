package com.synergy.controllers;

import com.synergy.models.Skill;
import com.synergy.services.SkillService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

import static java.util.Objects.isNull;

@Controller
public class SkillController {

    @Autowired private SkillService skillService;

    public SkillController(SkillService skillService) {
        this.skillService = skillService;
    }

    @GetMapping("/skills/{skillId}")
    public ResponseEntity<Skill> findBySkillId(@PathVariable Integer skillId) {
        Skill skill = skillService.findBySkillId(skillId);
        if (isNull(skill)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/skills/{skillName}")
    public ResponseEntity<Skill> findBySkillName(@PathVariable String skillName) {
        Skill skill = skillService.findBySkillName(skillName);
        if (isNull(skill)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

    @GetMapping("/skills")
    public ResponseEntity<List<Skill>> findAllSkills() {
        List<Skill> skills = skillService.findAllSkills();
        if (isNull(skills)) {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
        return new ResponseEntity<>(HttpStatus.OK);
    }

}
