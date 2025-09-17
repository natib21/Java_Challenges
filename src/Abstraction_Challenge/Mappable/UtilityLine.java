package Abstraction_Challenge.Mappable;

enum UtilityType {ELECTRICAL,FIBER_OPTIC,GAS,WATER}
public class UtilityLine implements Mappable{
    private String name;
    private UtilityType type;

    public UtilityLine(String name, UtilityType type) {
        this.name = name;
        this.type = type;
    }

    @Override
    public String getLabel() {
        return name +" ("+ type+")";
    }

    @Override
    public Geometry getShape() {
        return Geometry.LINE;
    }

    @Override
    public String getMarker() {
        return switch (type){
            case ELECTRICAL -> Color.RED +" "+ LineMarker.DASHED ;
            case GAS -> Color.GREEN +" "+ LineMarker.SOLID ;
            case FIBER_OPTIC -> Color.GREEN +" "+ LineMarker.DOTTED ;
            case WATER -> Color.BLACK +" "+ LineMarker.SOLID ;
            default -> name = "UNKNOWN";
        };
    }
    @Override
    public String toJSON() {
        return Mappable.super.toJSON() + """ 
                "name":"%s","utility":"%s" """.formatted(name,type);

    }
}
