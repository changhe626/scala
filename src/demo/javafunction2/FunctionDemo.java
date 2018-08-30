package javafunction2;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zk on 2017/11/28.
 * 作用: PACKAGE_NAME.
 */
public class FunctionDemo {

    public static void main(String[] args) {
       List<String> list= new ArrayList<String>();
       list.add("hello");
       list.add("zhaojun");
       list.add("i miss you very much");
       //匿名函数式的方法传递进去了,不想写实现类了,懒
        MyList map = new MyList(list).map(new MapFunction() {
            @Override
            public String operate(String str) {
                str += "zhoajun";
                String upperCase = str.toUpperCase();
                return upperCase;
            }
        }).map(new MapFunction() {
            @Override
            public String operate(String str) {
                str += "zhaojun";
                return str;
            }
        });
        //这里还可以继续map下去,不断的进行实现
        System.out.println(map.getList());
    }
}
