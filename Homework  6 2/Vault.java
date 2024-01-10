import java.util.ArrayList;
import java.util.Map;
import java.util.TreeMap;

public class Vault {

    private Map <Client, ArrayList<Account>> clientAccountsTreeMap = new TreeMap<> ( );

    public Map<Client, ArrayList<Account>> getClientAccountsTreeMap() {
        return clientAccountsTreeMap;
    }

    public ArrayList<Account> getAccounts(Client client) {
        return clientAccountsTreeMap.get (client);
    }

    public Client getClient(Account account) {
        //Client returnClient = new Client ();
        for ( Map.Entry<Client, ArrayList<Account>> entry : clientAccountsTreeMap.entrySet ( ) ) {
            if (entry.getValue ( ).contains (account)) {
                return entry.getKey ( );
            }
        }
        return null;
    }

    public void NewAccount(Client client, Account account) {
        ArrayList <Account> tempList = new ArrayList<> ( );
        if (clientAccountsTreeMap.containsKey (client)) {
            tempList = clientAccountsTreeMap.get (client);
        }
        tempList.add (account);
        clientAccountsTreeMap.put (client, tempList);
    }
}
