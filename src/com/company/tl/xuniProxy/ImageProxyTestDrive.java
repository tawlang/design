package com.company.tl.xuniProxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Enumeration;
import java.util.Hashtable;

/**
 * 缓存代理模型
 * Created by taolang on 2017/4/18.
 */
public class ImageProxyTestDrive {
    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD封面加载器");
    JMenuBar menuBar;  // 菜单栏
    JMenu menu;        // 菜单
    Hashtable cds = new Hashtable();

    public static void main (String[] args) throws Exception {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws Exception{

        // 构造菜单项用的， key=CD名,  value=URL
        //cds.put("三国志：英雄的黎明","https://cn.ttnet.net/images/public/zh-logo-tw.png");
        //cds.put("东邪西毒","http://new-images.ttnet.net/zh/NP6/3768/43133768-401071674240110b.jpg");
        //cds.put("龙猫","http://new-images.ttnet.net/zh/NP6/3768/43133768-401071674240123b.jpg");
        //cds.put("三国志：英雄的黎明","https://img3.douban.com/lpic/s4131026.jpg");
        //cds.put("东邪西毒","https://img3.douban.com/lpic/s10425517.jpg");
        //cds.put("龙猫","https://img3.douban.com/lpic/s1668213.jpg");
        cds.put("Once<曾经>","https://img3.doubanio.com/lpic/s2821080.jpg");
        cds.put("太阳照常升起","https://img3.douban.com/lpic/s4714977.jpg");
        //cds.put("蝙蝠侠：侠影之谜","https://img3.douban.com/lpic/s4591642.jpg");
        //cds.put("天国王朝","https://img3.douban.com/lpic/s2595263.jpg");

        // 设置初始的CD封面
        URL initialURL = new URL((String)cds.get("Once<曾经>"));
        // 建立菜单栏
        menuBar = new JMenuBar();
        menu = new JMenu("最爱的CD");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for(Enumeration e = cds.keys(); e.hasMoreElements();) {
            String name = (String)e.nextElement();
            JMenuItem menuItem = new JMenuItem(name);
            menu.add(menuItem);
            menuItem.addActionListener(new ActionListener() {
                public void actionPerformed(ActionEvent event) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        // set up frame and menus

        Icon icon = new ImageProxy(initialURL);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800,600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try {
            return new URL((String)cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
