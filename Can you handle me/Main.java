public class Main {
    public static void main(String[] args) {
        candidate getcandidatedetails()throws InvalidInternException{
            String name = "Likith";
            System.out.println(name);
            String gender = "Male";
            System.out.println(gender);
            Int percent = 100;
            System.out.println(percent);
            if (percent<50){
                throw new InvalidInternException("Registration Failed, percent less then 50");
            }else{
                Candidate candidate = new Candidate();
                Candidate.setName(name);
                Candidate.setGender(gender);
                Candidate.setPercent(percent);

                return candidate;
            }
        }
        public static void main(String[] args){
            System.out.println("Welcome To Inter Hiring Tool");
            try{
                Candidate candidate = getcandidatedetails();
                System.out.println("registration Successfull");        
            }catch(InvalidInternException e){
                System.out.println(e.getMessage());
            }
        }
    }
}
