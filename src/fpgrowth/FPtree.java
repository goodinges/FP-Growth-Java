/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fpgrowth;

import java.util.Vector;

/**
 *
 * @author Kamran
 */
public class FPtree {

    public FPtree(String item) {
        this.item = item;
        next = null;
        children = new Vector<FPtree>();
        root = false;
    }

    boolean root;
    String item;
    Vector<FPtree> children;
    FPtree parent;
    FPtree next;
    int count;

    boolean isRoot(){
        return root;
    }

}
