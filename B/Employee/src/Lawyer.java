public class Lawyer extends Employee {
    @Override
    public String getVacationForm() {
        return "pink";
    }

    @Override
    public int getVacationDays() {
        return 15;
    }

    public void sue() {
        System.out.println("I'll see you in court!");
    }
}
