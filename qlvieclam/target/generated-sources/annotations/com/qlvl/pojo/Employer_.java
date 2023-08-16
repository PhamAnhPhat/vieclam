package com.qlvl.pojo;

import com.qlvl.pojo.Employerreview;
import com.qlvl.pojo.Job;
import com.qlvl.pojo.User;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-15T18:46:15")
@StaticMetamodel(Employer.class)
public class Employer_ { 

    public static volatile SingularAttribute<Employer, String> nameCompany;
    public static volatile SingularAttribute<Employer, String> soDienThoai;
    public static volatile SetAttribute<Employer, Employerreview> employerreviewSet;
    public static volatile SingularAttribute<Employer, String> nameEmployer;
    public static volatile SingularAttribute<Employer, Integer> id;
    public static volatile SingularAttribute<Employer, String> addressComapny;
    public static volatile SingularAttribute<Employer, String> avatar;
    public static volatile SingularAttribute<Employer, Boolean> isApproved;
    public static volatile SingularAttribute<Employer, User> userID;
    public static volatile SetAttribute<Employer, Job> jobSet;

}