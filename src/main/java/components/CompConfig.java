package components;
import jdk.nashorn.internal.ir.LiteralNode;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import javax.imageio.spi.IIOServiceProvider;
import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(basePackages = "components")
public class CompConfig {
    private ISpellChecker spl1,spl2,spl3;
    @Bean
    public List<ISpellChecker> getSpellChecker(){
        List<ISpellChecker> listOfSlp= new ArrayList<ISpellChecker>();

        spl1 = new SpellChecker();
        spl1.setDemoText("First");

        spl2 = new SpellChecker();
        spl2.setDemoText("Second");

        spl3 = new SpellChecker();
        spl3.setDemoText("Third");

        listOfSlp.add(spl1);
        listOfSlp.add(spl2);
        listOfSlp.add(spl3);

        return listOfSlp;
    }
}
