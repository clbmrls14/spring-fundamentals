import com.pluralsight.util.CalendarFactory;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.Calendar;

@Configuration
@ComponentScan({"com.pluralsight"})
public class AppConfig {

    @Bean(name="cal")
    public CalendarFactory calendarFactory() {
        CalendarFactory factory = new CalendarFactory();
        factory.addDays(2);
        return factory;
    }

    @Bean
    public Calendar calendar() throws Exception {
        return calendarFactory().getObject();
    }

//    @Bean(name = "speakerService")
//    @Scope(value= BeanDefinition.SCOPE_SINGLETON)
//    public SpeakerService getSpeakerService() {
//        //System.out.println("Entered getSpeakerService in AppConfig...");
//        //SpeakerServiceImpl service = new SpeakerServiceImpl(getSpeakerRepository());
//        SpeakerServiceImpl service = new SpeakerServiceImpl();
//        //service.setRepository(getSpeakerRepository());
//        return service;
//    }

//    @Bean(name = "speakerRepository")
//    public SpeakerRepository getSpeakerRepository() {
//        //System.out.println("Entered getSpeakerRepository in AppConfig...");
//        return new HibernateSpeakerRepositoryImpl();
//    }

}
