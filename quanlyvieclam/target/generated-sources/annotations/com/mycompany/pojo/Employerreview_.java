package com.mycompany.pojo;

import com.mycompany.pojo.Employer;
import com.mycompany.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-13T16:59:59")
@StaticMetamodel(Employerreview.class)
public class Employerreview_ { 

    public static volatile SingularAttribute<Employerreview, Employer> employerID;
    public static volatile SingularAttribute<Employerreview, Double> rating;
    public static volatile SingularAttribute<Employerreview, Integer> id;
    public static volatile SingularAttribute<Employerreview, String> cmt;
    public static volatile SingularAttribute<Employerreview, User> userID;

}