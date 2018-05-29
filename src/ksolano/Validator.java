package ksolano;
/**
 * Validates the data entered by the user
 * 
 * @author Kenneth Solano
 */
class Validator
{
    private String[] argumentsRaw;
    private String results;

    // **************************************************
    // Constructor
    // **************************************************
    Validator(String[] argumentsRaw){
	this.argumentsRaw = argumentsRaw;
	this.results = "";
    }
    
    /**
     * 
     * If the CLI arguments is made of integers return the array converted to integer type,
     * else returns an integer array of length 0
     * 
     * @return arguments
     */
    Data validate(){
	int[] arguments = new int[argumentsRaw.length];
	try{
	    for(int i=0; i < argumentsRaw.length; i++){
		arguments[i] = Integer.valueOf(argumentsRaw[i]);
	    }
	}catch(Exception e){
	    results += "Command-line arguments must be integers only";
	    arguments = new int[0];
	}
	return new Data(arguments);
    }
    
    /**
     * return the messages from the Validator instance
     * 
     * @return results
     */
    String getResults(){
	return this.results;
    }
}
