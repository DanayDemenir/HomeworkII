import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Vault {

    private Map<Client, ArrayList<Account>> multiMap = new HashMap ( );

    public Map<Client, ArrayList<Account>> getMultiMap() {
        return multiMap;
    }

    public ArrayList getAccounts(Client client) {
        ArrayList returnList = new ArrayList<Account> ( );

        return returnList = multiMap.get (client);
    }

    public Client getClient(Account account) {
        //Client returnClient = new Client ();
        for ( Map.Entry<Client, ArrayList<Account>> entry : multiMap.entrySet ( ) ) {
            if (entry.getValue ( ).contains (account)) {
                return entry.getKey ( );
            }
        }
        return null;
    }

    public void NewAccount(Client client, Account account) {
        ArrayList tempList = new ArrayList<Account> ( );
        if (multiMap.containsKey (client)) {
            tempList = multiMap.get (client);
        }
        tempList.add (account);
        multiMap.put (client, tempList);
    }

    public void print() {
        System.out.print (multiMap.entrySet ( ));

    }
}
