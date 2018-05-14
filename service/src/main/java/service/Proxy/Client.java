package service.Proxy;

/**
 * Created by Administrator on 2018-05-14.
 */
public class Client {
    public static void main(String[] args) {
        //继承实现静态代理
        MoveAble car = new Car2();
        car.move();
        //聚合实现静态代理
        Car car1 = new Car();
        MoveAble car2 = new Car3(car1);
        car2.move();
    }
}
