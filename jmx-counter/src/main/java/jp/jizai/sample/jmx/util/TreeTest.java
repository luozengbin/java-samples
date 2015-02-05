package jp.jizai.sample.jmx.util;

import java.util.ArrayList;
import java.util.List;

import net.arnx.jsonic.JSON;

public class TreeTest {
    public static void main(String[] args) {

        List<String> treePathList = new ArrayList<String>();

        treePathList.add("|いきもの");
        treePathList.add("|いきもの|人間");
        treePathList.add("|いきもの|動物");
        treePathList.add("|いきもの|植物");
        treePathList.add("|いきもの|人間|日本人");
        treePathList.add("|いきもの|人間|アメリカ人");
        treePathList.add("|いきもの|動物|犬");
        treePathList.add("|いきもの|動物|猫");
        treePathList.add("|いきもの|植物|さくら");
        treePathList.add("|いきもの|植物|とうもろこし");

//        Node root = TreeUtil.createTreeObject(treePathList);
//        
//        JSON json = new JSON();
//        json.setSuppressNull(true);
//        
//        System.out.println(json.encode(root, true));
        
    }
}
