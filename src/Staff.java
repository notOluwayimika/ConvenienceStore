public abstract class Staff {
    protected String name;
    protected String id;

    public Staff(String id, String name){
        this.id = id;
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public String getId() {
        return id;
    }
}
