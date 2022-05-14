package Drone;

public class PID {

    private double P, I,D,max_i,integral,last_error;
    private boolean first_run;

    public PID(double p, double i, double d, double max_i) {
        this.P = p; this.I = i; this.D = d;
        this.integral = 0;
        this.max_i = max_i;
        this.first_run = true;
    }
    public double update(double error,double dt) {
        if(first_run) {
            last_error = error;
            first_run = false;
        }
        integral += I*error*dt;
        double diff = (error-last_error)/dt;
        double const_integral = constrain(integral,max_i,-max_i);
        double control_out = (P*error + D*diff + const_integral) % 360;
        last_error = error;
        return control_out;
    }

    public double constrain(double integral, double max_i, double min_i){
        if (integral > max_i) return max_i;
        if (integral < min_i) return min_i;
        return integral;
    }
}
