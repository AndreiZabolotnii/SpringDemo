package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.List;
@Component
public class CarteObjectives {

    @Autowired
    @Qualifier("objectifPanda")
    private List<IObjectives> objP;

    @Autowired
    @Qualifier("objectifGardener")
    private List<IObjectives> objG;

    public List<IObjectives> getObjP() {
        return objP;
    }

    public List<IObjectives> getObjG(){
        return objG;
    }

    public void verifyObjAccomplishment(){
        for (IObjectives o : objP) {
            o.checkObjectif();
            System.out.println(o.getClass());
        }
        System.out.println("");

        for (IObjectives o : objG) {
            o.checkObjectif();
            System.out.println(o.getClass());
        }
    }
}