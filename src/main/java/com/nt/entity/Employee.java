/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.nt.entity;


import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import java.io.Serializable;
import lombok.Data;
import org.hibernate.annotations.SQLDelete;
import org.hibernate.annotations.Where;

/**
 *
 * @author Shiva
 */
@Entity
@Table(name="EMPLOYEE")
@Data
@SQLDelete(sql="UPDATE EMPLOYEE SET STATUS='deleted' WHERE EID=?")
@Where(clause="STATUS <> 'deleted'")
public class Employee implements Serializable{

    public int geteId() {
        return eId;
    }

    public void seteId(int eId) {
        this.eId = eId;
    }

    public String geteName() {
        return eName;
    }

    public void seteName(String eName) {
        this.eName = eName;
    }
    @Id
//    @SequenceGenerator(name="gen1",sequenceName="emp_id_seq",initialValue=1,allocationSize=1)
    @GeneratedValue(strategy=GenerationType.AUTO)
    @Column(name="EID")
    public int eId;
     @Column(name="ENAME")
    public String eName;
      @Column(name="DESG")
    public String job;
       @Column(name="SAL")
    public int sal;
       @Column(name="DEPT")
    public int deptNo;
       @Column(name="STATUS")
    public String status="ACTIVE";

   
    
}
