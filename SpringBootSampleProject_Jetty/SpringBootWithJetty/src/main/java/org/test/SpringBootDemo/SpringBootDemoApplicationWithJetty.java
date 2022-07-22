package org.test.SpringBootDemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.test.SpringBootDemo.model.Developer;
import org.test.SpringBootDemo.model.Skill;
import org.test.SpringBootDemo.repository.DeveloperRepository;
import org.test.SpringBootDemo.repository.SkillRepository;

@SpringBootApplication
public class SpringBootDemoApplicationWithJetty implements CommandLineRunner {
	@Autowired
	DeveloperRepository developerRepository;

	@Autowired
	SkillRepository skillRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringBootDemoApplicationWithJetty.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Skill javascript = new Skill("javascript", "Javascript language skill");
		Skill ruby = new Skill("ruby", "Ruby language skill");
		Skill emberjs = new Skill("emberjs", "Emberjs framework");
		Skill angularjs = new Skill("angularjs", "Angularjs framework");

		skillRepository.save(javascript);
		skillRepository.save(ruby);
		skillRepository.save(emberjs);
		skillRepository.save(angularjs);

		List<Developer> developers = new LinkedList<Developer>();
		developers.add(new Developer("John", "Smith", "john.smith@example.com",
				Arrays.asList(new Skill[] { javascript, ruby })));
		developers.add(new Developer("Mark", "Johnson", "mjohnson@example.com",
				Arrays.asList(new Skill[] { emberjs, ruby })));
		developers.add(new Developer("Michael", "Williams", "michael.williams@example.com",
				Arrays.asList(new Skill[] { angularjs, ruby })));
		developers.add(new Developer("Fred", "Miller", "f.miller@example.com",
				Arrays.asList(new Skill[] { emberjs, angularjs, javascript })));
		developers.add(new Developer("Bob", "Brown", "brown@example.com",
				Arrays.asList(new Skill[] { emberjs })));
		developerRepository.saveAll(developers);
	}
}
