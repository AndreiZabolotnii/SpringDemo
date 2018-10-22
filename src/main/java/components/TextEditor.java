package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

@Component
public class TextEditor {
    private SpellChecker spl;

    @Autowired
    public TextEditor(SpellChecker spl){
        this.spl = spl;
    }

    public SpellChecker getSpellChecker() {
        return spl;
    }

    public void spellCheck() {
        spl.checkSpelling();
   }
}