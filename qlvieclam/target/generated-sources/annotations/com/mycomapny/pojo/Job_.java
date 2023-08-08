package com.mycomapny.pojo;

import com.mycomapny.pojo.Application;
import com.mycomapny.pojo.City;
import com.mycomapny.pojo.District;
import com.mycomapny.pojo.Education;
import com.mycomapny.pojo.Employer;
import com.mycomapny.pojo.Major;
import com.mycomapny.pojo.Typejob;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.9.v20210604-rNA", date="2023-08-08T14:20:30")
@StaticMetamodel(Job.class)
public class Job_ { 

    public static volatile SingularAttribute<Job, Major> majorID;
    public static volatile SingularAttribute<Job, City> cityID;
    public static volatile SingularAttribute<Job, String> salary;
    public static volatile SingularAttribute<Job, District> districID;
    public static volatile SingularAttribute<Job, String> nameJob;
    public static volatile SingularAttribute<Job, Employer> employerID;
    public static volatile SingularAttribute<Job, Education> educationID;
    public static volatile SingularAttribute<Job, Typejob> typeJobID;
    public static volatile SetAttribute<Job, Application> applicationSet;
    public static volatile SingularAttribute<Job, Integer> kinhNghiem;
    public static volatile SingularAttribute<Job, Integer> id;
    public static volatile SingularAttribute<Job, Integer> soLuongTuyenDung;
    public static volatile SingularAttribute<Job, Integer> age;

}