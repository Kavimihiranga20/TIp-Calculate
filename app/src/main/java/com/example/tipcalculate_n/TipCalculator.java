package com.example.tipcalculate_n;

public class TipCalculator {

    private float Tip;
    private float Bill;

    public TipCalculator(float newTip,float newBill)
    {
        setTip(newTip);
        setBill(newBill);

    }

    public float getTip()
    {

        return Tip;
    }

    public float newBill()
    {
        return Bill;
    }

    public void setTip(float newTip)
    {
        if(newTip > 0)
            Tip=newTip;
    }

    public void setBill(float newBill)
    {
        if(newBill > 0)
            Bill=newBill;
    }

    public float tipAmount()
    {
        return   Bill*Tip;
    }

    public float totalAmount()
    {
        return Bill * tipAmount();
    }








}
