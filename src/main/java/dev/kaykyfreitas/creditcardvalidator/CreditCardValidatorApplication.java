package dev.kaykyfreitas.creditcardvalidator;

import dev.kaykyfreitas.creditcardvalidator.config.security.RSAKeyProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;

@SpringBootApplication
@EnableConfigurationProperties(RSAKeyProperties.class)
public class CreditCardValidatorApplication {

//	@Autowired
//	private JdbcTemplate jdbcTemplate;

	public static void main(String[] args) {
		SpringApplication.run(CreditCardValidatorApplication.class, args);
//		System.out.println(new BCryptPasswordEncoder().encode("S3nh4"));
//		System.out.println(UUID.randomUUID());
	}

//	@Bean
//	CommandLineRunner commandLineRunner(JdbcTemplate jdbcTemplate) {
//		return args -> {
//			jd
//			jdbcTemplate.execute(JdbcDaoImpl.DEFAULT_USER_SCHEMA_DDL_LOCATION);
//		};
//	}


}
