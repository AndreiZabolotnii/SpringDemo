package components;
import jdk.nashorn.internal.ir.LiteralNode;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import javax.imageio.spi.IIOServiceProvider;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "components")
@PropertySource("application.properties")
public class CompConfig {
    private ISpellChecker spl1 = new SpellChecker();

    @Bean
    public SpellChecker getSpellChecker(){
        List listOfSpl= new ArrayList();
        listOfSpl.add("First");
        listOfSpl.add("Second");
        listOfSpl.add("Third");
        spl1.setLs(listOfSpl);
        return (SpellChecker) spl1;
    }
}
