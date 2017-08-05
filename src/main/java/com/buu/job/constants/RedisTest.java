package com.buu.job.constants;

import redis.clients.jedis.Jedis;

/**
 * Created by xianshengrong on 2016/12/18.
 */
public class RedisTest {
    public static void main(String[] args) {
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set("name","xinxin");//向key-->name中放入了value-->xinxin
        System.out.println(jedis.get("name"));//执行结果：xinxin
        jedis.append("name", " is my lover"); //拼接
        System.out.println(jedis.get("name"));
        jedis.del("name");  //删除某个键
        System.out.println(jedis.get("name"));
        //设置多个键值对
        jedis.mset("name","liuling","age","23","qq","476777XXX");
        jedis.incr("age"); //进行加1操作
        System.out.println(jedis.get("name") + "-" + jedis.get("age") + "-" + jedis.get("qq"));
    }
}
