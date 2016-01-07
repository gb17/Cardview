package inc.gb.evnentbus;

/**
 * Created by ${GB} on 12/9/15.
 */
public class ChargingEvent {
    private String data;

    public ChargingEvent(String data){
        this.data = data;
    }

    public String getData(){
        return data;
    }
}