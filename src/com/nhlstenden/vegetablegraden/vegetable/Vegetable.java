package com.nhlstenden.vegetablegraden.vegetable;

public abstract class Vegetable
{
    private double sizeInCm;
    private double cmPerLux;
    private double cmPerMilimeter;
    private int ripeLength;
    private Color color;
    private Status status;

    public Vegetable(double cmPerLux, double cmPerMilimeter, int ripeLength, Color color)
    {
        this.sizeInCm = 0;
        this.cmPerLux = cmPerLux;
        this.cmPerMilimeter = cmPerMilimeter;
        this.ripeLength = ripeLength;
        this.color = color;
        this.status = Status.GROWING;
    }

    public double getSizeInCm()
    {
        return this.sizeInCm;
    }

    // No setter for sizeInCm because it should be calculated based on the other properties

    public double getCmPerLux()
    {
        return this.cmPerLux;
    }

    public void setCmPerLux(double cmPerLux)
    {
        this.cmPerLux = cmPerLux;
    }

    public double getCmPerMilimeter()
    {
        return this.cmPerMilimeter;
    }

    public void setCmPerMilimeter(double cmPerMilimeter)
    {
        this.cmPerMilimeter = cmPerMilimeter;
    }

    public int getRipeLength()
    {
        return this.ripeLength;
    }

    public void setRipeLength(int ripeLength)
    {
        this.ripeLength = ripeLength;
    }

    public Color getColor()
    {
        return this.color;
    }

    public void setColor(Color color)
    {
        this.color = color;
    }

    public Status getStatus()
    {
        return this.status;
    }

    protected void addSizeInCm(double sizeInCm)
    {
        this.sizeInCm += sizeInCm;

        if (this.getSizeInCm() >= this.getRipeLength())
        {
            this.setStatus(Status.READY_TO_HARVEST);
        }
    }

    void setStatus(Status status)
    {
        this.status = status;
    }

    protected void generalGrowth(int lux, int mm)
    {
        double growth = (lux * this.getCmPerLux()) + (mm * this.getCmPerMilimeter());

        this.addSizeInCm(growth);
    }

    public abstract void grow(int lux, int mm, int amountOfDays);
}
