package Vote;

public interface IVoting {
    void registration(IVoting vote);
    void enter();
    void countVotes();
    void soutVoters();
    void sout2();

    int toCount();

    int toString(int vot);
}
