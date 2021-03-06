package net.xaviersala.camells;

import acm.graphics.GImage;

/**
 * Classe que implementa els camells.
 *
 * @author xavier
 *
 */
public class Camell {
    /**
     * Comptador de camells.
     */
    private static int lastID = 1;

    /**
     * Identificador del camell.
     */
    private int id;
    /**
     * Velocitat per defecte.
     */
    private static final int VELOCITATDEFECTE = 10;
    /**
     * Velocitat màxima del camell.
     */
    private int maximaVelocitat;
    /**
     * Imatges possibles dels camells.
     */
    private String[] imatgesCamells = {"vermell.jpg", "verd.jpg", "groc.jpg",
            "blau.jpg", "negre.jpg", "taronja.jpg", "rosa.jpg" };

    /**
     * Imatge del camell.
     */
    private GImage imatge;

    /**
     * Constructor del camell.
     */
    public Camell() {
        int triaColor = (int) (Math.random() * imatgesCamells.length);
        this.imatge = new GImage(imatgesCamells[triaColor]);

        id = lastID;
        lastID++;

        maximaVelocitat = VELOCITATDEFECTE;
    }

    /**
     * @return id del camell
     */
    public final int getID() {
        return id;
    }

    /**
     * @return Retorna la imatge del camell.
     */
    public final GImage getImatge() {
        return imatge;
    }

    /**
     * @return posicioX
     */
    public final double getPosicio() {
        return imatge.getX() + imatge.getWidth();
    }

    /**
     * Defineix la posició del camell.
     *
     * @param x
     *            posició X
     * @param y
     *            posició Y
     */
    public final void setPosicio(final double x, final double y) {
        imatge.setLocation(x, y);
    }

    /**
     * Mou el camell en la direcció especificada.
     *
     * @param x
     *            píxels en la direcció x
     * @param y
     *            píxels en la direcció y
     */
    public final void mou(final double x, final double y) {
        imatge.move(x, y);
    }

    /**
     * @return velocitat màxima a la que pot anar el camell
     */
    public final int getMaximaVelocitat() {
        return maximaVelocitat;
    }

    /**
     * Definir la velocitat màxima a la que pot anar el camell.
     *
     * @param maxima
     *            velocitat
     */
    public final void setMaximaVelocitat(final int maxima) {
        maximaVelocitat = maxima;
    }

}
