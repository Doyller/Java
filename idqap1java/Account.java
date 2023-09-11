package idqap1java;

public class Account {
    private String id;
    private String name;
    private int balance = 0;

    public Account(String name, String id){
        this.name = name;
        this.id = id;
    }
    public Account(String name, String id, int balance){
        this.name = name;
        this.id = id;
        this.balance = balance;
    } 
    public String getId() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }
    public int credit(int amount)                       
    {                                                                
      this.balance+=amount;
      return balance;
      
    } 
    public int debit(int amount)                        
    {   
        if (amount <= this.balance){
        this.balance=amount;}
        else
        System.out.println("Amount exceeded balance");
        return balance;
    }
    public int transferTo(String accountName,int amount){
        if(amount<=this.balance){
        this.balance=this.balance-amount;
        }
        else{
        System.out.println("Amount exceed");
        }
        return this.balance;}
    public String toString(){
        return("Account" + "id = " + this.id + "name = " + this.name + "balance = " + this.balance);
    }
}