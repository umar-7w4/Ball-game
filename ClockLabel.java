import java.util.Date;
import java.awt.event.*;
import javax.swing.*;

public class ClockLabel extends JLabel implements ActionListener {
  public ClockLabel( ) {
    super("" + new Date( ));
    Timer t = new Timer(1000, this);
    t.start( );
  }
  public void actionPerformed(ActionEvent ae) {
    setText((new Date( )).toString( ));
  }
public static void main(String args[])
{
ClockLabel cl = new ClockLabel();
}
}