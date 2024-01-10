import java.util.Objects;

public class Account {
    private final int num;
    private final int value;


    public Account() {
        num = ( int ) (Math.random ( ) * 100);
        value = ( int ) (Math.random ( ) * 10);
    }

    public int getNum() {
        return num;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass ( ) != o.getClass ( )) return false;
        Account account = ( Account ) o;
        return num == account.num;
    }

    @Override
    public int hashCode() {
        return Objects.hash (num);
    }
}
