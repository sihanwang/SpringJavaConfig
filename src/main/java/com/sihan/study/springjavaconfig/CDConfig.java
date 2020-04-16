package com.sihan.study.springjavaconfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.core.env.Environment;


@Configuration
@PropertySource("classpath:application.properties")
public class CDConfig {
	
	@Autowired
	Environment env;
	
	@Bean
	public CompactDisc compactDisc()
	{
		return new SgtPeppers(
				env.getProperty("disc.title"),
				env.getProperty("disc.artist")
				);
	}
}
