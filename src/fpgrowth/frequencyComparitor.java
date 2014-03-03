/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package fpgrowth;

import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author Kamran
 */
class frequencyComparitorinHeaderTable implements Comparator<FPtree>{

    public frequencyComparitorinHeaderTable() {
    }

    public int compare(FPtree o1, FPtree o2) {
        if(o1.count>o2.count){
            return 1;
        }
        else if(o1.count < o2.count)
            return -1;
        else
            return 0;
    }

}
