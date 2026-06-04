package rvt;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Money {

    private final int euros;
    private final int cents;

    public Money(int euros, int cents) {
        this.euros = euros;
        this.cents = cents;
    }

    public int euros() {
        return euros;
    }

    public int cents() {
        return cents;
    }

    public String toString() {
        String zero = "";
        if (cents <= 10) {
            zero = "0";
        }

        return euros + "." + zero + cents + "e";
    }

    public Money plus(Money addition) {
        int totalCents = this.cents + addition.cents;
        int totalEuros = this.euros + addition.euros;
        
        if (totalCents >= 100) {
            totalEuros += totalCents / 100;
            totalCents = totalCents % 100;
        }
        
        return new Money(totalEuros, totalCents);
    }

    public boolean lessThan(Money compared) {
        if (this.euros != compared.euros) {
            return this.euros < compared.euros;
        }
        return this.cents < compared.cents;
    }

    public Money minus(Money decreaser) {
        int thisTotal = this.euros * 100 + this.cents;
        int decreaserTotal = decreaser.euros * 100 + decreaser.cents;
        
        int difference = thisTotal - decreaserTotal;
        
        if (difference < 0) {
            difference = 0;
        }
        
        int resultEuros = difference / 100;
        int resultCents = difference % 100;
        
        return new Money(resultEuros, resultCents);
    }
}