package components;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan(value = "components")
public class ObjectivesConfig {
    @Bean
    @Qualifier("objectifPanda")
    public List<IObjectives> getObjectivesPanda(){
        IObjectives spl1 = new ObjectifPanda(2,"green",3);
        IObjectives spl2 = new ObjectifPanda(2,"green",3);
        IObjectives spl3 = new ObjectifPanda(2,"green",3);
        IObjectives spl4 = new ObjectifPanda(2,"green",3);
        List<IObjectives> listOfObjectives= new ArrayList();
        listOfObjectives.add(spl1);
        listOfObjectives.add(spl2);
        listOfObjectives.add(spl3);
        listOfObjectives.add(spl4);
        return  listOfObjectives;
    }

    @Bean
    @Qualifier("objectifGardener")
    public List<IObjectives> getObjectivesGarneder(){
        IObjectives spl1 = new ObjectifGardener(2,"green",3);
        IObjectives spl2 = new ObjectifGardener(2,"green",3);
        IObjectives spl3 = new ObjectifGardener(2,"green",3);
        //IObjectives spl4 = new ObjectifGardener(2,"green",3);
        List<IObjectives> listOfObjectives= new ArrayList();
        listOfObjectives.add(spl1);
        listOfObjectives.add(spl2);
        listOfObjectives.add(spl3);
        //listOfObjectives.add(spl4);
        return  listOfObjectives;
    }
}
