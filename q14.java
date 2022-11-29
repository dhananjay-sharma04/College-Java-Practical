public class q14 {
    public static void main(String[] args) {
        Bank D = new Bank();
        D.deposits(1000);
        System.out.println("Your account fund is " + D.mfund);

        try {
            System.out.print("Your are withdrawing RS.400");
            D.withdraw(400);
            System.out.print("Your are withdrawing RS.300");
            D.withdraw(300);
        } catch (Exception e) {
            // TODO: handle exception
            System.out.println(e.getMessage());
        }
    }   
}
class Bank{
    long mfund;
    public void deposits(long fund){
        mfund = fund;
    }

    public void withdraw(long money) throws Exception{
        long newFund = mfund - money;
        if(newFund < 500){
            throw new Exception("\nNot sufficient Balance!");
        } else {
            mfund = newFund;
            System.out.println("\nYour remaining amount : " + mfund);
        }
    }
}