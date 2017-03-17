import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

/**
 * Created by sut on 2017/3/17.
 */
@SpringBootApplication
@EnableAutoConfiguration
@ImportResource({"classpath:provider.xml"})
@ComponentScan(value = "com.skyon.pms")
public class SpringApplicationC {

    public static void main(String[] args) {
        SpringApplication.run(SpringApplicationC.class);
    }

}
