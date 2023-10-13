package dbtest;

public class Column {
    private String name;
    private String type;
    private String label;

    public Column (String type, String label, String name){
        this.type = type;
        this.label = label;
        this.name = name;

    }

    public String getLabel() {
        return label;
    }

    public String getType() {
        return type;
    }

    public String getName() {
        return name;
    }
}
