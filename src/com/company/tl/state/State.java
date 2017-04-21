package com.company.tl.state;

/**
 * Created by taolang on 2017/4/21.
 */
public interface State {

    //订房间
    void bookRoom();

    // 退订房间
    void unCheckRoom();

    // 入住
    void checkInRoom();

    // 退房
    void checkOutRoom();

}
