package com.apinizer.example.api.openapi;

import io.swagger.v3.oas.annotations.media.Schema;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
import java.io.Serializable;
import java.util.Date;

public class Contact implements Serializable {

    private static final long serialVersionUID = 4048798961366546485L;

    @Schema(description = "Unique identifier of the Contact.",
            example = "1", required = true)
    private Long id;

    @Schema(description = "Name of the contact.",
            example = "Jessica Abigail", required = true)
    @NotBlank
    @Size(max = 100)
    private String name;

    @Schema(description = "Phone number of the contact.",
            example = "62482211", required = false)
    @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number")
    @Size(max = 25)
    private String phone;

    @Schema(description = "Email address of the contact.",
            example = "jessica@ngilang.com", required = false)
    @Email(message = "Email Address")
    @Size(max = 100)
    private String email;

    @Schema(description = "Address line 1 of the contact.",
            example = "888 Constantine Ave, #54", required = false)
    @Size(max = 50)
    private String address1;

    @Schema(description = "Address line 2 of the contact.",
            example = "San Angeles", required = false)
    @Size(max = 50)
    private String address2;

    @Schema(description = "Date area",
            example = "2020-01-01", required = false)
    @Size(max = 50)
    private Date date;

    @Schema(description = "Postal code of the contact.",
            example = "32106", required = false)
    @Size(max = 20)
    private Integer postalCode;

    @Schema(description = "Notes about the contact.",
            example = "Meet her at Spring Boot Conference", required = false)
    private String note;

    public Contact(Long id, @NotBlank @Size(max = 100) String name) {
        this.id = id;
        this.name = name;
    }

    public Contact(Long id, @NotBlank @Size(max = 100) String name, @Pattern(regexp = "^\\+?[0-9. ()-]{7,25}$", message = "Phone number") @Size(max = 25) String phone, @Email(message = "Email Address") @Size(max = 100) String email, @Size(max = 50) String address1, @Size(max = 50) String address2, Date date, @Size(max = 20) Integer postalCode, String note) {
        this.id = id;
        this.name = name;
        this.phone = phone;
        this.email = email;
        this.address1 = address1;
        this.address2 = address2;
        this.date = date;
        this.postalCode = postalCode;
        this.note = note;
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

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAddress1() {
        return address1;
    }

    public void setAddress1(String address1) {
        this.address1 = address1;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public Integer getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(Integer postalCode) {
        this.postalCode = postalCode;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }
}