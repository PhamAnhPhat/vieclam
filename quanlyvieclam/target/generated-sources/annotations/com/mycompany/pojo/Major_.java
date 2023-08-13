package com.mycompany.pojo;

import com.mycompany.pojo.Job;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-13T09:56:16")
@StaticMetamodel(Major.class)
public class Major_ { 

    public static volatile SingularAttribute<Major, Integer> id;
    public static volatile SingularAttribute<Major, String> nameMajor;
    public static volatile SetAttribute<Major, Job> jobSet;

}