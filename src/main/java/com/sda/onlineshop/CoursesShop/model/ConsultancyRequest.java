package com.sda.onlineshop.CoursesShop.model;

import com.sda.onlineshop.CoursesShop.model.constant.ConsultancyProductsType;
import com.sda.onlineshop.CoursesShop.model.constant.ConsultancyCourseType;
import jakarta.persistence.*;

@Entity
@Table(name = "consultancy")
public class ConsultancyRequest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;
//    @NotNull(message = "Average monthly consumption must be not null!")
//    @NotBlank(message = "Average monthly consumption must be not blank!")
   // @Pattern(regexp = "^\\d{0,8}[.]?\\d{1,4}$")
//    @Column(name = "average_monthly_consumption")
//    private Double averageMonthlyConsumption;
//    @NotNull(message = "Roof type must be not null")
    @Enumerated(EnumType.STRING)
    @Column(name = "course_type")
    private ConsultancyCourseType courseType;
//    @NotNull(message = "Products type must be not null")
    @Enumerated(EnumType.STRING)
    @Column(name = "products_type")
    private ConsultancyProductsType productsType;

    @ManyToOne
    @JoinColumn(name = "client_profile_id")
    private ClientProfile client;


    public ConsultancyRequest() {
    }

    public ConsultancyRequest( ConsultancyCourseType roofType, ConsultancyProductsType productsType) {
     //   this.averageMonthlyConsumption = averageMonthlyConsumption;
        this.courseType = roofType;
        this.productsType = productsType;
    }
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

 /*  public Double getAverageMonthlyConsumption() {
        return averageMonthlyConsumption;
    }

    public void setAverageMonthlyConsumption(Double averageMonthlyConsumption) {
        this.averageMonthlyConsumption = averageMonthlyConsumption;
    }
*/
    public ConsultancyCourseType getCourseType() {
        return courseType;
    }

    public void setCourseType(ConsultancyCourseType courseType) {
        this.courseType = courseType;
    }

    public ConsultancyProductsType getProductsType() {
        return productsType;
    }

    public void setProductsType(ConsultancyProductsType productsType) {
        this.productsType = productsType;
    }

    public ClientProfile getClient() {
        return client;
    }

    public void setClient(ClientProfile client) {
        this.client = client;
    }

}
