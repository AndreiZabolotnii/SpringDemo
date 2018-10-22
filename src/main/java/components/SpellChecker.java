package components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;

public class SpellChecker implements ISpellChecker{
	List ls = new ArrayList();

	@Override
	public void setLs(List ls){
		this.ls = ls;
	}
	@Override
	public List getLs(){
		return ls;
	}
	@Override
	public void checkSpelling(){
        for (Object l : ls) {
            System.out.println("");
            System.out.println("");
            System.out.println("Inside checkSpelling." + l.toString());
            System.out.println("");
            System.out.println("");
        }
	}
}
