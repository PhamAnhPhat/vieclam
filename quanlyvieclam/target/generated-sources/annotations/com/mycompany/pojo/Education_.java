package com.mycompany.pojo;

import com.mycompany.pojo.Job;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-08T16:59:02")
@StaticMetamodel(Education.class)
public class Education_ { 

    public static volatile SingularAttribute<Education, String> typeEducation;
    public static volatile SingularAttribute<Education, Integer> id;
    public static volatile SetAttribute<Education, Job> jobSet;

}