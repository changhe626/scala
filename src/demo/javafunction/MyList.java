package javafunction;

import java.util.List;

/**
 * Created by zk on 2017/11/28.
 * 作用: PACKAGE_NAME.
 */
public class MyList {
    private List<String> list;

    public MyList(List<String> list) {
        this.list = list;
    }

    public List<String> map(MapFunction mapF){
        for (int i = 0; i < list.size(); i++) {
            String operate = mapF.operate(list.get(i));
            list.set(i,operate);
        }
        return list;
    }




}
