package AircraftBattl;

import AircraftBattl.Background;

import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
//我方飞机类
/*
* 这部分的代码主要是飞机类Plane的实现，其中包含了鼠标移动事件的监听和碰撞检测。
*  在构造方法中，为Plane添加了鼠标移动事件的监听，使飞机能跟随鼠标移动，实现用鼠标操控飞机的移动。
*  在paintSelf方法中，绘制了飞机的图像，并进行了与boos飞机的碰撞检测。如果碰到Boos，则生命清零，游戏结束。
*  getImj方法和getRec方法都是调用父类Background的方法。*/
public class Plane extends Background {
    int life = 30;
//    public Plane() {
//        super();
//    }

    public Plane(Image img, int x, int y, int width, int height, double speed, GameWin frame) {
        super(img, x, y, width, height, speed, frame);
        this.frame.addMouseMotionListener(new MouseAdapter() {
            @Override
            public void mouseMoved(MouseEvent e) {
                Plane.super.x = e.getX()-25;
                Plane.super.y = e.getY()-25;
            }
        });
    }

    @Override
    public void paintSelf(Graphics gImage) {
        gImage.drawImage(img,x-25,y-25,null);
        //我方飞机与敌方boos的碰撞检测
        if(this.frame.boos!= null && this.getRec().intersects(this.frame.boos.getRec())){
            if(this.frame.invincible == 0) {
                life = 0;
                GameWin.state = 3;
            }
        }
        if(this.frame.invincible==1){
            gImage.drawImage(GameUtils.guard,x-35,y-35,null);
        }
    }

    @Override
    public Image getImj() {
        return super.getImj();
    }

    @Override
    public Rectangle getRec() {
        return super.getRec();
    }
}
