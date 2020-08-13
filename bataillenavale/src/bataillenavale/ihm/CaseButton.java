package bataillenavale.ihm;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JButton;

public class CaseButton extends JButton{
	private int colonne;
	private int ligne;
	private int ship;
	private int attacked;
	
	public CaseButton(int pion, int colonne, int ligne) {
		super();
		this.colonne=colonne;
		this.ligne=ligne;
		this.ship=0;
		this.attacked=0;
		this.setSize(25,25);
		this.setBackground(new Color(200, 200, 255));
	}

	/**
	 * @return the colonne
	 */
	public int getColonne() {
		return colonne;
	}

	/**
	 * @param colonne the colonne to set
	 */
	public void setColonne(int colonne) {
		this.colonne = colonne;
	}

	/**
	 * @return the ligne
	 */
	public int getLigne() {
		return ligne;
	}

	/**
	 * @param ligne the ligne to set
	 */
	public void setLigne(int ligne) {
		this.ligne = ligne;
	}

	/**
	 * @return the ship
	 */
	public int getShip() {
		return ship;
	}

	/**
	 * @param ship the ship to set
	 */
	public void setShip(int ship) {
		this.ship = ship;
	}

	/**
	 * @return the attacked
	 */
	public int getAttacked() {
		return attacked;
	}

	/**
	 * @param attacked the attacked to set
	 */
	public void setAttacked(int attacked) {
		this.attacked = attacked;
	}

	
}
