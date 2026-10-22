package io.github.skylinebnr334.Store_BuppanManager.BuppanRegister;

public class ProductInformation {
    private String _id;
    private String _name;
    private String _description;
    private long _price;
    public String getId(){
        return _id;
    }
    public String getName(){
        return _name;
    }
    public String getDescription(){
        return _description;
    }
    public long getPrice(){
        return _price;
    }
    public void setId(String id){
        this._id=id;
    }
    public void setName(String name){
        this._name=name;
    }
    public void setDescription(String description){
        this._description=description;
    }
    public void setPrice(long price){
        this._price=price;
    }

    @Override
    public boolean equals(Object obj) {
        if(obj==null) return false;
        if(!(obj instanceof ProductInformation)) return false;
        boolean flag=false;
        flag=((ProductInformation)obj).getDescription().equals(_description)
            && ((ProductInformation)obj).getId().equals(_id)
            && ((ProductInformation)obj).getName().equals(_name)
            && ((ProductInformation)obj).getPrice()==_price;
        return flag;
    }
}
