import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Baby {
    private String nickname;
    private Gender gender;
    private LocalDate birthdate;
    private Boolean expected;
    private int weeksLeft;

    public Baby (String name, Gender gen, LocalDate date, Boolean expected){
        this.nickname = name;
        this.gender = gen;
        this.expected = expected;
        LocalDate today = LocalDate.now();
        if(expected){
            //if(date.isAfter(today)){}
            //calculate the number of weeks left till date of birth
            Number weeks = Math.abs(ChronoUnit.WEEKS.between(date, today));
            this.weeksLeft = weeks.intValue();
        } else {
            this.weeksLeft = 0;
        }
    }

    public String getNickname() {
        return nickname;
    }

    public void setNickname(String nickname) {
        this.nickname = nickname;
    }

    public Gender getGender() {
        return gender;
    }

    public void setGender(Gender gender) {
        this.gender = gender;
    }

    public LocalDate getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(LocalDate birthdate) {
        this.birthdate = birthdate;
    }

    public Boolean getExpected() {
        return expected;
    }

    public void setExpected(Boolean expected, LocalDate date) {
    //if expected goes from true to false, the birthdate needs to always be updated.
        if(!expected){
            setBirthdate(date);
        }
        this.expected = expected;
    }

    public int getWeeksLeft(){
        return this.weeksLeft;
    }
}
