package com.company.tl.state;

/**
 * Created by taolang on 2017/4/21.
 */

// 入住状态房间只能退房
public class BookedState implements State {

    Room hotelManagement;

    public BookedState(Room hotelManagement) {
        this.hotelManagement = hotelManagement;
    }

    @Override
    public void bookRoom() {
        System.out.println("该房间已近给预定了...");
    }

    @Override
    public void unCheckRoom() {
        System.out.println("退订成功,欢迎下次光临...");
        hotelManagement.setState(hotelManagement.getFreeTimeState());   //变成空闲状态
    }

    @Override
    public void checkInRoom() {
        System.out.println("入住成功...");
        hotelManagement.setState(hotelManagement.getCheckInState());         //状态变成入住
    }

    @Override
    public void checkOutRoom() {
        //不需要做操作
    }
}
