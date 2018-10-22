import components.CompConfig;
import components.TextEditor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import javax.annotation.Resource;
import javax.xml.soap.Text;

@PropertySource("application.properties")
public class Launcher {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(CompConfig.class);
        TextEditor txtEditor = context.getBean(TextEditor.class);

        txtEditor.spellCheck();

        context.close();
    }


}
