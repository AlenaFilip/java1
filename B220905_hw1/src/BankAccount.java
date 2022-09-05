import java.util.Comparator;

public class BankAccount {
    private Person person;
    private String iBAN;
    private double balance;

    public BankAccount(Person person, String iBAN, double balance) {
        this.person = person;
        this.iBAN = iBAN;
        this.balance = balance;
    }

    public Person getPerson() {
        return person;
    }

    @Override
    public String toString() {
        return person.getlNameF() + ";"+"IBAN:" +ibanSecret()+";"+person.getEmail();
    }
    public String ibanSecret(){
        int len = iBAN.length();
        String ss = "***********************";
        return iBAN.substring(0,2)+ss.substring(0,len-4)+iBAN.substring(len-2,len);
    }

    public String getiBAN() {
        return iBAN;
    }

    public double getBalance() {
        return balance;
    }

    public static class ByNameComparator implements Comparator<BankAccount> {
        @Override
        public int compare(BankAccount o1, BankAccount o2) {
            return o1.person.getlNameF().compareTo(o2.person.getlNameF());
        }
    }

}
