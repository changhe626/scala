package javafunction;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zk on 2017/11/28.
 * 作用: PACKAGE_NAME.
 */
public class FunctionDemo {

    public static void main(String[] args) {
       List<String> list= new ArrayList<String>();
       list.add("zhaojun");
       list.add("i");
       list.add("miss you");
       //匿名函数式的方法传递进去了
        List<String> map = new MyList(list).map(new MapFunction() {
            @Override
            public String operate(String str) {
                str += "zk";
                String upperCase = str.toUpperCase();
                return upperCase;
            }
        });

        System.out.println(map);

    }
}
