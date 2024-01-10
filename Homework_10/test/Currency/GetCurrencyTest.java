package test.Currency;

import source.Currency;
import source.Print;

public class GetCurrencyTest {


    public static void getCurrencyTest() {
        try {

            if (!(Currency.getCurrency (2).equals ("рубля")) ||
                    !(Currency.getCurrency (3).equals ("рубля")) ||
                    !(Currency.getCurrency (4).equals ("рубля"))) {
                throw new RuntimeException ("Currency at ..2/3/4");
            } else if (!(Currency.getCurrency (1).equals ("рубль")) ||
                    !(Currency.getCurrency (21).equals ("рубль")) ||
                    !(Currency.getCurrency (1001).equals ("рубль"))) {
                throw new RuntimeException ("Currency at ..1");
            } else if (!(Currency.getCurrency (11).equals ("рублей")) ||
                    !(Currency.getCurrency (12).equals ("рублей")) ||
                    !(Currency.getCurrency (13).equals ("рублей")) ||
                    !(Currency.getCurrency (14).equals ("рублей"))) {
                throw new RuntimeException ("Currency at 11/12/13/14");
            } else if (!(Currency.getCurrency (1000).equals ("рублей")) ||
                    !(Currency.getCurrency (0).equals ("рублей")) ||
                    !(Currency.getCurrency (68).equals ("рублей")) ||
                    !(Currency.getCurrency (9).equals ("рублей"))) {
                throw new RuntimeException ("Currency at default");
            }
            Print.printSmthg ("getCurrency test passed\n");
        } catch (RuntimeException e) {
            throw new RuntimeException (e);
        }
    }
}
