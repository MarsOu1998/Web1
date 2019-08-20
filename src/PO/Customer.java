package PO;

public class Customer {
    private String account,pwd,name,sex;
    private int age;

     public Customer(){}

     public  Customer(String account,String pwd,String name,int age,String sex){
        this.account=account;
        this.pwd=pwd;
        this.name=name;
        this.age=age;
        this.sex=sex;
     }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPwd() {
        return pwd;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }
}
