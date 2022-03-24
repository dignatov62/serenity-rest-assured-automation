package api;

import java.util.List;

public class Data {

    private String type;
    private String title;
    private String entitle;
    private String envalue;
    private String value;
    private Integer order;

//    public Data(String type, String title, String entitle, String envalue, String value, Integer order) {
//        this.type = type;
//        this.title = title;
//        this.entitle = entitle;
//        this.envalue = envalue;
//        this.value = value;
//        this.order = order;
//    }

    public String getType() {
        return type;
    }

    public String getTitle() {
        return title;
    }

    public String getEntitle() {
        return entitle;
    }

    public String getEnvalue() {
        return envalue;
    }

    public String getValue() {
        return value;
    }

    public Integer getOrder() {
        return order;
    }

    public void setType(String type) {
        this.type = type;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setEntitle(String entitle) {
        this.entitle = entitle;
    }

    public void setEnvalue(String envalue) {
        this.envalue = envalue;
    }

    public void setValue(String value) {
        this.value = value;
    }

    public void setOrder(Integer order) {
        this.order = order;
    }
}
