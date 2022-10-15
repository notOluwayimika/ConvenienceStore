import java.util.concurrent.atomic.AtomicInteger;

public abstract class Staff {
    private static final AtomicInteger count = new AtomicInteger(0);
    protected String name;
    protected Integer id;

    public Staff( String name){
        this.id = count.incrementAndGet();
        this.name  = name;
    }

    public String getName() {
        return name;
    }

    public Integer getId() {
        return id;
    }
}
