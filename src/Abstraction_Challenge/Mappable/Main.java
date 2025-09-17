package Abstraction_Challenge.Mappable;

import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        List<Mappable> mappables = new ArrayList<>();
        mappables.add(new Building("Sydney Town Hall", UsageType.GOVERNMENT));
        mappables.add(new Building("Sydney Opera House ", UsageType.ENTERTAINMENT));
        mappables.add(new Building("Stadium Australia", UsageType.SPORTS));

        mappables.add(new UtilityLine("College St",UtilityType.FIBER_OPTIC));
        mappables.add(new UtilityLine("Olympic Blvd",UtilityType.WATER));
        for (var m : mappables) {
            Mappable.mapIt(m);
        }
    }
}
