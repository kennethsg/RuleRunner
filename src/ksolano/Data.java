package ksolano;
/**
 * 
 * Encapsulates the array of data containing the integers
 * entered by the user as arguments so they are read-only
 * 
 * @author Kenneth Solano
 *
 */
public class Data
{
    // **************************************************
    // Fields
    // **************************************************
    private int[] arguments;

    // **************************************************
    // Constructor
    // **************************************************
    Data(int[] arguments){
	this.arguments = arguments;
    }
    
    /**
     * 
     * Returns the length of the array
     * 
     * @return arguments.length
     */
    public int getLength(){
	return arguments.length;
    }
    
    /**
     * 
     * Receives the index of the array
     * and returns the integer stored
     * at that index
     * 
     * @param i
     * @return arguments[i]
     */
    public int getDataAt(int i){
	return arguments[i];
    }

}
