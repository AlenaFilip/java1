import java.util.List;

public class Main {
    public static void main(String[] args) {
        BankAccount ba1 = new BankAccount(new Person("Anna","Bornitz","ab2004@gmail.com"),"DE124567891143",150000.00);
        BankAccount ba2 = new BankAccount(new Person("Andrei","Kouch","andreikou@gmail.com"),"DE147778888323",80.5);
        BankAccount ba3 = new BankAccount(new Person("Olga","Pogorelyi","olpog@gmail.com"),"UA456777227786",47.1);
        BankAccount ba4 = new BankAccount(new Person("Inna","Sidorov","insid@gmail.com"),"BY177756333331",1245000);
        BankAccount ba5 = new BankAccount(new Person("Alena","Reichman","alrei@gmail.com"),"DE78945612344",184000);
        BankAccount ba51 = new BankAccount(new Person("Arina","Alibegova","ariel@gmail.com"),"DE78945612344",210000);
        BankAccount ba6 = new BankAccount(new Person("Yuriy","Kuznezov","ykuznez@gmail.com"),"DE0123456789",1500);
        List<BankAccount> list = List.of(ba1,ba2,ba3,ba4,ba5,ba6,ba51);
/*Дан список  BankAccount {Peroson person, String IBAN, double balance).
Используя stream необходимо
 вывести на экран все аккаунты, баланс которых составляет менее 100.*/
        list.stream()
                .filter(b->b.getBalance()<100)
                .forEach(b-> System.out.println(b.getiBAN()));
    /*Дан список  BankAccount {Peroson person, String IBAN, double balance),
    Person{String fName, String lName String email)   Используя stream,
    сформировать отсортированный по lName лист строк вида “Lennon J.;IBAN: DE19************43;
    lennon@gmail.com”    (т.е. ФИО; замаскированный счет, в котором открыты только первые 2 и последние 2 символа; email)
    для всех клиентов, чей баланс более 100000 */
        System.out.println("--------------------------------------");
        BankAccount.ByNameComparator comparator = new BankAccount.ByNameComparator();
        list.stream()
                .filter(b->b.getBalance()>100000)
                .sorted(comparator)
                .forEach(b-> System.out.println(b));
    }
}