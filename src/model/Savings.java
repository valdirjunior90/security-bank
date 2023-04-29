package model;

public class Savings {
    
    private Double interestRate = 0.005;
     double balance;

    public Double getInterestRate() {
        return interestRate;
    }

    public void performance() { // rendimento

        double totalAcumulado = balance;
       
        for (int i = 1; i <= 12; i++) {
            double juros = totalAcumulado * interestRate;
            totalAcumulado += juros;
            System.out.printf("Mês %d: R$%.2f\n", i, totalAcumulado);
        }        
    }
}
