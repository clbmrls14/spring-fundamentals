import com.pluralsight.model.Speaker;
import com.pluralsight.service.SpeakerService;
import com.pluralsight.service.SpeakerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;

public class Application {
    public static void main(String args[]) {
        System.out.println("Creating appContext...");
        ApplicationContext appContext = new AnnotationConfigApplicationContext(AppConfig.class);

        //SpeakerService service = new SpeakerServiceImpl();

        System.out.println("Creating service...");
        SpeakerService service = appContext.getBean("speakerService", SpeakerService.class);

        Speaker speaker = service.findAll().get(0);

        System.out.println("#####\n" + speaker.getFirstName());
        System.out.println(speaker.getSeedNum());

    }
}
