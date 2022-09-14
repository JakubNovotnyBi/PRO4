package cz.spsmb.ctvrtak.c_spring.a_config.test.java;

import cz.spsmb.ctvrtak.c_spring.a_config.main.java.SearchEngine;
import cz.spsmb.ctvrtak.c_spring.a_config.main.java.Type;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class MyDocumentTest {
    private SearchEngine engine = new MySearchEngine();

    @Test
    void testFindByType(Type type) {
        engine.findByType();
        Assertions.assertEquals(type,type);


    }
    @Test
    void testListAll(){
        Assertions.assertEquals((int) 1,(int) 2);
    }
}
