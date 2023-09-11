package idqap1java;

public class TestAccount {
    public static void main(String[] args) {
        Account Acc1=new Account("Acc1", "123");
        Account Acc2=new Account("Acc2", "321");
        Acc1.credit(5000);
        Acc2.credit(4000);
        System.out.println("Acc1: " + Acc1.getBalance());
        System.out.println("Acc2: " + Acc2.getBalance());
        Acc1.transferTo("Acc2", 1000);
        System.out.println("Acc1 transfer: " + Acc1.getBalance());
        System.out.println("Acc2 transfer: " + Acc2.getBalance());
    }}
