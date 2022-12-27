package dao.impl;

import dao.BookDao;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Repository;

import java.util.*;
@Repository("bookDao")
public class BookDaoImpl implements BookDao {
    @Value("${bookDao.name}")
    private String name;

    @Override
    public String toString() {
        return "[BookDao]: name="+name;
    }


//    private int[] array;
//    private List<String> list;
//    private Set<String> set;
//    private Map<String, String> map;
//    private Properties properties;
//
//    public void setArray(int[] array) {this.array = array;}
//
//    public void setList(List<String> list) {this.list = list;}
//
//    public void setSet(Set<String> set) {this.set = set;}
//
//    public void setMap(Map<String, String> map) {this.map = map;}
//
//    public void setProperties(Properties properties) {this.properties = properties;}
//
//    @Override
//    public void print() {
//        System.out.println("数组: "+ Arrays.toString(array));
//        System.out.println("list: "+list);
//        System.out.println("set: "+set);
//        System.out.println("map: "+map);
//        System.out.println("properties: "+properties);
//    }
}

