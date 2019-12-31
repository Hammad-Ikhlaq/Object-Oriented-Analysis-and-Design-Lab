/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author l164281
 */
public class Medicine {

    public int getId() {
        return id;
    }

    public String getMedName() {
        return medName;
    }

    public Float getMedPrice() {
        return medPrice;
    }

    public int getMedQuantity() {
        return medQuantity;
    }

        int id;
	String medName;
	Float medPrice; 
	int medQuantity;

    public Medicine(int id, String medName, Float medPrice, int medQuantity) {
        this.id = id;
        this.medName = medName;
        this.medPrice = medPrice;
        this.medQuantity = medQuantity;
    }


}
