package ksolano;

import rules.*;

/**
 * Entry point of the project.
 * 
 * This program test some array of data against some rules
 * and tells if the data has passed or failed
 * 
 * @Author Kenneth Solano
 */
public class RuleRunner
{
    // **************************************************
    // Fields
    // **************************************************
    Logger logger;
    private Validator validator;
    private Data arguments;

    // **************************************************
    // Constructor
    // **************************************************
    public RuleRunner(String[] argumentsRaw){
	logger = new Logger();
	this.validator = new Validator(argumentsRaw);
	this.arguments = this.validator.validate();
    }

    /**
     * Main program execution
     */
    public void runRules(){
	logger.update(validator.getResults());
	
	Rule ruleA = new RuleA(arguments, logger);
	Rule ruleB = new RuleB(arguments, logger);
	Rule ruleC = new RuleC(arguments, logger);
	
	Thread threadA = new Thread(ruleA);
	Thread threadB = new Thread(ruleB);
	Thread threadC = new Thread(ruleC);
	
	threadA.start();
	threadB.start();
	threadC.start();
	
	try{
	    threadA.join();
	    threadB.join();
	    threadC.join();
	} catch (InterruptedException e){
	    logger.update("Main thread interrupted");
	}
	
	if (logger.getRulesPassed() >= 3){
	    logger.update("All rules passed");
	}

    }
    
}
