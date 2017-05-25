package models;

import java.util.*;
import util.*;

public abstract class Aventurier {

	ArrayList<CarteTresor> cartes = new ArrayList();
	Tuile emplacement;
	private int nbactions = 0;
	private boolean helicoUtilise;
        
	/**
	 * 
	 * @param c
	 */
	public void utiliserCarte(CarteTresor c) {
		// TODO - implement Aventurier.utiliserCarte
		throw new UnsupportedOperationException();
	}

	public int getNbactions() {
		return this.nbactions;
	}

	/**
	 * 
	 * @param nb
	 */
	public void setNbactions(int nb) {
		this.nbactions = nb;
	}

	/**
	 * 
	 * @param c
	 */
	public void jetercarte(CarteTresor c) {
		cartes.remove(c);
	}

	public ArrayList<CarteTresor> getCartes() {
		return cartes;
	}

	/**
	 * 
	 * @param c
	 */
	public void ajouterCarte(CarteTresor c) {
		cartes.add(c);
	}

	public Tuile getPos() {
		return emplacement;
	}

	/**
	 * 
	 * @param t
	 */
	public void setPos(Tuile t) {
		emplacement = t;
	}

	public boolean getHelicoUtilise() {
		return this.helicoUtilise;
	}

	/**
	 * 
	 * @param h
	 */
	public void setHelicoUtilise(boolean h) {
		this.helicoUtilise = h;
	}

	/**
	 * 
	 * @param g
	 */
	public void seDeplacer(Grille g) {
		// TODO - implement Aventurier.seDeplacer
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	public void assecher(Grille g) {
		// TODO - implement Aventurier.assecher
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param g
	 */
	public void donnerCarte(Grille g) {
		// TODO - implement Aventurier.donnerCarte
		throw new UnsupportedOperationException();
	}

	public void recupTresor() {
		// TODO - implement Aventurier.recupTresor
		throw new UnsupportedOperationException();
	}

	/**
	 * 
	 * @param t
	 */

	/**
	 * 
	 * @param g
	 * @param type
	 */
	public ArrayList<Tuile> getTuilesAcc(Grille g, int type) {
		ArrayList<Tuile> ta = new ArrayList();
                if (type == 2)
                    ta.add(emplacement);
                if (emplacement.getLigne() !=0)
                    if (g.getGrille()[emplacement.getLigne()-1][emplacement.getColonne()] != null && !g.getGrille()[emplacement.getLigne()-1][emplacement.getColonne()].estMorte()) {
                        ta.add(g.getGrille()[emplacement.getLigne()-1][emplacement.getColonne()]);
                    }
                if (emplacement.getLigne() !=5)
                    if (g.getGrille()[emplacement.getLigne()+1][emplacement.getColonne()] != null && !g.getGrille()[emplacement.getLigne()+1][emplacement.getColonne()].estMorte()) {
                        ta.add(g.getGrille()[emplacement.getLigne()+1][emplacement.getColonne()]);
                    }
                if (emplacement.getColonne() !=0)
                    if (g.getGrille()[emplacement.getLigne()][emplacement.getColonne()-1] != null && !g.getGrille()[emplacement.getLigne()][emplacement.getColonne()-1].estMorte()) {
                        ta.add(g.getGrille()[emplacement.getLigne()][emplacement.getColonne()-1]);
                    }
                if (emplacement.getColonne() !=0)
                    if (g.getGrille()[emplacement.getLigne()][emplacement.getColonne()+1] != null && !g.getGrille()[emplacement.getLigne()][emplacement.getColonne()+1].estMorte()) {
                        ta.add(g.getGrille()[emplacement.getLigne()][emplacement.getColonne()+1]);
                    }
                return ta;
	}

}