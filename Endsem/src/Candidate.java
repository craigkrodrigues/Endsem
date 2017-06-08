public class Candidate

	{

	 

	    public String name;   

	    public int votes;

	 

	     

	    /**

	     * Candidate Constructor

	     *

	     * @param name of candidate

	     */

	    public Candidate(String name)

	    {       

	        this.name = name;

	        votes = 0;

	    }

	 

	    /**

	     * assigns a name to a candidate

	     *

	     * @param name of candidate

	     */
	    public void setName(String name)

	    {

	        this.name = name;

	    }

	     

	    /**

	     * adds 1 to the number of votes cast

	     *

	     */

	    public void incrementVoteCount()

	    {

	        votes++;

	    }

	 
	    /**

	     * provide the candidate's name

	     *

	     * @return candidate's name

	     */

	    public String getName()
	    {

	        return name;

	    }

	     
	    /**

	     * returns the number of votes for the candidate

	     *

	     * @return number of votes
	     */

	    public int getNumberOfVotes()

	    {

	        return votes;

	    }

	 

	}