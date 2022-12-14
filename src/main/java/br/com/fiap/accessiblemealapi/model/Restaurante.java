package br.com.fiap.accessiblemealapi.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.validation.constraints.NotBlank;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Restaurante {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @NotBlank(message = "Campo obrigatório")
    private String name;

    @NotBlank(message = "Campo obrigatório")
    private String email;

    @NotBlank(message = "Campo obrigatório")
    private String cnpj;

    @NotBlank(message = "Campo obrigatório")
    private String address;

    @NotBlank(message = "Campo obrigatório")
    private String typePCD;

    @Lob
    private byte[] menu;

    @Lob
    private byte[] profilePicture;

    private Integer classification;

    public Restaurante(String name, String email, String cnpj, String address,
            String typePCD, byte[] menu, byte[] profilePicture, Integer classification) {
        this.name = name;
        this.email = email;
        this.cnpj = cnpj;
        this.address = address;
        this.typePCD = typePCD;
        this.menu = menu;
        this.profilePicture = profilePicture;
        this.classification = classification;
    }

    public Restaurante(String name, String email, String cnpj, String address,
            String typePCD) {
        this.name = name;
        this.email = email;
        this.cnpj = cnpj;
        this.address = address;
        this.typePCD = typePCD;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCnpj() {
        return cnpj;
    }

    public void setCnpj(String cnpj) {
        this.cnpj = cnpj;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getTypePCD() {
        return typePCD;
    }

    public void setTypePCD(String typePCD) {
        this.typePCD = typePCD;
    }

    public byte[] getMenu() {
        return menu;
    }

    public void setMenu(byte[] menu) {
        this.menu = menu;
    }

    public byte[] getProfilePicture() {
        return profilePicture;
    }

    public void setProfilePicture(byte[] profilePicture) {
        this.profilePicture = profilePicture;
    }

    public Integer getClassification() {
        return classification;
    }

    public void setClassification(Integer classification) {
        this.classification = classification;
    }

    @Override
    public String toString() {
        return "Restaurante [acessibilidade=" + typePCD + ", cnpj=" + cnpj + ", email=" + email + ", endereco="
                + address + ", id=" + id + ", nome=" + name + "]";
    } 
    
}
