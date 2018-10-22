package components;

import java.util.List;

public interface ISpellChecker {

    void setLs(List ls);
    List getLs();
    void checkSpelling();

}
