package Elements;

import moteurJeu.sprite.Sprite;

/**
 * Classe représentant une case
 */
public class Case extends Sprite {

    /**
     * Position de la case
     */
    private int x, y;

    /**
     * Type de la case
     */
    private int type;
    
    /**
     * Si la case est traversable ou non 
     */
    private boolean traversable;

    /**
     * Type représentant un vide
     */
    public static final int TYPE_VIDE = 1;
    /**
     * Type représentant un mur
     */
    public static final int TYPE_MUR = 2;
    
    /**
     * Type representante une case a effet
     */
    public static final int TYPE_EFFET = 3;
    
    /**
     * Type representante une porte
     */
    public static final int TYPE_PORTE = 4;
    
    /**
     * Constructeur
     */
    public Case(int x, int y, int type) {
        super("entities_0_1");
        switch (type){
            case TYPE_VIDE:
                break;
            case TYPE_MUR:
                setNomImage("entities_0_2");
                break;
            case TYPE_EFFET:
                setNomImage("entities_0_3");
                break;
            case TYPE_PORTE:
            	break;
            default:
                throw new IllegalArgumentException("Type inconnu : " + type);
        }

        this.x = x;
        this.y = y;
        this.type = type;
        
        if(type == TYPE_MUR || type == TYPE_PORTE) {
        	this.traversable = false;
        }else {
        	this.traversable = true;
        }
    }

    /**
     * Getter de l'attibut type
     * @return le type de la case
     */
    public int getType() {
        return type;
    }
    
    /**
     * Getter de l'attribut traversable
     * @return l'attribut traversable
     */
    public boolean estTraversable() { return this.traversable; }
    
    /**
     * Setter de l'attribut traversable
     * @param t la nouvelle valeur de traverable
     */
    public void setTraversable(boolean t) {
    	this.traversable = t;	
    }

    @Override
    public int getPosX() {
        return x;
    }

    @Override
    public int getPosY() {
        return y;
    }
}