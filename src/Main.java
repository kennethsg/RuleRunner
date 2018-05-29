import ksolano.RuleRunner;

import java.util.Scanner;
/**
 * This only runs the RuleRunner
 * 
 * @author Kenneth Solano
 */
public class Main
{

    public static void main(String[] args)
    {
	RuleRunner ruleRunner = new RuleRunner(args);
	ruleRunner.runRules();

	
	System.out.println("\n\nPress any key to end program");
            
        Scanner console = new Scanner(System.in);
        console.nextLine();
        console.close();
        System.exit(0);
        
    }
}
