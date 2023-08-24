package com.qlvl.pojo;

import com.qlvl.pojo.Job;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-24T12:40:25")
@StaticMetamodel(District.class)
public class District_ { 

    public static volatile SingularAttribute<District, Integer> id;
    public static volatile SingularAttribute<District, String> nameDistrict;
    public static volatile SetAttribute<District, Job> jobSet;

}