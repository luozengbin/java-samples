package jp.jizai.sample.jmx.util;

import net.arnx.jsonic.JSONHint;

public class AttributeItem {
    
    @JSONHint(name="属性", ordinal=1)
    private String name;
    @JSONHint(name="説明", ordinal=2)
    private String description;

    public AttributeItem() {
        super();
    }
    
    public AttributeItem(String name, String description) {
        super();
        this.name = name;
        this.description = description;
    }
    
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}
