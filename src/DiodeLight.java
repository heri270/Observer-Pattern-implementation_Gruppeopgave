/**
 * Created by henriettebarchager on 15/02/2016.
 */
public class DiodeLight implements SimpleObserver {

    private String state;

    public DiodeLight(SimpleObservable obj, String state){
        this.state = state;
        obj.registerObserver(this);
    }

    @Override
    public void update(SimpleObservable obj) {
        if (state.equalsIgnoreCase("on")) {
            System.out.println("The diode is now green.");
        }  if (state.equalsIgnoreCase("hibernate")) {
            System.out.println("The diode is now red.");
        }  if (state.equalsIgnoreCase("off")) {
            System.out.println("The diode is turned off.");
        }
    }
}
