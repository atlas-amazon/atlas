
interface RouteStrategy {
    void buildRoute(String startLocation, String endLocation);
}

class CarRouteStrategy implements RouteStrategy {
    public void buildRoute(String startLocation, String endLocation) {
        System.out.println("🚗 Car Route: Calculating the fastest route from " + startLocation + " to " + endLocation);
    }
}

class BikeRouteStrategy implements RouteStrategy {
    public void buildRoute(String startLocation, String endLocation) {
        System.out.println("Bike Route: Calculating a bike-friendly route from " + startLocation + " to " + endLocation);
    }
}

class PublicTransportRouteStrategy implements RouteStrategy {
    public void buildRoute(String startLocation, String endLocation) {
        System.out.println("Public Transport Route: Calculating the best route using buses and trains from " + startLocation + " to " + endLocation);
    }
}

class Navigator {
    private RouteStrategy strategy;

    public void setRouteStrategy(RouteStrategy strategy) {
        this.strategy = strategy;
    }

    public void buildRoute(String from, String to) {
        if (strategy == null) {
            System.out.println("No strategy selected. Please choose a transport mode.");
            return;
        }
        strategy.buildRoute(from, to);
    }
}

public class StrategyPatternNavigationDemo {
    public static void main(String[] args) {
        Navigator navigator = new Navigator();

        navigator.setRouteStrategy(new CarRouteStrategy());
        navigator.buildRoute("Home", "Office");

        navigator.setRouteStrategy(new BikeRouteStrategy());
        navigator.buildRoute("Home", "Park");

        navigator.setRouteStrategy(new PublicTransportRouteStrategy());
        navigator.buildRoute("Home", "Airport");
    }
}