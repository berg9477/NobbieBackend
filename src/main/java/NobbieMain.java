import java.time.LocalDate;

public class NobbieMain {

    public static void main(String[] args) {
        Baby lieke = new Baby("Lieke", Gender.F, LocalDate.of(2021, 2, 22), true);
       // System.out.println(lieke.getNickname() + " " + lieke.getExpected() + " " + lieke.getWeeksLeft());

        UserProfile saskia = new UserProfile("Saskia", "Bousardt", "se.bous@gmail.com", "wacht01", "sas001");
        saskia.addKid(lieke);
        Baby kind = saskia.getKids().get(0);
        Integer nrOfKids = saskia.getKids().size()-1;
        System.out.println(kind.getNickname() + " Has " + nrOfKids + " brothers and sisters");
    }


}
