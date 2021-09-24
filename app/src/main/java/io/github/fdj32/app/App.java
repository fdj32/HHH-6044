/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package io.github.fdj32.app;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import io.github.fdj32.app.dao.CompositePrimaryKey;
import io.github.fdj32.app.dao.CompositePrimaryKey3;
import io.github.fdj32.app.dao.CompositePrimaryKey4;
import io.github.fdj32.app.dao.HelloChina;
import io.github.fdj32.app.dao.HelloChinaRepository;
import io.github.fdj32.app.dao.HelloMoon;
import io.github.fdj32.app.dao.HelloMoonRepository;
import io.github.fdj32.app.dao.HelloSun;
import io.github.fdj32.app.dao.HelloSunRepository;
import io.github.fdj32.app.dao.HelloWorld;
import io.github.fdj32.app.dao.HelloWorldRepository;

@ComponentScan
@EnableAutoConfiguration
@SpringBootApplication
public class App {

	private static final Logger LOG = LoggerFactory.getLogger(App.class);
	@Autowired
	private HelloWorldRepository helloWorldRepository;

	@Autowired
	private HelloChinaRepository helloChinaRepository;

	@Autowired
	private HelloSunRepository helloSunRepository;

	@Autowired
	private HelloMoonRepository helloMoonRepository;

	public static void main(String[] args) {
		SpringApplication.run(App.class, args);
	}

	@Bean
	public ApplicationRunner anApplicationRunner() {
		return new ApplicationRunner() {

			@Override
			public void run(ApplicationArguments args) throws Exception {

				insertHelloChina();
				insertHelloWorld();
				insertHelloSun();
				insertHelloMoon();

			}

		};
	}

	private void insertHelloWorld() {
		long count = helloWorldRepository.count();
		LOG.info("helloWorldRepository.count() = {}", count);

		HelloWorld h = new HelloWorld();
		h.setId(new CompositePrimaryKey(1));
		h.setUsername("nick");
		h.setCountry("china");
		helloWorldRepository.save(h);
		LOG.info("HelloWorld.IdentityId = {}", h.getIdentityId());

		count = helloWorldRepository.count();
		LOG.info("helloWorldRepository.count() = {}", count);
	}

	private void insertHelloChina() {
		long count = helloChinaRepository.count();
		LOG.info("helloChinaRepository.count() = {}", count);

		HelloChina h = new HelloChina();
		h.setUsername("nick");
		helloChinaRepository.save(h);
		LOG.info("HelloChina.IdentityId = {}", h.getIdentityId());

		count = helloChinaRepository.count();
		LOG.info("helloChinaRepository.count() = {}", count);
	}

	private void insertHelloSun() {
		long count = helloSunRepository.count();
		LOG.info("helloSunRepository.count() = {}", count);

		HelloSun h = new HelloSun();
		h.setId(new CompositePrimaryKey3(1, "China"));
		h.setUsername("nick");
		helloSunRepository.save(h);
		LOG.info("HelloSun.IdentityId = {}", h.getIdentityId());

		count = helloSunRepository.count();
		LOG.info("helloSunRepository.count() = {}", count);
	}

	private void insertHelloMoon() {
		long count = helloMoonRepository.count();
		LOG.info("helloMoonRepository.count() = {}", count);

		HelloMoon h = new HelloMoon();
		h.setCpk4(new CompositePrimaryKey4(1, "China", "nick"));
		h.setDate(new Date());
		helloMoonRepository.save(h);
		LOG.info("HelloMoon.IdentityId = {}", h.getCpk4().getIdentityId());

		count = helloMoonRepository.count();
		LOG.info("helloMoonRepository.count() = {}", count);
	}
}
