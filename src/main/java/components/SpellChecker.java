package components;

public class SpellChecker implements ISpellChecker{
	String demoText;

	@Override
	public void setDemoText(String text){
		this.demoText = text;
	}
	@Override
	public String getDemoText(){
		return demoText;
	}
	@Override
	public void checkSpelling(){
		System.out.println("Inside checkSpelling." + demoText);
	}

}
