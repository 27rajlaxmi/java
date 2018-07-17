import java.util.*;
class savingAccount
{
static double annualInterestRate=4;
private  double savingBalance;
savingAccount(double firstAmt){
savingBalance=firstAmt;
}
public void calculateMonthlyInterest()
{
System.out.printf("1. ur account balance is=%.2f\n", savingBalance);
double monthlyInterest=savingBalance*annualInterestRate/(12*100);
System.out.printf("2. ur monthly interest is%.2f\n", monthlyInterest);
savingBalance=savingBalance+monthlyInterest;
System.out.printf("3. ur updatedbalance is%.2f\n", savingBalance);
}public static void modifyInterestRate(double newRate)
{
annualInterestRate=newRate;
}
}
class testsavingAccount{
public static void main(String[] args)
{
savingAccount save1= new savingAccount(5000);
savingAccount save2= new savingAccount(4000);
System.out.println("\n save 1");
save1.calculateMonthlyInterest();
System.out.println("\n save 2");
save2.calculateMonthlyInterest();
savingAccount.modifyInterestRate(5);

System.out.println("\n save 1");
save1.calculateMonthlyInterest();
System.out.println("\n save 2");
save2.calculateMonthlyInterest();

}
}
