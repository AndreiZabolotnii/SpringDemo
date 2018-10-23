import components.ObjectivesConfig;
import components.CarteObjectives;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.PropertySource;
@PropertySource("application.properties")
public class Launcher {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(ObjectivesConfig.class);
        CarteObjectives allObjectives = context.getBean(CarteObjectives.class);
        allObjectives.verifyObjAccomplishment();
        context.close();
    }
}
