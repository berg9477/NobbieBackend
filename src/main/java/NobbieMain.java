import java.time.LocalDate;

public class NobbieMain {

    public static void main(String[] args) {
        Baby lieke = new Baby("Lieke", Gender.F, LocalDate.of(2021, 2, 22), true);
        System.out.println(lieke.getNickname() + " " + lieke.getExpected() + " " + lieke.getWeeksLeft());

    }


}
