package com.qlvl.pojo;

import com.qlvl.pojo.Job;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-10-09T11:11:45")
@StaticMetamodel(Education.class)
public class Education_ { 

    public static volatile SingularAttribute<Education, String> typeEducation;
    public static volatile SingularAttribute<Education, Integer> id;
    public static volatile SetAttribute<Education, Job> jobSet;

}