package jp.jizai.sample.jmx.util;

import java.util.List;
import java.util.Map;

import javax.management.MBeanInfo;

public class TreeUtil {
    public static Node createTreeObject(Map<String, List<String>> treePathMap) {

        Node root = new Node(null, null, null);

        for (Map.Entry<String, List<String>> treePath : treePathMap.entrySet()) {

            String[] nodeNameList = treePath.getKey().split("[|]");

            String parentNodeName = null;
            String nodeName = null;
            for (int i = 0; i < nodeNameList.length; i++) {
                
                nodeName = nodeNameList[i];

                if (nodeName == null || "".equals(nodeName)) {
                    continue;
                }
                if (parentNodeName == null) {
                    // 親ノードがないとき、追加候補はroot直下
                    boolean exists = false;
                    for (Node child : root.children) {
                        if (nodeName.equals(child.name)) {
                            // ルート直下に既に存在するので、追加しない
                            exists = true;
                        }
                    }
                    if (!exists) {
                        Node child = new Node(nodeName, root, null);
                        root.add(child);
                    }
                } else {
                    // 親ノードがあるとき、その親ノード直下に追加
                    if(i == (nodeNameList.length - 1)) {
                        appendNodeAsChild(parentNodeName, nodeName, root, treePath.getValue());
                    } else {
                        appendNodeAsChild(parentNodeName, nodeName, root, null);
                    }
                }

                parentNodeName = nodeName;
            }
        }
        return root;
    }

    private static void appendNodeAsChild(String parentNodeName, String nodeName, Node node, List<String> attributes) {

        // Node#nameがnullはrootなのでここでは対象外
        if (node.name != null && parentNodeName.equals(node.name)) {
            // 追加すべきノードが見つかった
            boolean exists = false;
            for (Node child : node.children) {
                if (nodeName.equals(child.name)) {
                    // 存在するので追加しない
                    exists = true;
                }
            }
            if (!exists) {
                Node child = new Node(nodeName, node, attributes);
                node.add(child);
            }
        } else {
            for (Node child : node.children) {
                // 追加すべきノードを探す
                appendNodeAsChild(parentNodeName, nodeName, child, attributes);
            }
        }
    }
}
