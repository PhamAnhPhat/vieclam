package com.mycompany.pojo;

import com.mycompany.pojo.Job;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-11T10:32:11")
@StaticMetamodel(Typejob.class)
public class Typejob_ { 

    public static volatile SingularAttribute<Typejob, String> nameType;
    public static volatile SingularAttribute<Typejob, Integer> id;
    public static volatile SetAttribute<Typejob, Job> jobSet;

}