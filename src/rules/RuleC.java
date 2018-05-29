package rules;

import ksolano.Data;
import ksolano.Logger;
import ksolano.Rule;

/**
 * If the average of all the integers in the sequence is 500 or greater,
 * the rule is passed, else it is failed.
 */
public class RuleC extends Rule
{
    // **************************************************
    // Constructor
    // **************************************************
    public RuleC(Data arguments, Logger logger){
	super(arguments, logger);
    }
    
    public void run(){
	checkSuccess(getAverage() >= 500);
    }

    // **************************************************
    // Private Methods
    // **************************************************
    
    // Calculates and return the average of the integers in the array of data
    private int getAverage(){
	int average = 0;
	
	if(arguments.getLength() > 0){
	    int sum = 0;
	    for(int i=0; i < arguments.getLength(); i++){
		sum += arguments.getDataAt(i);
	    }

	    average = (sum / arguments.getLength());
	}
	
	return average;
    }
}
