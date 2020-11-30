package vmcs.model;

import java.util.Observable;

public abstract class Stock extends Observable {

    private String name;
    private int value;
    private int quantity;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
        setChanged();
        notifyObservers();
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
        setChanged();
        notifyObservers();
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
        setChanged();
        notifyObservers();
    }

    public void increaseStock() {
        //System.out.println(getQuantity());
        setQuantity(this.quantity + 1);
        //System.out.println(getQuantity());
    }

    public void decreaseStock() {
        //System.out.println(getQuantity());
        setQuantity(this.quantity - 1);
        //System.out.println(getQuantity());
    }

    @Override
    public String toString() {
        return this.getClass().getSimpleName() + "{" + "name=" + name + ", value=" + value + ", quantity=" + quantity + '}';
    }

//	@Override
//	public boolean equals(Object obj) {
//		Stock stock = (Stock) obj;
//		if(this.name.equalsIgnoreCase(stock.getName())
//				&& this.value == stock.getValue()
//				&& this.quantity == stock.getQuantity())
//			return true;
//		else
//			return false;
//	}
    public boolean equals(Object obj) {
        Stock stock = (Stock) obj;
        if (this.name.equalsIgnoreCase(stock.getName())) {
            return true;
        } else {
            return false;
        }

    }

}
