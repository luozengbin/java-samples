package jp.jizai.sample.jmx.util;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import net.arnx.jsonic.JSONHint;

@SuppressWarnings("serial")
public class Node implements Serializable {

    @JSONHint(name="名前", ordinal=1)
    public String name;
    
    @JSONHint(name="MBean", ordinal=2)
    public String mbName;
    
    //public Node parent;
    
    @JSONHint(name="属性リスト", ordinal=3)
    //public List<AttributeItem> attributes;
    public List<String> attributes;
    
    @JSONHint(name="サブ", ordinal=4)
    public List<Node> children = new ArrayList<Node>();
    
    public Node() {
    }

    public Node(String name, Node parent, List<String> attributes) {
        this.name = name;
        //this.parent = parent;
        if(attributes != null && attributes.size() > 0) {
            this.mbName = attributes.get(0);
            attributes.remove(0);
            this.attributes = attributes;
        }
    }

    public void add(Node child) {
        this.children.add(child);
    }
    
}
