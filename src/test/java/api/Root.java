package api;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.util.List;
import java.util.Objects;

@Data

public class Root {

    private List<Item> items;
    private boolean hasNext;
//    public Root(List<Item> items, boolean hasNext) {
//        this.items = items;
//        this.hasNext = hasNext;
//    }

//    public List<Item> getItems() {
//        return items;
//    }
//
//    public boolean isHasNext() {
//        return hasNext;
//    }
//
//    public void setItems(List<Item> items) {
//        this.items = items;
//    }
//
//    public void setHasNext(boolean hasNext) {
//        this.hasNext = hasNext;
//    }

//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (!(o instanceof Root)) return false;
//        Root root = (Root) o;
//        return hasNext == root.hasNext && Objects.equals(items, root.items);
//    }
//
//    @Override
//    public int hashCode() {
//        return Objects.hash(items, hasNext);
//    }
}
