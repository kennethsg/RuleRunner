package ksolano;
/**
 * Provides common methods and fields for all the rules
 */
public abstract class Rule implements Runnable
{
    // **************************************************
    // Fields
    // **************************************************
    protected Data arguments;
    protected Logger logger;

    // **************************************************
    // Constructor
    // **************************************************
    protected Rule(Data arguments, Logger logger){
	this.arguments = arguments;
	this.logger = logger;
    }
    
    // **************************************************
    // Protected methods
    // **************************************************
    
    /**
     * Acts upon rule success or failure
     * 
     * @param result
     */
    protected void checkSuccess(boolean result){
	if(result){
	    onPass(getClass().getSimpleName());
	} else {
	    onFail(getClass().getSimpleName());
	}
    }

    // **************************************************
    // Private methods
    // **************************************************
    private void onPass(String className){
	logger.incrementRulesPassed();
	logger.update("Rule " + className + " passed");
    }
    
    private void onFail(String className){
	logger.update("Rule " + className + " failed");
    }
}
