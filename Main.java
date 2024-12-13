import java.util.ArrayList;
import java.util.List;

//1
class DBclass {
    private static final DBclass instance = new DBclass();

    private DBclass() {}

    public static DBclass getInstance() {
        return instance;
    }

    public void Connect(){
        System.out.println("Successful connection");
    }
}

//2
class SystemLogs {
    private static final SystemLogs SystemLogs = new SystemLogs();
    private static List<String> logs = new ArrayList<>();

    private SystemLogs() {}

    public void addLog(String log) {
        logs.add(log);
    }

    public void printLogs() {
        for (String log : logs)
            System.out.println(log);
    }
}

//3
enum OrderStatus {
    NEW, IN_PROGRESS, DELIVERED, CANCELLED;
}

class Order {
    private String Info;
    private OrderStatus status;

    public Order(OrderStatus status) {
        this.status = status;
    }

    public void setStatus(OrderStatus status) {
        if(this.status.equals(OrderStatus.DELIVERED) || status.equals(OrderStatus.CANCELLED))
            return;
        this.status = status;
    }

    public void print() {
        System.out.println(status);
    }
}

//4
enum Seasons {
    WINTER("Зима"), SPRING("Весна"), SUMMER("Лето"), AUTUMN("Осень");
    private final String name;

    Seasons(String name) {
        this.name = name;
    }

    public String GetName() {
        return name;
    }
}