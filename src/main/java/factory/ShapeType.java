package factory;

/**
 * @author by Eric
 * @since 2020/9/9 下午 02:02
 */
public enum ShapeType {
    CIRCLE(0,"CIRCLE"),

    SQUARE(1,"SQUARE"),
    RECTANGLE(2,"RECTANGLE");

    private Integer value;
    private String type;

    public Integer getValue(){
        return value;
    }
    public String getType(){
        return type;
    }

    private ShapeType(Integer value, String type){
        this.value = value;
        this.type = type;
    }
}
