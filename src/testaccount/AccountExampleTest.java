package testaccount;

public class AccountExampleTest {
    static AccountExample test = new AccountExample();
    public static final String[] validAccount = new String[] { "123abc_", "_abc123", "______", "123456","abcdefgh" };
    public static final String[] invalidAccount = new String[] { ".@", "12345", "1234_", "abcde" };

    public static void main(String[] args) {
        test = new AccountExample();
        for (String acount : validAccount) {
            boolean check1 = test.check(acount);
            System.out.println("Tai khoan " + acount + " la tai khoan:" + check1);
        }

        System.out.println("------------------------------------------");

        for (String account : invalidAccount) {
            boolean check2 = test.check(account);
            System.out.println("Tai khoan " + account + "la tai khoan:" + check2);
        }
    }
}