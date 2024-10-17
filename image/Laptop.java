package p1;

public class Laptop {
    private int screenSize;
    private boolean isWifiEnabled;

    public Laptop(){
    }

    public Laptop(int screenSize, boolean isWifiEnabled)
    {
        this.screenSize=screenSize;
        this.isWifiEnabled=isWifiEnabled;
    }

    public int getScreenSize()
    {
        return screenSize;
    }

    public void setScreenSize(int screenSize)
    {
        this.screenSize=screenSize;
    }

    public boolean isWifiEnabled() {
        return isWifiEnabled;
    }

    public void setWifiEnabled(boolean wifiEnabled) {
        isWifiEnabled = wifiEnabled;
    }

    @Override
    public String toString() {
        return "Laptop{" +
                "screenSize=" + screenSize +
                ", isWifiEnabled=" + isWifiEnabled +
                '}';
    }
}
