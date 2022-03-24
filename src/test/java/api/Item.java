package api;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class Item {

    private String certId;
    //private String unrz;
    private String isExpired;
    private List<Attr> attrs;
    private String title;
    private String entitle;
    //private String status;
    //private Integer order;
    @JsonProperty("isBeforeValidFrom")
    private Boolean beforeValidFrom;
    private String validFrom;
    private String expiredAt;
    @JsonProperty("serviceUnavailable")
    private boolean serviceUnavailable;

//    public Item(String type, String unrz, String unrzFull, List<Attr> attrs, String title, String entitle, String status, Integer order, boolean isBeforeValidFrom, String validFrom, String expiredAt, boolean serviceUnavailable) {
//        this.type = type;
//        this.unrz = unrz;
//        this.unrzFull = unrzFull;
//        this.attrs = attrs;
//        this.title = title;
//        this.entitle = entitle;
//        this.status = status;
//        this.order = order;
//        this.isBeforeValidFrom = isBeforeValidFrom;
//        this.validFrom = validFrom;
//        this.expiredAt = expiredAt;
//        this.serviceUnavailable = serviceUnavailable;
//    }

//    public String getType() {
//        return type;
//    }
//
//    public String getUnrz() {
//        return unrz;
//    }
//
//    public String getUnrzFull() {
//        return unrzFull;
//    }
//
//    public List<Attr> getAttrs() {
//        return attrs;
//    }
//
//    public String getTitle() {
//        return title;
//    }
//
//    public String getEntitle() {
//        return entitle;
//    }
//
//    public String getStatus() {
//        return status;
//    }
//
//    public Integer getOrder() {
//        return order;
//    }
//
////    public Boolean getBeforeValidFrom() {
////        return isBeforeValidFrom;
////    }
//
//    public Boolean getBeforeValidFrom() {
//        return beforeValidFrom;
//    }
//
//    public void setBeforeValidFrom(Boolean beforeValidFrom) {
//        this.beforeValidFrom = beforeValidFrom;
//    }
//
//    public String getValidFrom() {
//        return validFrom;
//    }
//
//    public String getExpiredAt() {
//        return expiredAt;
//    }
//
//    public boolean isServiceUnavailable() {
//        return serviceUnavailable;
//    }
//
//    public void setType(String type) {
//        this.type = type;
//    }
//
//    public void setUnrz(String unrz) {
//        this.unrz = unrz;
//    }
//
//    public void setUnrzFull(String unrzFull) {
//        this.unrzFull = unrzFull;
//    }
//
//    public void setAttrs(List<Attr> attrs) {
//        this.attrs = attrs;
//    }
//
//    public void setTitle(String title) {
//        this.title = title;
//    }
//
//    public void setEntitle(String entitle) {
//        this.entitle = entitle;
//    }
//
//    public void setStatus(String status) {
//        this.status = status;
//    }
//
//    public void setOrder(Integer order) {
//        this.order = order;
//    }
//
////    public void setBeforeValidFrom(Boolean beforeValidFrom) {
////        this.isBeforeValidFrom = beforeValidFrom;
////    }
//
//    public void setValidFrom(String validFrom) {
//        this.validFrom = validFrom;
//    }
//
//    public void setExpiredAt(String expiredAt) {
//        this.expiredAt = expiredAt;
//    }
//
//    public void setServiceUnavailable(boolean serviceUnavailable) {
//        this.serviceUnavailable = serviceUnavailable;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Item)) return false;
//        Item item = (Item) o;
//        return serviceUnavailable == item.serviceUnavailable && Objects.equals(type, item.type) && Objects.equals(unrz, item.unrz) && Objects.equals(unrzFull, item.unrzFull) && Objects.equals(attrs, item.attrs) && Objects.equals(title, item.title) && Objects.equals(entitle, item.entitle) && Objects.equals(status, item.status) && Objects.equals(order, item.order) && Objects.equals(beforeValidFrom, item.beforeValidFrom) && Objects.equals(validFrom, item.validFrom) && Objects.equals(expiredAt, item.expiredAt);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(type, unrz, unrzFull, attrs, title, entitle, status, order, beforeValidFrom, validFrom, expiredAt, serviceUnavailable);
//    }
}

