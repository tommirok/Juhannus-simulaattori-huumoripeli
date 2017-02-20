package simulaattori;

public class Laituri {

    double kalastusPromillet;

    double veneilyPromillet;

    double uimisPromillet;

    public Laituri() {
        this.kalastusPromillet = 0.7;
        this.veneilyPromillet = 0.4;
        this.uimisPromillet = 0.5;
    }

    public void setKalastusPromillet(double kalastusPromillet) {
        this.kalastusPromillet = kalastusPromillet;
    }

    public void setVeneilyPromillet(double veneilyPromillet) {
        this.veneilyPromillet = veneilyPromillet;
    }

    public void setUimisPromillet(double uimisPromillet) {
        this.uimisPromillet = uimisPromillet;
    }

    public double getKalastusPromillet() {
        return kalastusPromillet;
    }

    public double getVeneilyPromillet() {
        return veneilyPromillet;
    }

    public double getUimisPromillet() {
        return uimisPromillet;
    }

}
