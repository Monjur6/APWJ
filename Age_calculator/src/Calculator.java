public class Calculator extends Person
{
    int LocalDate;
    public static int calculateAge(LocalDate birthDate, LocalDate currentDate)
    {
        if ((birthDate != null) && (currentDate != null))
        {
            return Period.between(birthDate, currentDate).getYears();
        }
        else
        {
            return 0;
        }
    }
}
