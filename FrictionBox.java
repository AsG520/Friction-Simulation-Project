import java.awt.Color;
import javax.swing.*;
import java.util.Timer;
import java.util.TimerTask;

public class FrictionBox {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Friction Box Simulation");

        double g = 9.8;
        double mass = 5.0;
        double appliedForce = 40.0;
        double vx = 20.0;
        double vx2 = 20.0;

        double coefficientStaticFriction = 0.5;
        double coefficientKineticFriction = 0.3;

        int dx = 440;
        int dx2 = 175;

        double normalForce = mass * g; // Fn = m * g
        double gravityForce = mass * g; // Fg = m * g

        double staticFrictionForce = coefficientStaticFriction * normalForce; // Fs = μs * Fn
        double kineticFrictionForce = coefficientKineticFriction * normalForce; // Fk = μk * Fn

        double netForceY = normalForce - gravityForce; // Fnety = Fn - Fg
        double netForceX = appliedForce - kineticFrictionForce; // Fnetx = Fapp - Fk

        double netForce = netForceX + netForceY; // Fnet = Fnetx + Fnety

        if (appliedForce == 0) {
            staticFrictionForce = 0;
            kineticFrictionForce = 0;
            netForce = 0;
        } else if (appliedForce > 0 && appliedForce <= staticFrictionForce) {
            appliedForce = staticFrictionForce;
            kineticFrictionForce = 0;
            netForce = 0;
        } else if (appliedForce > staticFrictionForce) {
            staticFrictionForce = 0;
            kineticFrictionForce = coefficientKineticFriction * normalForce;
            netForce = appliedForce - kineticFrictionForce;
        }

        JPanel floorPanel = new JPanel();
        floorPanel.setBackground(new Color(65, 65, 65));
        int floorY = 540;
        floorPanel.setBounds(0, floorY, 1000, 20);

        JPanel floorPanel2 = new JPanel();
        floorPanel2.setBackground(new Color(255, 255, 255));
        int floorY2 = 275;
        floorPanel2.setBounds(0, floorY2, 1000, 20);

        ImageIcon boxIcon = new ImageIcon("box.png");
        JLabel box = new JLabel(boxIcon);
        box.setBounds(100, 440, 100, 100);

        ImageIcon box2Icon = new ImageIcon("box2.png");
        JLabel box2 = new JLabel(box2Icon);
        box2.setBounds(0, 175, 100, 100);

        if (netForce > staticFrictionForce) {
            Timer timer = new Timer();
            TimerTask task = new TimerTask() {
                double dt = 0.01;

                double velocityX = vx;
                double distanceX = dx;

                double velocityX2 = vx2;
                double distanceX2 = dx2;

                @Override
                public void run() {
                    velocityX -= Math.signum(velocityX) * coefficientKineticFriction * g * dt;
                    velocityX2 -= Math.signum(velocityX2) * coefficientKineticFriction * g * dt;

                    distanceX += velocityX;
                    distanceX2 += velocityX2;

                    if (distanceX >= 900 || distanceX <= 0) {
                        velocityX = -velocityX;
                    }

                    if (distanceX2 >= 899 || distanceX2 <= 0) {
                        velocityX2 = -velocityX2;
                    }

                    SwingUtilities.invokeLater(() -> {
                        box.setBounds((int) distanceX, 440, 100, 100);
                        box2.setBounds((int) distanceX2, 175, 100, 100);
                    });
                }
            };

            timer.scheduleAtFixedRate(task, 0, 10);
        }

        frame.setSize(1000, 600);
        frame.getContentPane().setBackground(new Color(0, 0, 0));
        frame.setLayout(null);

        frame.add(floorPanel);
        frame.add(floorPanel2);
        frame.add(box);
        frame.add(box2);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}