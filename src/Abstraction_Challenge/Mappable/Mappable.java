package Abstraction_Challenge.Mappable;

enum Geometry {LINE,POINT,POLYGON}
enum Color{BLACK,RED,GREEN,ORANGE,BLUE}
enum PointMarker{CIRCLE,PUSH_PIN,STAR,SQUARE,TRIANGLE}
enum LineMarker {DASHED,DOTTED,SOLID}

public interface Mappable {
    String JSON_PROPERTY = """
           "property":{%s}
           """;
    String getLabel();
    Geometry getShape();
    String getMarker();

    default String toJSON(){
        return """
                "type":"%s","label":"%s","marker:"%s"
                """.formatted(getShape(),getLabel(),getMarker());
    }
    static void mapIt(Mappable m){
        System.out.println(JSON_PROPERTY.formatted(m.toJSON()));
    }

}
