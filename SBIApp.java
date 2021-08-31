class Account{
 int ano;
double balance;
static String bankname;

}
public class SBIApp
{
public static void main(String[] args)
{
Account.bankname = "SBI";

Account a1;
a1 = new Account ();
Account a2 = new Account();
a1.ano=23;
a1.balance = 100000;
a2.ano = 24;
a2.balance = 12000;
System.out.println("a1ano= "+a1.ano);
System.out.println("a1balance----"+a1.balance);
System.out.println("a1bankname--------"+a1.bankname);
System.out.println("a2ano-----------"+a2.ano);

System.out.println("a2balance---------"+a2.balance);
System.out.println("a2bankname-------------"+a2.bankname);
System.out.println("Accountbankname----------------"+Account.bankname);

System.out.println("Accountano-------------"+Account.ano);
}
}


