package Vote;

public  class VoteMath implements IVoting {
    private String name;
    private String surname;
    private int vot;
    private String userName;
    private String password;

   /* public VoteMath(String name, String surname, int vot, String userName, String password) {
        this.name = name;
        this.surname = surname;
        this.vot = vot;
        this.userName = userName;
        this.password = password;
    }*/

/*    public VoteMath() {

    }*/


    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public int getVot() {
        return vot;
    }

    public void setVot(int vot) {
        this.vot = vot;
    }

    public IVoting[] getiVotings() {
        return iVotings;
    }

    public void setiVotings(IVoting[] iVotings) {
        this.iVotings = iVotings;
    }

    IVoting[] iVotings = new IVoting[10];

    @Override
    public void registration(IVoting v) {
        for (int i = 0; i < iVotings.length; i++) {
            if (iVotings[i] == null) {
                iVotings[i] = v;
                break;
            }
        }
    }

    @Override
    public void enter() {

    }

//private int toCount(){
//
//        return vote;
//}


    @Override
    public void countVotes() {
        for (IVoting iVoting: iVotings){
            if(iVoting == null)
                continue;
            System.out.println(((VoteMath)iVoting).getVot());
            System.out.println(iVoting.toString(getVot()));
        }}

    @Override
    public void soutVoters() {
        for (IVoting iVoting : iVotings) {
            if (iVoting == null)
                continue;
            System.out.println(iVoting);
        }
    }
    @Override
    public String toString() {
        return "Vote{" + getUserName() + " "
                + getPassword() + " "
                + getName() + " "
                + getSurname() + " "
                + getVot() + "}";
    }

    @Override
    public void sout2() {

    }

    @Override
    public int toCount() {
        return 0;
    }

    @Override
    public int toString(int vot) {
        return getVot();
    }


}



