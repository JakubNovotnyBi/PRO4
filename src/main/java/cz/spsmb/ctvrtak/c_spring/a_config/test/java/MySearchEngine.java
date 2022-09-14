package cz.spsmb.ctvrtak.c_spring.a_config.test.java;

import cz.spsmb.ctvrtak.c_spring.a_config.main.java.Doc;
import cz.spsmb.ctvrtak.c_spring.a_config.main.java.SearchEngine;
import cz.spsmb.ctvrtak.c_spring.a_config.main.java.Type;

import java.util.ArrayList;
import java.util.List;

public class MySearchEngine implements SearchEngine {
    @Override
    public List<Doc> listAll() {
        return null;
    }

    @Override
    public List<Doc> findByType() {
        return null;
    }
    private ArrayList storage(){
        Doc doc = new Doc("Albert","MB",new Type("Name","Desc","Extension"));
        Doc doc1 = new Doc("Alan","KV", new Type("Name1","Desc1","Extension1"));
        ArrayList<Doc>myList=new ArrayList<Doc>();
        myList.add(doc);
        myList.add(doc1);
        return myList;
    }
}
