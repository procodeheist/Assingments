package Day10;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class EmployeeBonus  {
    public String checkExperience(String joinDate) throws InvalidAge{
        LocalDate currentDate = LocalDate.now();
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy/MM/dd");
        LocalDate jnDate = LocalDate.parse(joinDate,dateTimeFormatter);

        long difference = ChronoUnit.MONTHS.between(jnDate,currentDate);
        if(difference<0){
           throw new InvalidAge("Age should not be in the future");
        }
        else if(difference<=12){
            return "You Have Got 5000 As Bonus";
        }
        else if(difference>12 && difference<=24){
            return "You Have Got 8000 As Bonus";
        }
        else{
            return "You Have Got 10000 As Bonus";
        }

    }
}
