package com.mycomapny.pojo;

import com.mycomapny.pojo.Job;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-08T14:20:30")
@StaticMetamodel(Typejob.class)
public class Typejob_ { 

    public static volatile SingularAttribute<Typejob, String> nameType;
    public static volatile SingularAttribute<Typejob, Integer> id;
    public static volatile SetAttribute<Typejob, Job> jobSet;

}