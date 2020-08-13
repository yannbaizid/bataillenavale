package bataillenavale.ihm;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;

import bataillenavale.services.BattleShipManager;

public class GameFrame extends JFrame{
	private GridGamePanel gridPanel= new GridGamePanel();
	private JPanel contentPanel=new JPanel();
	private BattleShipManager battleshipManager=new BattleShipManager();
	public GameFrame() {
		this.setSize(850,480);
		this.setTitle("Battleship! et Tortillas!");
		this.setResizable(false);
		BorderLayout borderLayout=new BorderLayout();
		contentPanel.setLayout(borderLayout);
		this.setContentPane(contentPanel);
		contentPanel.add(gridPanel,borderLayout.WEST);
		contentPanel.add(new GridGamePanel(),borderLayout.EAST);

		this.setVisible(true);
	}
}
