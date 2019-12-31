/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author l164304
 */
public class Driver{
public static void main(String[] args) throws InterruptedException {
TrafficSystem trafficSystem = new TrafficSystem();
while (true) {
trafficSystem.displayState();
if (trafficSystem.getCurrentState() instanceof RedYellow) {
Thread.sleep(5000);
}
else if(trafficSystem.getCurrentState() instanceof GreenYellow)
    Thread.sleep(5000);
else {
Thread.sleep(15000);
}
trafficSystem.changeState();
}
}
}
