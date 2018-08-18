/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package srm_bank;

/**
 *
 * @author hp
 */
public class BankAccount {
    private String name;
    private int age;
    private long mobileno;
    private long aadharno;
    private int account;
    private double balance;
    private static int a=4020;
    public BankAccount(String s,double b,int f,long g,long h)
    {
        name=s;
        balance=b;
        age=f;
        mobileno=g;
        aadharno=h;
        account=a++;
        javax.swing.JOptionPane.showMessageDialog(null, "your Account no.="+account);
        
    }
    public long getAadhar(){
    return aadharno;
    }
    public String getname(){
    return name;
    }
    public int getAcc()
    {
        return account;
    }
    public void withdraw(double d)
    {
        if(balance>d)
        {
            balance-=d;
            javax.swing.JOptionPane.showMessageDialog(null, "Your New Balance="+balance);
        }
        else
            javax.swing.JOptionPane.showMessageDialog(null, "Insufficient Balance");
    }
    public void deposit(double d)
    {
        balance+=d;
        javax.swing.JOptionPane.showMessageDialog(null, "your New Balance "+balance);
    }
}
