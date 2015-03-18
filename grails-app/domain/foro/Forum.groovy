package foro

/**
 * Created by Jenny on 16/03/15.
 */
public class Forum {
    private String name;
    private Date dataCreated;
    private String category;

    public Forum(name,dataCreated,category) {
        this.name = name;
        this.dataCreated = dataCreated;
        this.category = category;
    }

    public String getName() {
        return name
    }

    public void setName(String name) {
        this.name = name
    }

    public Date getDataCreated() {
        return dataCreated
    }

    public void setDataCreated(Date dataCreated) {
        this.dataCreated = dataCreated
    }

    public String getCategory() {

        return category
    }

    public void setCategory(String category) {
        this.category = category
    }
}
