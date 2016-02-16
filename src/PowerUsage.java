/**
 * Created by henriettebarchager on 15/02/2016.
 */
public class PowerUsage implements SimpleObserver {

    private String state;

    public PowerUsage(SimpleObservable obj, String state){
        this.state = state;
        obj.registerObserver(this);
    }


    @Override
    public void update(SimpleObservable obj) {
        if (state.equalsIgnoreCase("on")) {
            System.out.println("The power usage is normal.");
        } if (state.equalsIgnoreCase("hibernate")) {
            System.out.println("Power save mode.");
        } if (state.equalsIgnoreCase("off")) {
            System.out.println("No power usage.");
        }
    }
}
