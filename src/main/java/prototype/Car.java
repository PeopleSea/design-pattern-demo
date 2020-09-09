package prototype;

/**
 * @author by Eric
 * @since 2020/9/9 下午 03:45
 */
public abstract class Car implements Cloneable{
    private String id;
    protected String type;

    abstract void brand();

    public String getId() {
        return id;
    }

    public String getType() {
        return type;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Object clone(){
        Object clone = null;
        try{
            clone = super.clone();
        }catch(CloneNotSupportedException e){
            e.printStackTrace();
        }
        return clone;
    }
}
