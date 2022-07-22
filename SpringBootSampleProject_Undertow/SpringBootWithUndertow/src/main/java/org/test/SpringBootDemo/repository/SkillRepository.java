package org.test.SpringBootDemo.repository;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.test.SpringBootDemo.model.Skill;

public interface SkillRepository extends CrudRepository<Skill, Long> {
    public List<Skill> findByLabel(String label);

}