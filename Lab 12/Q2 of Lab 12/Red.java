/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l164304
 */
public class Red implements State 
{
private TrafficSystem trafficSystem;
private Reciever reciever;
public Red(TrafficSystem trafficSystem, Reciever reciever) {
super();
this.trafficSystem = trafficSystem;
this.reciever = reciever;
}
public TrafficSystem getTrafficSystem() {
return trafficSystem;
}
public void setTrafficSystem(TrafficSystem trafficSystem)
 {
this.trafficSystem = trafficSystem;
}
public Reciever getReciever() {
return reciever;
}
public void setReciever(Reciever reciever)
 {
       this.reciever=reciever;
 }
@Override
public void changeState() 
{
    trafficSystem.setPreviousState(this);
    reciever.off();
    reciever=new YellowLight();
    State s=new RedYellow(trafficSystem,reciever);
    trafficSystem.setCurrentState(s);
}
@Override
public void displayState()
{
reciever.on();
}
}
