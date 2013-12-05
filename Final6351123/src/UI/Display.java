package UI;
import backend.CompSystem;
import backend.Recommendation;


public class Display

{
	static CompSystem selectedSystem;
	static Recommendation myComponents;
	
public Display (CompSystem mySystem,Recommendation myParts){
	selectedSystem = mySystem;
    myComponents = myParts;
}

}