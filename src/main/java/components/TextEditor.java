package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TextEditor {
    private List<ISpellChecker> list;

    @Autowired
    public TextEditor(List<ISpellChecker> spl){
        this.list = spl;
    }

    public void spellCheck() {
        for (ISpellChecker l:list) {
            l.checkSpelling();
        }
   }
}