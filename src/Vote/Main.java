package Vote;

//import static Vote.Vote.sout2;

public class Main {
    public static void main(String[] args) {
        //Vote voice = new Vote();
        //IVoting[] votes = new Vote[10];

        // String user = "I user";
       // String pass = "132468";
        //votes[0] = new Vote("user1", "pass1", "1", "1",1);
        //votes[1] = new Vote("user2", "pass2", "1", "2",2);
       IVoting vote1 = new Vote("user1", "pass1", "1", "1",1);
        IVoting vote2 = new Vote("user2", "pass2", "1", "2",2);
        //IVoting vote2 = new Vote("user2", "pass2", "1", "2",2);
        IVoting iVoting = new Vote();
        iVoting.registration(vote1);
        iVoting.registration(vote2);
//
        iVoting.soutVoters();
       System.out.println("/////////////////////");
        iVoting.sout2();


    }
}
