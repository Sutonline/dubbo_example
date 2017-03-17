import com.skyon.pms.entity.Activity;
import com.skyon.pms.service.ActivityService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ImportResource;

import java.util.List;

/**
 * Created by sut on 2017/3/17.
 */
@SpringBootApplication
@ComponentScan(value = "com.skyon.pms")
@ImportResource("classpath:Consumer.xml")
public class Application {

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(Application.class);
        ActivityService activityService = (ActivityService) applicationContext.getBean("activityService1");
        ActivityService activityService2 = (ActivityService) applicationContext.getBean("activityService2");
        List<Activity> list = activityService.getActivity();
        List<Activity> list2 = activityService2.getActivity();
        System.out.println(list.size() + "----" + list.toString() + list.get(0).getActivityCode());
        System.out.println(list2.size() + "----" + list2.toString() + list2.get(0).getActivityCode());
    }
}
