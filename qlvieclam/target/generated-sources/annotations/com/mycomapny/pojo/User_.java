package com.mycomapny.pojo;

import com.mycomapny.pojo.Application;
import com.mycomapny.pojo.Employer;
import com.mycomapny.pojo.Employerreview;
import com.mycomapny.pojo.Role;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-08T13:26:45")
@StaticMetamodel(User.class)
public class User_ { 

    public static volatile SingularAttribute<User, String> password;
    public static volatile SetAttribute<User, Application> applicationSet;
    public static volatile SetAttribute<User, Employer> employerSet;
    public static volatile SingularAttribute<User, Role> roleID;
    public static volatile SetAttribute<User, Employerreview> employerreviewSet;
    public static volatile SingularAttribute<User, Integer> id;
    public static volatile SingularAttribute<User, String> avatar;
    public static volatile SingularAttribute<User, String> username;

}