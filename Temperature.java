class Temperature{
    private double temperature;
    private char scale;

    public void setValue(double temperature)
    {
        this.temperature = temperature;
    }

    public void setScale(char scale)
    {
        switch(scale)
        {
            case 'F': case 'f':
                this.scale = 'F';
                break;
            case 'C': case 'c': default:
                this.scale = 'C';
                break;
        }
    }

    public void setAll(double temperature, char scale)
    {
        setValue(temperature);
        setScale(scale);
    }

    public double getCelsius()
    {
        if(scale == 'F')
        {
            return ((this.temperature - 32) * 5)/9;
        }
        return this.temperature;

    }

    public double getFahrenheit(){

        if(scale == 'C'){
            return 1.8 * this.temperature + 32;
        }
        return this.temperature;

    }

    public String toString() {
        return "Temp is " + temperature + "\u00B0 " + scale;
    }
}