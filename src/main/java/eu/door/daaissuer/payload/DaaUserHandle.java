package eu.door.daaissuer.payload;

import java.io.Serializable;

public class DaaUserHandle implements Serializable {
    private String id;
    private String name;

    public DaaUserHandle() {
    }

    public DaaUserHandle(String id, String name) {
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


}