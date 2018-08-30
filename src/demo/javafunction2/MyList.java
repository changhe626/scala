package javafunction2;

import java.util.List;

/**
 * Created by zk on 2017/11/28.
 * 作用: PACKAGE_NAME.
 * 改造成返回自身,可以不断的进行.map 的实现
 */
public class MyList {
    private List<String> list;

    public MyList(List<String> list) {
        this.list = list;
    }

    /**
     * map方法
     * @param mapF
     * @return
     */
    public MyList map(MapFunction mapF){
        for (int i = 0; i < list.size(); i++) {
            String operate = mapF.operate(list.get(i));
            //这里偷懒了一下,直接放到原来的list里面去了,可以新来一个List放入,再放回的
            list.set(i,operate);
        }
        return this;
    }

    /**
     * get方法
     * @return
     */
    public List<String> getList() {
        return list;
    }
}
