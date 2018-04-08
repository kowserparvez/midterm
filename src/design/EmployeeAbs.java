package design;

/**
 * @Author Kowser on 4/8/2018.
 */
public abstract class EmployeeAbs implements Employee {
    public abstract void employeeTerm();

    public void employeeBenifit(){
        System.out.println("For no smokeing employee will get time off.");
    }
    public void employeeTime(){
        System.out.println("For regular time in will get extra time off");
    }

}
