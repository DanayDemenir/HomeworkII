import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class Printer {

    private void printString(String textOutput) {
        System.out.print (textOutput);
    }

    public void printClient(Vault vault, Account account) {
        printString (vault.getClient (account).getName ( ));
        printString ("\n");
    }

    public void printAccount(Vault vault, Client client) {
        printArrayList (vault.getAccounts (client));
        printString ("\n");
    }

    public void printArrayList(ArrayList<Account> arrayList) {
        Account tempAccount = new Account ( );

        for ( int i = 0; i < arrayList.size ( ); i++ ) {
            tempAccount = ( Account ) arrayList.get (i);
            printString (String.valueOf (tempAccount.getNum ( )) + " ");
        }
    }

    public void printVault(Vault vault) {
        // Получаем вид элементов
        Set set = vault.getClientAccountsTreeMap ( ).entrySet ( );

        // Получаем итератор
        Iterator i = set.iterator ( );

        // Отображаем элементы
        while (i.hasNext ( )) {
            Map.Entry me = ( Map.Entry ) i.next ( );
            Client tempClient = new Client ( );
            tempClient = ( Client ) me.getKey ( );
            printString (tempClient.getName ( ) + ": ");
            printArrayList (( ArrayList ) me.getValue ( ));
            printString ("\n");
        }
        printString ("\n");
    }
}
