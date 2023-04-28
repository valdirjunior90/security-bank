package model;
import java.io.Serializable;
import java.util.Date;

public class Client implements Serializable{
    private Integer id;
    private String name;
    private String cpf;
    private String address;
    private String phone;
    private Date birthDate;

    public Client(String name, String cpf, String address, String phone, Date birthDate) {
        this.name = name;
        this.cpf = cpf;
        this.address = address;
        this.phone = phone;
        this.birthDate = birthDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public Date getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(Date birthDate) {
        this.birthDate = birthDate;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
