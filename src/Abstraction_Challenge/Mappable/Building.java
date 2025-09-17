package Abstraction_Challenge.Mappable;

enum UsageType {ENTERTAINMENT,GOVERNMENT,RESIDENTIAL,SPORTS}

public class Building implements Mappable {
    private String name;
    private UsageType usage;

    public Building(String name, UsageType usage) {
        this.name = name;
        this.usage = usage;
    }

    @Override
    public String getLabel() {
        return name +" ("+ usage+")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.POINT;
    }

    @Override
    public String getMarker() {
        return switch(usage){
            case ENTERTAINMENT -> Color.GREEN + " "+ PointMarker.TRIANGLE;
            case GOVERNMENT -> Color.RED + " "+ PointMarker.STAR;
            case SPORTS -> Color.ORANGE + " "+ PointMarker.PUSH_PIN;
            case RESIDENTIAL -> Color.BLUE + " "+ PointMarker.CIRCLE;
            default -> Color.GREEN + " "+ PointMarker.TRIANGLE;
        };
    }

    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """ 
                "name":"%s","usage":"%s" """.formatted(name,usage);

    }
}
