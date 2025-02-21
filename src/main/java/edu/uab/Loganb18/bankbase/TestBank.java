/*
 * Author: Logan Burkett <Loganb18@uab.edu>
 * Assignment:  bankbase - EE333 Spring 2022
 *
 * Credits: David Green
 */

package edu.uab.Loganb18.bankbase;

/** */
public class TestBank {

  /**
   * Small program to test this class
   *
   * @param args from command line - unused
   */
  public static void main(String[] args) {

    CheckingAccount mine = new CheckingAccount("Team 1", 200000);
    System.out.println("The account has " + mine.getBalance());
    System.out.println(mine);

    mine.deposit(1000);
    System.out.println(mine);

    mine.withdraw(200000);
    System.out.println(mine);

    // trying to remove too much
    boolean status = mine.withdraw(200000);
    System.out.println(mine);
    System.out.println("Withdraw returned " + status);

    System.out.println(mine.clearCheck(1));
    System.out.println(mine);

    System.out.println(mine.clearCheck(10000));
    System.out.println(mine);

    mine.assessMonthlyFee();
    System.out.println(mine);
  }
}
