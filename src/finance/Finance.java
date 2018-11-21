package finance;

import java.util.Scanner;

/** @author dalla
 */
public class Finance {

    public static void main(String[] args) {
        System.out.println();
        // declare the scanner
        Scanner sc = new Scanner(System.in);
        // declare the six columns
        String taxedIncome = "Taxed Income";
        String expense = "Expenses";
        String sTerm = "Short Term Savings";
        String lTerm = "Long Term Savings";
        String splurge = "Splurges";
        String donation = "Donations";
        String education = "Education";
        
        double taxIncomeAmt = 100.00;
        double expenseAmt = 50.00;
        double sTermAmt = 10.00;
        double lTermAmt = 10.00;
        double splurgeAmt = 10.00;
        double donationAmt = 10.00;
        double educationAmt = 10.00;
    
    System.out.println(taxedIncome + "   " + expense + "     " + sTerm + "   " +
            lTerm + "    " + splurge + "     " + donation + "    " + education);
    System.out.println("    " + taxIncomeAmt + "       " + expenseAmt + "           " + 
            sTermAmt +
            "                  " + lTermAmt + "                " + splurgeAmt 
            + "            " + donationAmt + "        " +
            educationAmt);
    
    
    }
    
}
