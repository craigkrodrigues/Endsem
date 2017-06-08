import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class BallotUI 
{
    // instance variables 
	int voters;
	 ArrayList votea = new ArrayList();
	 ArrayList names = new ArrayList();
    private Scanner keyboard;
    public BallotManager ballot=new BallotManager("Fred","Bill","Joe","Jane");
    private String votingMessage;

    /**
     * Constructor for objects of class HW3BankAccountUI
     */
    public BallotUI()
    {
        keyboard = new Scanner(System.in);
    }

    /**
     * The top level menu
     */
    public void menu()    
    {
        int command = -1;
       
        while(command != 0)        
        {
        	
        
            displayMainMenu();
            command = getCommand();
            if(command<5){
            	
            votea.add(command);
            voters++;
        	names.add("voter" +voters);
            }
            execute(command);
        }
    }

    /**
     * Displays the instructions for the top level menu
     */
    private void displayMainMenu()
    {
        System.out.println("Options are");
        System.out.println("    To vote for Fred          Enter 1");
        System.out.println("    To vote for Bill          Enter 2");
        System.out.println("    To vote for Joe           Enter 3"); 
        System.out.println("    To vote for Jane          Enter 4");
        System.out.println("    To reset          Enter 5");
        System.out.println("To close    Enter 0");
        System.out.println("    To check the number of voters Enter Any number greater than 5");
    }

    /**
     * Calls the method appropriate to the command received
     */
    private void execute(int command)
    {
        if(command == 1)
        {
            ballot.castVote(1);
        }
        else if(command == 2)
        {
            ballot.candidate2.incrementVoteCount();
        }
        else if(command == 3)
        {

            ballot.candidate3.incrementVoteCount();
        }
        else if(command == 4)
        {
            ballot.candidate4.incrementVoteCount();
        }            
        else if(command==5)
        {
        	voters=0;
        	System.out.println("resetting counter");
        	
        }
        else if(command == 0)
        {
            System.out.println(" Program closing down");
            ballot.reportResults();
        }
        else
        {
            System.out.println("No of voters are:" + voters);
           // ballot.candidate.castVote();
            Voters();
        }

    }

    /**
     * Receives the specified command
     */
    private int getCommand()
    {
        System.out.print("Enter command: ");
        //votea.add(keyboard.nextInt());
        return keyboard.nextInt();
    }

    /**
     * Method printBookingDetails
     * This method allows you to print the full booking details, including title, full name, booking number and room type.
     */
    private void setupBallot()
    {
       displayMainMenu();
    }
    public void Voters()
    {
    	 for (int k1 = 0; k1 < names.size(); k1++) {
             System.out.println (names.get(k1) + " :  Voted for Candidate" + votea.get(k1));
          } 
    	
    }

}
