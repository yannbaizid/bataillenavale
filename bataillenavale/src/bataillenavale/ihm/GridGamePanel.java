package bataillenavale.ihm;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

public class GridGamePanel extends JPanel implements MouseListener {
	private final int nbColonne = 12;
	private final int nbLigne = 12;
	private CaseButton[][] gameGrid = new CaseButton[this.nbColonne][this.nbLigne];
	private int tailleBateau = 3;
	private boolean vertical = true;

	public GridGamePanel() {

		GridLayout gridBorderLayout = new GridLayout(12, 12);
		this.setLayout(gridBorderLayout);
		this.setSize(480, 480);
		for (int i = 0; i < nbColonne; i++) {
			for (int j = 0; j < nbLigne; j++) {
				gameGrid[i][j] = new CaseButton(0, i, j);
				gameGrid[i][j].addMouseListener(this);
				this.add(gameGrid[i][j]);
			}
		}
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		CaseButton button = (CaseButton) e.getSource();

		if (button.getShip() == 0) {
			String emplacementToString = "";
			String batimentToString = "";
			for (int i = 0; i < this.tailleBateau; i++) {
				batimentToString += 0;
			}
			int index1;
			int index2;
			if (this.vertical) {
				index1 = Math.max(button.getColonne() - this.tailleBateau + 1, 0);
				index2 = Math.min(button.getColonne() + this.tailleBateau - 1, this.nbColonne - 1);
				for (int i = index1; i <= index2; i++) {
					emplacementToString += this.gameGrid[i][button.getLigne()].getShip();
				}

			} else {
				index1 = Math.max(button.getLigne() - this.tailleBateau + 1, 0);
				index2 = Math.min(button.getLigne() + this.tailleBateau - 1, this.nbLigne - 1);
				for (int i = index1; i <= index2; i++) {
					emplacementToString += this.gameGrid[button.getColonne()][i].getShip();
				}

			}
			System.out.println(emplacementToString);
			if (emplacementToString.indexOf(batimentToString) != -1) {
				index1 += emplacementToString.indexOf(batimentToString);
				index2 = index1 + this.tailleBateau - 1;
				button.setBackground(Color.RED);
				button.setShip(1);
				button.setEnabled(false);
				if (this.vertical) {
					for (int i = index1; i <= index2; i++) {
						this.gameGrid[i][button.getLigne()].setBackground(button.getBackground());
						this.gameGrid[i][button.getLigne()].setShip(button.getShip());
						this.gameGrid[i][button.getLigne()].setEnabled(false);
					}

				} else {
					for (int i = index1; i <= index2; i++) {
						this.gameGrid[button.getColonne()][i].setBackground(button.getBackground());
						this.gameGrid[button.getColonne()][i].setShip(button.getShip());
						this.gameGrid[button.getColonne()][i].setEnabled(false);
					}
				}
				this.vertical=!this.vertical;
				this.tailleBateau=((this.tailleBateau-1)%3)+2;

			}
		} else

		{

		}
		
	

	}

	@Override
	public void mouseEntered(MouseEvent e) {
		CaseButton button = (CaseButton) e.getSource();
		if (button.getShip() == 0) {
			String emplacementToString = "";
			String batimentToString = "";
			for (int i = 0; i < this.tailleBateau; i++) {
				batimentToString += 0;
			}
			int index1;
			int index2;
			if (this.vertical) {
				index1 = Math.max(button.getColonne() - this.tailleBateau + 1, 0);
				index2 = Math.min(button.getColonne() + this.tailleBateau - 1, this.nbColonne - 1);
				for (int i = index1; i <= index2; i++) {
					emplacementToString += this.gameGrid[i][button.getLigne()].getShip();
				}

			} else {
				index1 = Math.max(button.getLigne() - this.tailleBateau + 1, 0);
				index2 = Math.min(button.getLigne() + this.tailleBateau - 1, this.nbLigne - 1);
				for (int i = index1; i <= index2; i++) {
					emplacementToString += this.gameGrid[button.getColonne()][i].getShip();
				}

			}
			System.out.println(emplacementToString);
			if (emplacementToString.indexOf(batimentToString) != -1) {
				index1 += emplacementToString.indexOf(batimentToString);
				index2 = index1 + this.tailleBateau - 1;
				button.setBackground(button.getBackground().darker());
				if (this.vertical) {
					for (int i = index1; i <= index2; i++) {
						this.gameGrid[i][button.getLigne()].setBackground(button.getBackground());
					}

				} else {
					for (int i = index1; i <= index2; i++) {
						this.gameGrid[button.getColonne()][i].setBackground(button.getBackground());
					}
				}

			}
		} else

		{

		}
	}

	@Override
	public void mouseExited(MouseEvent e) {
		CaseButton button = (CaseButton) e.getSource();
		if (button.getShip() == 0) {
			String emplacementToString = "";
			String batimentToString = "";
			for (int i = 0; i < this.tailleBateau; i++) {
				batimentToString += 0;
			}
			int index1;
			int index2;
			if (this.vertical) {
				index1 = Math.max(button.getColonne() - this.tailleBateau + 1, 0);
				index2 = Math.min(button.getColonne() + this.tailleBateau - 1, this.nbColonne - 1);
				for (int i = index1; i <= index2; i++) {
					emplacementToString += this.gameGrid[i][button.getLigne()].getShip();
				}

			} else {
				index1 = Math.max(button.getLigne() - this.tailleBateau + 1, 0);
				index2 = Math.min(button.getLigne() + this.tailleBateau - 1, this.nbLigne - 1);
				for (int i = index1; i <= index2; i++) {
					emplacementToString += this.gameGrid[button.getColonne()][i].getShip();
				}

			}
			System.out.println(emplacementToString);
			if (emplacementToString.indexOf(batimentToString) != -1) {
				index1 += emplacementToString.indexOf(batimentToString);
				index2 = index1 + this.tailleBateau - 1;
				button.setBackground(button.getBackground().brighter());
				if (this.vertical) {
					for (int i = index1; i <= index2; i++) {
						this.gameGrid[i][button.getLigne()].setBackground(button.getBackground());
					}

				} else {
					for (int i = index1; i <= index2; i++) {
						this.gameGrid[button.getColonne()][i].setBackground(button.getBackground());
					}
				}

			}
		} else

		{

		}
	}

	@Override
	public void mousePressed(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

	@Override
	public void mouseReleased(MouseEvent arg0) {
		// TODO Auto-generated method stub

	}

}
