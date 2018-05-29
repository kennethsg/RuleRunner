package ksolano;
/**
 * 
 * Manages data about program execution.
 * 
 * @author Kenneth Solano
 *
 */
public class Logger
{
    // **************************************************
    // Fields
    // **************************************************
    private int rulesPassed;

    // **************************************************
    // Constructor
    // **************************************************
    Logger(){
	this.rulesPassed = 0;
    }
    
    // **************************************************
    // Package access level methods
    // **************************************************
    
    /**
     * Prints text to CLI
     * @param text
     */
    void update(String text){
	System.out.println(text);
    }
    
    /**
     * increments the rulesPassed variable
     */
    synchronized void incrementRulesPassed(){
	rulesPassed++;
    }
    
    /**
     * 
     * Returns the number of rules that have been passed
     * 
     * @return rulesPassed
     */
    int getRulesPassed(){
	return rulesPassed;
    }
}
