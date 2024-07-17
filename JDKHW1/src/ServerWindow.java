import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;


public class ServerWindow extends JFrame {
    private static final int POS_X = 500;
    private static final int POS_Y = 550;
    private static final int WIDTH = 400;
    private static final int HEIGHT = 300;
    private final JButton btnStart = new JButton("START");
    private final JButton btnStop = new JButton("STOP");
    private final JTextArea log = new JTextArea();
    private boolean isServerWorking;

    private final JPanel panelBottom = new JPanel(new BorderLayout());

    public ServerWindow() {
        isServerWorking = false;
        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = false;
                log.append("Stopped" + "\n");
//                System.out.println("Stopped" + isServerWorking+ "\n");
            }
        });
        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                isServerWorking = true;
                log.append("Started" + "\n");
//                System.out.println("Started" + isServerWorking+ "\n");
            }
        });
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setBounds(POS_X, POS_Y, WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Server");
        setAlwaysOnTop(true);
        log.setEditable(false);
        JScrollPane scrollLog = new JScrollPane(log);
        add(scrollLog);

        panelBottom.add(btnStart, BorderLayout.WEST);
        panelBottom.add(btnStop, BorderLayout.EAST);
        add(panelBottom, BorderLayout.SOUTH);

        setVisible(true);
    }

    public void setLog(String login, String message) {
        log.append(login + ": " + message + "\n");
        File logMessager = new File("logMessager.txt");
        FileWriter fileWriter;
        try {
            fileWriter = new FileWriter(logMessager);
            fileWriter.append(log.getText());
            fileWriter.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}


