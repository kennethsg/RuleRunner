package rules;

import ksolano.Data;
import ksolano.Logger;
import ksolano.Rule;

/**
 * If any 2 sequential integers in the sequence add up to 1000 or greater, the rule is passed.
 * If not, the rule is failed.
 */
public class RuleA extends Rule
{
    // **************************************************
    // Constructor
    // **************************************************
    public RuleA(Data arguments, Logger logger){
	super(arguments, logger);
    }
    
    public void run(){
	boolean result = (arguments.getLength() > 1) ?runN() :run1();
	
	checkSuccess(result);
    }

    // **************************************************
    // Private methods
    // **************************************************
    
    // For an array of length 2 or more
    private boolean runN(){
	boolean result = false;
	
	for (int i=0; !result && i < arguments.getLength()-1; i++)
	{
	   if(arguments.getDataAt(i) + arguments.getDataAt(i+1) >= 1000){
	       result = true;
	   }
	}

	return result;
    }
    
    // For an array of length 1 or less
    private boolean run1(){
	return (arguments.getLength() > 0) ?(arguments.getDataAt(0) >= 1000) :false;
    }
    
    
}
