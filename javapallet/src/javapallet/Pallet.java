package javapallet;


public class Pallet {
    private String product;
    private int qtd; 

    public String getProduct() {
        return product;
    }

    public void setProduct(String prduct) {
        this.product = prduct;
    }
 int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }
    @Override
    public String toString(){
        return getProduct()+ " : " + getQtd();
        
    }
}// end class
