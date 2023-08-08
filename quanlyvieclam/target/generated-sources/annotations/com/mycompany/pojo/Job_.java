package com.mycompany.pojo;

import com.mycompany.pojo.Application;
import com.mycompany.pojo.City;
import com.mycompany.pojo.District;
import com.mycompany.pojo.Education;
import com.mycompany.pojo.Employer;
import com.mycompany.pojo.Major;
import com.mycompany.pojo.Typejob;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-08T16:59:02")
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