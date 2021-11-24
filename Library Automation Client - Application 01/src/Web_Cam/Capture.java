/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Web_Cam;
import Background.Bugs;
import Interfaces.damage;
import static Interfaces.damage.pre;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

import javax.imageio.ImageIO;
import javax.swing.AbstractAction;
import javax.swing.JButton;
import javax.swing.JFrame;

import com.github.sarxos.webcam.Webcam;
import com.github.sarxos.webcam.WebcamPanel;
import com.github.sarxos.webcam.WebcamResolution;
import java.awt.Image;
import java.util.Random;
import javax.swing.ImageIcon;


@SuppressWarnings("serial")

public class Capture extends JFrame
{

	public class SnapMeAction extends AbstractAction 
        {

		public SnapMeAction() 
                {
			super("Snapshot");
		}

		@Override
		public void actionPerformed(ActionEvent e)
                {
			try 
                        {
				for (int i = 0; i < webcams.size(); i++)
                                {
                                        Random rand = new Random();
                                        
                                        int value = rand.nextInt(99999);
                                        
                                        String image_name = "images/Image-"+String.valueOf(value)+".jpg";
					
                                        Webcam webcam = webcams.get(i);
				
                                        File file = new File(String.format(image_name, i));
					
                                        ImageIO.write(webcam.getImage(), "JPG", file);
					
                                        damage.clue_path.setText(file.getName());
                                        
                                        ImageIcon imageIcon = new ImageIcon(new ImageIcon(image_name).getImage().getScaledInstance(448,322, Image.SCALE_DEFAULT));
                                        
                                        pre.setIcon(imageIcon);
				}
			}
                        catch (IOException error) 
                        {
                            Bugs.exceptions(String.valueOf(error));
			}
		}
	}

	private class StartAction extends AbstractAction implements Runnable {

		public StartAction()
                {
			super("Start");
		}

		@Override
		public void actionPerformed(ActionEvent e)
                {

			btStart.setEnabled(false);
			
                        btSnapMe.setEnabled(true);

			// remember to start panel asynchronously - otherwise GUI will be
			// blocked while OS is opening webcam HW (will have to wait for
			// webcam to be ready) and this causes GUI to hang, stop responding
			// and repainting

			executor.execute(this);
		}

		@Override
		public void run() {

			btStop.setEnabled(true);

			for (WebcamPanel panel : panels) {
				panel.start();
			}
		}
	}

	private class StopAction extends AbstractAction {

		public StopAction() {
			super("Stop");
		}

		@Override
		public void actionPerformed(ActionEvent e) {

			btStart.setEnabled(true);
			btSnapMe.setEnabled(false);
			btStop.setEnabled(false);

			for (WebcamPanel panel : panels) {
				panel.stop();
			}
		}
	}

	private Executor executor = Executors.newSingleThreadExecutor();

	private Dimension size = WebcamResolution.VGA.getSize();

	private List<Webcam> webcams = Webcam.getWebcams();
	private List<WebcamPanel> panels = new ArrayList<WebcamPanel>();

	private JButton btSnapMe = new JButton(new SnapMeAction());
	private JButton btStart = new JButton(new StartAction());
	private JButton btStop = new JButton(new StopAction());

	public Capture() 
        {
            
            
		super("Image Caputure : SBB");

		for (Webcam webcam : webcams)
                {
			
                        webcam.setViewSize(size);
			
                        WebcamPanel panel = new WebcamPanel(webcam, size, false);
			
                        panel.setFPSDisplayed(true);
			
                        panel.setFillArea(true);
			
                        panels.add(panel);
		}
                
                setResizable(false);
                
                setIconImage(new ImageIcon(getClass().getResource("/Images/screenshot_30px.png")).getImage());

		// start application with disable snapshot button - we enable it when
		// webcam is started

		btSnapMe.setEnabled(false);
		
                btStop.setEnabled(false);

		setLayout(new FlowLayout());

		for (WebcamPanel panel : panels) {
			add(panel);
		}

		add(btSnapMe);
                
                btSnapMe.setFocusable(false);
		
                add(btStart);
                
                btStart.setFocusable(false);
		
                add(btStop);
                
                btStop.setFocusable(false);
                

		pack();
		
                setVisible(true);
                
                setLocationRelativeTo(null);
                		
                setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	}

	public static void main(String[] args) 
        {
            try 
             {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Windows".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch(Exception ERROR)
        {
            
        }
		new Capture();
	}
}

