package idqap2java;

public class Money {
    private long dollars;
private long cents;
public Money(double amount)
{
if(amount<0)
{
System.out.println("Error: Negative amounts "
+"of money are not allowed.");
System.exit(0);
}
else
{
long allCents = Math.round(amount*100);
dollars = allCents/100;
cents = allCents%100;
}
}
public Money(Money other)
{
this.dollars = other.dollars;
this.cents = other .cents;
}
public Money Add(Money otherAmount)
{
Money sum = new Money(0);
sum.cents = this.cents+otherAmount.cents;
long carryDollars = sum.cents/100;
sum.cents = sum.cents%100;
sum.dollars = this.dollars+otherAmount.dollars+carryDollars;
return sum;
}
public Money subtract(Money amount)
{
Money difference = new Money(0);
if(this.cents<amount.cents)
{
this.dollars = this.dollars-1;
this.cents = this.cents+100;
}
difference.dollars = this.dollars-amount.dollars;
difference.cents = this.cents-amount.cents;
return difference;
}
public int compareTo(Money amount)
{
int value;
if(this.dollars<amount.dollars)
value = -1;
else if(this.dollars>amount.dollars)
value =1;
else if(this.cents<amount.cents)
value = -1;
else if(this.cents>amount.cents)
value =1;
else
value =0;
return value;
}

@Override
public boolean equals(Object obj) {
Money other = (Money)obj;
return ((other.cents == this.cents) && (other.dollars == this.dollars));
}

@Override
public String toString() {
if(cents<10)
return "$"+dollars+".0"+cents;
else
return "$"+dollars+"."+cents;
}
}
