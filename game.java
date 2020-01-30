import javax.swing.*;
import java.awt.*;
import java.io.*;
import java.awt.event.*;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;

public class game extends JFrame implements KeyListener
{
static int end=0;
static Clip clip;
static int points=0;
static Timer timer;
public static int cnt,move=22,temp;
int x=0;
static JLabel po;
static JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11,l12,l13,l14,l15,l16,l17;
static JLabel l18,l19,l20,l21,l22,l23,l24,l25;

static JLabel l26,l27,l28,l29,l30,l31,l32,l33,l34,l35,l36,l37,l38,l39,l40,l41,l42,l43,l44,l45,l46,l47;


static JLabel l51,l52,l53,l54,l55,l56,l57,l58,l59,l60,l61,l62,l63,l64,l65,l66,l67,l68,l69,l70,l71,l72,go,win,lose;

game()
{
super("Pin Ball");

setLayout(null);
setVisible(true);
setSize(700, 500);  
//setResizable(false);
ImageIcon image = new ImageIcon("dn1.png");
ImageIcon image2 = new ImageIcon("bll1.png");
ImageIcon image4 = new ImageIcon("bll2.png");

ImageIcon image3 = new ImageIcon("ldder.png");
ImageIcon image5 = new ImageIcon("41nYW.gif");
ImageIcon image6 = new ImageIcon("win.png");
ImageIcon image7 = new ImageIcon("lose.png");
win = new JLabel(image6);
lose = new JLabel(image7);
po = new JLabel("Points");
l1 = new JLabel(image);
l3 = new JLabel(image);
l4 = new JLabel(image3);
l15 = new JLabel(image2);
l16 = new JLabel(image2);
l2 = new JLabel(image2);
l5 = new JLabel(image2);
l6 = new JLabel(image2);
l7 = new JLabel(image2);
l8 = new JLabel(image2);
l9 = new JLabel(image2);
l10 = new JLabel(image2);
l11 = new JLabel(image2);
l12 = new JLabel(image2);
l13 = new JLabel(image2);
l14 = new JLabel(image2);

l17 = new JLabel(image2);
l18 = new JLabel(image2);
l19 = new JLabel(image2);
l20 = new JLabel(image2);
l21 = new JLabel(image2);
l22 = new JLabel(image2);
l23 = new JLabel(image2);
l24 = new JLabel(image2);
l25 = new JLabel(image2);

l26 = new JLabel(image4);
l27 = new JLabel(image4);
l28 = new JLabel(image4);
l29 = new JLabel(image4);
l30 = new JLabel(image4);
l31 = new JLabel(image4);
l32 = new JLabel(image4);
l33 = new JLabel(image4);
l34 = new JLabel(image4);
l35 = new JLabel(image4);
l36 = new JLabel(image4);
l37 = new JLabel(image4);
l38 = new JLabel(image4);
l39 = new JLabel(image4);
l40 = new JLabel(image4);
l41 = new JLabel(image4);
l42 = new JLabel(image4);
l43 = new JLabel(image4);
l44 = new JLabel(image4);
l45 = new JLabel(image4);
l46 = new JLabel(image4);
l47 = new JLabel(image4);

l51 = new JLabel(image4);
l52 = new JLabel(image4);
l53 = new JLabel(image4);
l54 = new JLabel(image4);
l55 = new JLabel(image4);
l56 = new JLabel(image4);
l57 = new JLabel(image4);
l58 = new JLabel(image4);
l59 = new JLabel(image4);
l60 = new JLabel(image4);
l61 = new JLabel(image4);
l62 = new JLabel(image4);
l63 = new JLabel(image4);
l64 = new JLabel(image4);
l65 = new JLabel(image4);
l66 = new JLabel(image4);
l67 = new JLabel(image4);
l68 = new JLabel(image4);
l69 = new JLabel(image4);
l70 = new JLabel(image4);
l71 = new JLabel(image4);
l72 = new JLabel(image4);
go = new JLabel(image5);
addKeyListener(this);
win.setBounds(150, 0, 180, 40);
lose.setBounds(150, 0, 280, 40);

po.setBounds(650, 50, 80, 30);
go.setBounds(50, 300, 470, 165);
l1.setBounds(5, 100, 600, 30);
l3.setBounds(5, 300, 600, 30);
l4.setBounds(562, 64, 60, 300);

l2.setBounds(0, 64, 40, 40);
l5.setBounds(60, 64, 40, 40);
l6.setBounds(120, 64, 40, 40);
l7.setBounds(180, 64, 40, 40);
l8.setBounds(240, 64, 40, 40);
l9.setBounds(300, 64, 40, 40);
l10.setBounds(360, 64, 40, 40);
l11.setBounds(420, 64, 40, 40);
l12.setBounds(480, 64, 40, 40);
l13.setBounds(540, 64, 40, 40);
l14.setBounds(570, 114, 40, 40);
l15.setBounds(570, 190, 40, 40);
l16.setBounds(570, 263, 40, 40);
l17.setBounds(500, 264, 40, 40);
l18.setBounds(440, 264, 40, 40);
l19.setBounds(380, 264, 40, 40);
l20.setBounds(320, 264, 40, 40);
l21.setBounds(260, 264, 40, 40);
l22.setBounds(200, 264, 40, 40);
l23.setBounds(140, 264, 40, 40);
l24.setBounds(80, 264, 40, 40);
l25.setBounds(20, 264, 40, 40);

l26.setBounds(0, 64, 40, 40);
l27.setBounds(60, 64, 40, 40);
l28.setBounds(120, 64, 40, 40);
l29.setBounds(180, 64, 40, 40);
l30.setBounds(240, 64, 40, 40);
l31.setBounds(300, 64, 40, 40);
l32.setBounds(360, 64, 40, 40);
l33.setBounds(420, 64, 40, 40);
l34.setBounds(480, 64, 40, 40);
l35.setBounds(540, 64, 40, 40);
l36.setBounds(570, 114, 40, 40);
l37.setBounds(570, 190, 40, 40);
l38.setBounds(570, 263, 40, 40);
l39.setBounds(500, 264, 40, 40);
l40.setBounds(440, 264, 40, 40);
l41.setBounds(380, 264, 40, 40);
l42.setBounds(320, 264, 40, 40);
l43.setBounds(260, 264, 40, 40);
l44.setBounds(200, 264, 40, 40);
l45.setBounds(140, 264, 40, 40);
l46.setBounds(80, 264, 40, 40);
l47.setBounds(20, 264, 40, 40);

l51.setBounds(0, 24, 40, 40);
l52.setBounds(60, 24, 40, 40);
l53.setBounds(120, 24, 40, 40);
l54.setBounds(180, 24, 40, 40);
l55.setBounds(240, 24, 40, 40);
l56.setBounds(300, 24, 40, 40);
l57.setBounds(360, 24, 40, 40);
l58.setBounds(420, 24, 40, 40);
l59.setBounds(480, 24, 40, 40);
l60.setBounds(540, 24, 40, 40);
l61.setBounds(570, 114, 40, 40);
l62.setBounds(570, 190, 40, 40);
l63.setBounds(570, 263, 40, 40);
l64.setBounds(500, 224, 40, 40);
l65.setBounds(440, 224, 40, 40);
l66.setBounds(380, 224, 40, 40);
l67.setBounds(320, 224, 40, 40);
l68.setBounds(260, 224, 40, 40);
l69.setBounds(200, 224, 40, 40);
l70.setBounds(140, 224, 40, 40);
l71.setBounds(80, 224, 40, 40);
l72.setBounds(20, 224, 40, 40);

add(win);
add(lose);
add(go);
add(po);
add(l14);
add(l1);
add(l2);
add(l3);

add(l5);
add(l6);
add(l7);
add(l8);
add(l9);
add(l10);
add(l11);
add(l12);
add(l13);
add(l15);
add(l16);
add(l17);
add(l18);
add(l19);
add(l20);
add(l21);
add(l22);
add(l23);
add(l24);
add(l25);


add(l26);
add(l27);
add(l28);
add(l29);
add(l30);
add(l31);
add(l32);
add(l33);
add(l34);
add(l35);
add(l36);
add(l37);
add(l38);
add(l39);
add(l40);
add(l41);
add(l42);
add(l43);
add(l44);
add(l45);
add(l46);
add(l47);
add(l4);

add(l51);
add(l52);
add(l53);
add(l54);
add(l55);
add(l56);
add(l57);
add(l58);
add(l59);
add(l60);
add(l61);
add(l62);
add(l63);
add(l64);
add(l65);
add(l66);
add(l67);
add(l68);
add(l69);
add(l70);
add(l71);
add(l72);

l2.setVisible(false);
l5.setVisible(false);
l6.setVisible(false);
l7.setVisible(false);
l8.setVisible(false);
l9.setVisible(false);
l10.setVisible(false);
l11.setVisible(false);
l12.setVisible(false);
l13.setVisible(false);
l14.setVisible(false);
l15.setVisible(false);
l16.setVisible(false);
l17.setVisible(false);
l18.setVisible(false);
l19.setVisible(false);
l20.setVisible(false);
l21.setVisible(false);
l22.setVisible(false);
l23.setVisible(false);
l24.setVisible(false);
l25.setVisible(false);
l26.setVisible(false);
l27.setVisible(false);
l28.setVisible(false);
l29.setVisible(false);
l30.setVisible(false);
l31.setVisible(false);
l32.setVisible(false);
l33.setVisible(false);
l34.setVisible(false);
l35.setVisible(false);
l36.setVisible(false);
l37.setVisible(false);
l38.setVisible(false);
l39.setVisible(false);
l40.setVisible(false);
l41.setVisible(false);
l42.setVisible(false);
l43.setVisible(false);
l44.setVisible(false);
l45.setVisible(false);
l46.setVisible(false);
l47.setVisible(true);

l51.setVisible(false);
l52.setVisible(false);
l53.setVisible(false);
l54.setVisible(false);
l55.setVisible(false);
l56.setVisible(false);
l57.setVisible(false);
l58.setVisible(false);
l59.setVisible(false);
l60.setVisible(false);
l61.setVisible(false);
l62.setVisible(false);
l63.setVisible(false);
l64.setVisible(false); 
l65.setVisible(false);
l66.setVisible(false);
l67.setVisible(false);
l68.setVisible(false);
l69.setVisible(false);
l70.setVisible(false);
l71.setVisible(false);
l72.setVisible(false);
go.setVisible(false);
win.setVisible(false);
lose.setVisible(false);
try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:/game/bottle-open.wav").getAbsoluteFile());
        clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
setSize(775, 550);
}

public void keyPressed(KeyEvent ke)
{
if(ke.getKeyChar()=='j')
{
try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:/game/jump.wav").getAbsoluteFile());
        Clip clip = AudioSystem.getClip();
        clip.open(audioInputStream);
        clip.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }

if(move==22)
{
l72.setVisible(true);
l47.setVisible(false);
temp=move;
move=0;

}
else if(move==21)
{
l71.setVisible(true);
l46.setVisible(false);
temp=move;
move=0;
}
else if(move==20)
{
l70.setVisible(true);
l45.setVisible(false);
temp=move;
move=0;
}
else if(move==19)
{
l69.setVisible(true);
l44.setVisible(false);
temp=move;
move=0;
}
else if(move==18)
{
l68.setVisible(true);
l43.setVisible(false);
temp=move;
move=0;
}
else if(move==17)
{
l67.setVisible(true);
l42.setVisible(false);
temp=move;
move=0;
}
else if(move==16)
{
l66.setVisible(true);
l41.setVisible(false);
temp=move;
move=0;
}
else if(move==15)
{
l65.setVisible(true);
l40.setVisible(false);
temp=move;
move=0;
}
else if(move==14)
{
l64.setVisible(true);
l39.setVisible(false);
temp=move;
move=0;
}
else if(move==10)
{
l60.setVisible(true);
l35.setVisible(false);
temp=move;
move=0;
}
else if(move==9)
{
l59.setVisible(true);
l34.setVisible(false);
temp=move;
move=0;
}
else if(move==8)
{
l58.setVisible(true);
l33.setVisible(false);
temp=move;
move=0;
}
else if(move==7)
{
l57.setVisible(true);
l32.setVisible(false);
temp=move;
move=0;
}
else if(move==6)
{
l56.setVisible(true);
l31.setVisible(false);
temp=move;
move=0;
}
else if(move==5)
{
l55.setVisible(true);
l30.setVisible(false);
temp=move;
move=0;
}
else if(move==4)
{
l54.setVisible(true);
l29.setVisible(false);
temp=move;
move=0;
}
else if(move==3)
{
l53.setVisible(true);
l28.setVisible(false);
temp=move;
move=0;
}
else if(move==2)
{
l52.setVisible(true);
l27.setVisible(false);
temp=move;
move=0;
}
else if(move==1)
{
l51.setVisible(true);
l26.setVisible(false);
temp=move;
move=0;
}
}

if(ke.getKeyChar()=='m')
{
if(end==0)
{
move--;
if(move==21)
{
l47.setVisible(false);
l46.setVisible(true);
}
else if(move==20)
{
l46.setVisible(false);
l45.setVisible(true);
}
else if(move==19)
{
l45.setVisible(false);
l44.setVisible(true);
}
else if(move==18)
{
l44.setVisible(false);
l43.setVisible(true);
}
else if(move==17)
{
l43.setVisible(false);
l42.setVisible(true);
}

else if(move==16)
{
l42.setVisible(false);
l41.setVisible(true);
}
else if(move==15)
{
l41.setVisible(false);
l40.setVisible(true);
}
else if(move==14)
{
l40.setVisible(false);
l39.setVisible(true);
}
else if(move==13)
{
l39.setVisible(false);
l38.setVisible(true);
}
else if(move==12)
{
l38.setVisible(false);
l37.setVisible(true);
}
else if(move==11)
{
l37.setVisible(false);
l36.setVisible(true);
}
else if(move==10)
{
l36.setVisible(false);
l35.setVisible(true);
}
else if(move==9)
{
l35.setVisible(false);
l34.setVisible(true);
}
else if(move==8)
{
l34.setVisible(false);
l33.setVisible(true);
}
else if(move==7)
{
l33.setVisible(false);
l32.setVisible(true);
}
else if(move==6)
{
l32.setVisible(false);
l31.setVisible(true);
}
else if(move==5)
{
l31.setVisible(false);
l30.setVisible(true);
}
else if(move==4)
{
l30.setVisible(false);
l29.setVisible(true);
}
else if(move==3)
{
l29.setVisible(false);
l28.setVisible(true);
}
else if(move==2)
{
l28.setVisible(false);
l27.setVisible(true);
}
else if(move==1)
{
l27.setVisible(false);
l26.setVisible(true);
if(kb.getKeyChar()=='b')
{
if(end==0)
{
move--;
if(move==21)
{
l47.setVisible(false);
l46.setVisible(true);
}
else if(move==20)
{
l46.setVisible(false);
l45.setVisible(true);
}
else if(move==19)
{
l45.setVisible(false);
l44.setVisible(true);
}
else if(move==18)
{
l44.setVisible(false);
l43.setVisible(true);
}
else if(move==17)
{
l43.setVisible(false);
l42.setVisible(true);
}

else if(move==16)
{
l42.setVisible(false);
l41.setVisible(true);
}
else if(move==15)
{
l41.setVisible(false);
l40.setVisible(true);
}
else if(move==14)
{
l40.setVisible(false);
l39.setVisible(true);
}
else if(move==13)
{
l39.setVisible(false);
l38.setVisible(true);
}
else if(move==12)
{
l38.setVisible(false);
l37.setVisible(true);
}
else if(move==11)
{
l37.setVisible(false);
l36.setVisible(true);
}
else if(move==10)
{
l36.setVisible(false);
l35.setVisible(true);
}
else if(move==9)
{
l35.setVisible(false);
l34.setVisible(true);
}
else if(move==8)
{
l34.setVisible(false);
l33.setVisible(true);
}
else if(move==7)
{
l33.setVisible(false);
l32.setVisible(true);
}
else if(move==6)
{
l32.setVisible(false);
l31.setVisible(true);
}
else if(move==5)
{
l31.setVisible(false);
l30.setVisible(true);
}
else if(move==4)
{
l30.setVisible(false);
l29.setVisible(true);
}
else if(move==3)
{
l29.setVisible(false);
l28.setVisible(true);
}
else if(move==2)
{
l28.setVisible(false);
l27.setVisible(true);
}
else if(move==1)
{
l27.setVisible(false);
l26.setVisible(true);

if(points>=25)
{
timer.stop();
win.setVisible(true);
go.setVisible(true);
}j
else
{
timer.stop();
lose.setVisible(true);
go.setVisible(true);
end=1;
}
}
}
}
}
public void keyReleased(KeyEvent ke1)
{
if(ke1.getKeyChar()=='j')
{
move=temp;
if(move==22)
{

l72.setVisible(false);
l47.setVisible(true);

}
else if(move==21)
{
l71.setVisible(false);
l46.setVisible(true);
}
else if(move==20)
{
l70.setVisible(false);
l45.setVisible(true);

}
else if(move==19)
{
l69.setVisible(false);
l44.setVisible(true);
}
else if(move==18)
{
l68.setVisible(false);
l43.setVisible(true);
}
else if(move==17)
{
l67.setVisible(false);
l42.setVisible(true);
}
else if(move==16)
{
l66.setVisible(false);
l41.setVisible(true);
}
else if(move==15)
{
l65.setVisible(false);
l40.setVisible(true);
}
else if(move==14)
{
l64.setVisible(false);
l39.setVisible(true);
}
else if(move==10)
{
l60.setVisible(false);
l35.setVisible(true);
}
else if(move==9)
{
l59.setVisible(false);
l34.setVisible(true);
}
else if(move==8)
{
l58.setVisible(false);
l33.setVisible(true);
}
else if(move==7)
{
l57.setVisible(false);
l32.setVisible(true);
}
else if(move==6)
{
l56.setVisible(false);
l31.setVisible(true);
}
else if(move==5)
{
l55.setVisible(false);
l30.setVisible(true);
}
else if(move==4)
{
l54.setVisible(false);
l29.setVisible(true);
}
else if(move==3)
{
l53.setVisible(false);
l28.setVisible(true);
}
else if(move==2)
{
l52.setVisible(false);
l27.setVisible(true);
}
else if(move==1)
{
l51.setVisible(false);
l26.setVisible(true);
System.out.println("cdvbvbdb");
}
}
}
public void keyTyped(KeyEvent ke2)
{

}



public static void main(String args[])
{
game g1 = new game();

ActionListener actListner = new ActionListener()
{
@Override
public void actionPerformed(ActionEvent event) {

    cnt=cnt+1;
int z=cnt;
z++;
if(cnt==move)
{
lose.setVisible(true);
go.setVisible(true);
end=1;
//System.exit(1);
clip.stop();
try {
        AudioInputStream audioInputStream = AudioSystem.getAudioInputStream(new File("D:/game/smb_gameover.wav").getAbsoluteFile());
        Clip clip1 = AudioSystem.getClip();
        clip1.open(audioInputStream);
        clip1.start();
    } catch(Exception ex) {
        System.out.println("Error with playing sound.");
        ex.printStackTrace();
    }
timer.stop();
}
if(move==z)
{
points=points+1;
System.out.println("points="+points);
po.setText(String.valueOf(points));
z=0;
}
if(cnt==1)
{
l2.setVisible(true);
    System.out.println("Counter = "+cnt);
}

else if(cnt==2)
{
l2.setVisible(false);
l5.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==3)
{
l5.setVisible(false);
l6.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==4)
{
l6.setVisible(false);
l7.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==5)
{
l7.setVisible(false);
l8.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==6)
{
l8.setVisible(false);
l9.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==7)
{
l9.setVisible(false);
l10.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==8)
{
l10.setVisible(false);
l11.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==9)
{
l11.setVisible(false);
l12.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==10)
{
l12.setVisible(false);
l13.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==11)
{
l13.setVisible(false);
l14.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==12)
{
l14.setVisible(false);
l15.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==13)
{
l15.setVisible(false);
l16.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==14)
{
l16.setVisible(false);
l17.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==15)
{
l17.setVisible(false);
l18.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==16)
{
l18.setVisible(false);
l19.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==17)
{
l19.setVisible(false);
l20.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==18)
{
l20.setVisible(false);
l21.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==19)
{
l21.setVisible(false);
l22.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==20)
{
l22.setVisible(false);
l23.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==21)
{
l23.setVisible(false);
l24.setVisible(true);
    System.out.println("Counter = "+cnt);
}
else if(cnt==22)
{
l24.setVisible(false);
l25.setVisible(true);
    System.out.println("Counter = "+cnt);
}

else if(cnt==23)
{
l25.setVisible(false);
cnt=0;
}
}

};

  timer = new Timer(390, actListner);

  timer.start();
}
}