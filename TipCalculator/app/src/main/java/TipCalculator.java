package com.jblearning.tipcalculatorv4;

public class TipCalculator {
    private float tip;
    private float bill;
    private int numPeople;

    public TipCalculator(float newTip, float newBill, int people ) {
        setTip( newTip );
        setBill( newBill );
        setPeople( people );
    }

    public float getTip( ) {
        return tip;
    }

    public float getBill( ) {
        return bill;
    }

    public void setTip( float newTip ) {
        if( newTip > 0 )
            tip = newTip;
    }

    public void setBill( float newBill ) {
        if( newBill > 0 )
            bill = newBill;
    }

    public void setPeople(int people) {

        if (people > 0)
            numPeople = people;
    }

    public float tipAmount( ) {
        return bill * tip / (numPeople);
    }

    public float totalAmount( ) {
        return bill + tipAmount( );
    }
}
