package ra.luyentapbuoi3_valitor;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class LuyentapBuoi3ValitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(LuyentapBuoi3ValitorApplication.class, args);
	}

	@Bean
	public ModelMapper modelMapper (){
		return new ModelMapper();
	}

}
