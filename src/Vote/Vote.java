package Vote;


public class Vote extends VoteMath {

    public Vote() {
    }

    public Vote(String name, String surname, String userName, String password, int vot) {
        super();
        super.setName(name);
        super.setSurname(surname);
        super.setUserName(userName);
        super.setPassword(password);
        super.setVot(vot);
    }

    public IVoting[] getIvotings() {
        return ivotings;
    }

    public void setIvotings(IVoting[] ivotings) {
        this.ivotings = ivotings;
    }

    IVoting[] ivotings = new IVoting[10];

    @Override
    public void registration(IVoting vote) {
        for (int i = 0; i < ivotings.length; i++) {
            if (ivotings[i] == null) {
                ivotings[i] = vote;
//                ivotings[i] = new Vote(
//                        this.getUserName(),
//                        this.getPassword(),
//                        this.getName(),
//                        this.getSurname(),
//                        this.getVot()
//                );
                break;
            }
        }
    }

    @Override
    public void enter() {

    }

    @Override
    public void countVotes() {

    }

    @Override
    public String toString() {
        return "Vote{" +
                "ivotings=" + this.getUserName() +
                '}';
    }

@Override
        public void sout2() {
            for (int i = 0; i < ivotings.length; i++) {
                if (ivotings[i] == null) continue;
                System.out.print("{ ");
                System.out.print(getSurname() + " ");
                System.out.print(getPassword() + " ");
                System.out.print(getName() + " ");
                System.out.print(getSurname() + " ");
                System.out.print(getVot() + " ");
                System.out.println("}");
            }
            System.out.println();
        }

    @Override
    public void soutVoters() {
        //System.out.print("{ ");
//        for (IVoting v: ivotings) {
//            if (ivotings == null)
//                continue;
        for (int i = 0; i < ivotings.length; i++) {
            if (ivotings[i] == null) {
                continue;
            }
            System.out.println(ivotings.toString());
            //System.out.println(ivotings.toString());
        }

    }
}


