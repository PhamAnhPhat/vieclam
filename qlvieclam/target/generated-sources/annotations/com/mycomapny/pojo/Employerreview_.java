package com.mycomapny.pojo;

import com.mycomapny.pojo.Employer;
import com.mycomapny.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-08T14:20:30")
@StaticMetamodel(Employerreview.class)
public class Employerreview_ { 

    public static volatile SingularAttribute<Employerreview, Employer> employerID;
    public static volatile SingularAttribute<Employerreview, Double> rating;
    public static volatile SingularAttribute<Employerreview, Integer> id;
    public static volatile SingularAttribute<Employerreview, String> cmt;
    public static volatile SingularAttribute<Employerreview, User> userID;

}