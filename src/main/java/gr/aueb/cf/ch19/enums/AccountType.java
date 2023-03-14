package gr.aueb.cf.ch19.enums;

/*
By default every enum has an ordinal number
 */
public enum AccountType {
    DEPOSITS ("DP"),
    SAVINGS ("SA"),
    CURRENT ("CUR");

    private String code;

    //constructor must be private or package private
    AccountType(String code) {
        this.code = code;
    }
}

class Main{
    public static void main(String[] args) {
        AccountType type1 = AccountType.CURRENT;
        AccountType type2 = AccountType.SAVINGS;

        for(AccountType accountType : AccountType.values()){
            System.out.println("Name "+accountType.name());
            System.out.println("Ordinal "+accountType.ordinal());
        }
    }
}
