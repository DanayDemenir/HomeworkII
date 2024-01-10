public class Bank {


    public static void main(String[] args) {
        Vault vault = new Vault ( );
        Account a1 = new Account ( );
        Account a2 = new Account ( );
        Client client = new Client ("Den");
        Client client2 = new Client ( "Abn");
        Account b1 = new Account ( );

        vault.NewAccount (client, a1);
        vault.NewAccount (client, a2);
        vault.NewAccount (client2, b1);

        Printer printer = new Printer ( );

        printer.printVault (vault);
        printer.printClient (vault, a2);
        printer.printAccount (vault, client);
    }
}
