package com.qlvl.pojo;

import com.qlvl.pojo.Job;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-27T14:36:58")
@StaticMetamodel(Major.class)
public class Major_ { 

    public static volatile SingularAttribute<Major, Integer> id;
    public static volatile SingularAttribute<Major, String> nameMajor;
    public static volatile SetAttribute<Major, Job> jobSet;

}