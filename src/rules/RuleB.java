package rules;

import ksolano.Data;
import ksolano.Logger;
import ksolano.Rule;

/**
 * If any integer in the sequence is at least 500 greater 
 * than the one previous to it in the sequence, 
 * the rule is passed, else it's failed
 */
public class RuleB extends Rule
{
    // **************************************************
    // Constructor
    // **************************************************
    public RuleB(Data arguments, Logger logger){
	super(arguments, logger);
    }
    
    public void run(){
	boolean result = false;
	if(arguments.getLength() > 1){
	    for (int i=0; !result && i < arguments.getLength()-1; i++){
		if(arguments.getDataAt(i+1) >= arguments.getDataAt(i)+500){
		    result = true;
		}
	    }
	}
	
	checkSuccess(result);
    }
}
