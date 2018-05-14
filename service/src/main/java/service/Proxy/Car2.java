package service.Proxy;

/**
 * Created by Administrator on 2018-05-14.
 */
public class Car2 extends Car {
    @Override
    public void move() {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车行驶开始.....");
        super.move();
        long endTime = System.currentTimeMillis();
        System.out.println("汽车行驶结束.....");
        System.out.println("汽车行驶时间："+(endTime-startTime)+"毫秒");
    }

}
