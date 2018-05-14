package service.Proxy;

import java.util.Random;

/**
 * Created by Administrator on 2018-05-14.
 */
public class Car implements MoveAble{

    @Override
    public void move() {
        try {
            Thread.sleep(new Random().nextInt(1000));
            System.out.println("汽车行驶中.....");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }
}
