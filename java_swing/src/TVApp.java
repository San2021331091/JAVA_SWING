import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TVApp extends JFrame {
    private int currentChannel = 1;
    private int currentVolume = 50;

    private JLabel channelLabel;
    private JLabel volumeLabel;
    private JLabel liveChannel;

    public TVApp() {
        setTitle("TV App");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        // Create components
        JPanel mainPanel = new JPanel();
        mainPanel.setLayout(new BorderLayout());

        JPanel controlPanel = new JPanel();
        controlPanel.setLayout(new FlowLayout());

        JButton prevChannelButton = new JButton("Prev Channel");
        JButton nextChannelButton = new JButton("Next Channel");
        JButton volumeUpButton = new JButton("Volume Up");
        JButton volumeDownButton = new JButton("Volume Down");

        channelLabel = new JLabel("Channel: " + currentChannel);
        volumeLabel = new JLabel("Volume: " + currentVolume);
        liveChannel = new JLabel("Live Channel: " + currentChannel); // Placeholder for live channel

        // Add components to control panel
        controlPanel.add(prevChannelButton);
        controlPanel.add(nextChannelButton);
        controlPanel.add(volumeUpButton);
        controlPanel.add(volumeDownButton);

        // Add listeners to buttons
        prevChannelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                prevChannel();
            }
        });

        nextChannelButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                nextChannel();
            }
        });

        volumeUpButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                increaseVolume();
            }
        });

        volumeDownButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                decreaseVolume();
            }
        });

        // Add components to main panel
        mainPanel.add(channelLabel, BorderLayout.NORTH);
        mainPanel.add(volumeLabel, BorderLayout.SOUTH);
        mainPanel.add(controlPanel, BorderLayout.CENTER);
        mainPanel.add(liveChannel, BorderLayout.CENTER);

        add(mainPanel);
        setVisible(true);
    }

    private void prevChannel() {
        if (currentChannel > 1) {
            currentChannel--;
            channelLabel.setText("Channel: " + currentChannel);
            liveChannel.setText("Live Channel: " + currentChannel); // Update live channel display
        }
    }

    private void nextChannel() {
        // Assuming there are 100 channels
        if (currentChannel < 100) {
            currentChannel++;
            channelLabel.setText("Channel: " + currentChannel);
            liveChannel.setText("Live Channel: " + currentChannel); // Update live channel display
        }
    }

    private void increaseVolume() {
        if (currentVolume < 100) {
            currentVolume += 5;
            volumeLabel.setText("Volume: " + currentVolume);
        }
    }

    private void decreaseVolume() {
        if (currentVolume > 0) {
            currentVolume -= 5;
            volumeLabel.setText("Volume: " + currentVolume);
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new TVApp();
            }
        });
    }
}
