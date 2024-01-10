import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Vault {

    private Map<Client, ArrayList<Account>> clientAccountmultiMap = new HashMap ( );
    private Map<Account,Client> accountClientMap = new HashMap<> (  );

    public Map<Client, ArrayList<Account>> getClientAccountmultiMap() {
        return clientAccountmultiMap;
    }

    public ArrayList getAccounts(Client client) {
        return clientAccountmultiMap.get (client);
    }

    public Client getClientSlow(Account account) {
        for ( Map.Entry<Client, ArrayList<Account>> entry : clientAccountmultiMap.entrySet ( ) ) {
            if (entry.getValue ( ).contains (account)) {
                return entry.getKey ( );
            }
        }
        return null;
    }

    //=====ДОБАВЛЕНО======================
    public Client getClientFast(Account account)
    {
        return accountClientMap.get (account);
    }

    public void NewAccount(Client client, Account account) {
        ArrayList tempList = new ArrayList<Account> ( );
        if (clientAccountmultiMap.containsKey (client)) {
            tempList = clientAccountmultiMap.get (client);
        }
        tempList.add (account);
        clientAccountmultiMap.put (client, tempList);
        //=====ДОБАВЛЕНО======================
        accountClientMap.put(account,client);
    }

    public void print() {
        System.out.print (clientAccountmultiMap.entrySet ( ));

    }
}
