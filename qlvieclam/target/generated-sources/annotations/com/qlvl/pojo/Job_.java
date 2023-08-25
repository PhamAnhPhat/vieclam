package com.qlvl.pojo;

import com.qlvl.pojo.Application;
import com.qlvl.pojo.City;
import com.qlvl.pojo.District;
import com.qlvl.pojo.Education;
import com.qlvl.pojo.Employer;
import com.qlvl.pojo.Major;
import com.qlvl.pojo.Typejob;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SetAttribute;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-08-25T16:17:09")
@StaticMetamodel(Job.class)
public class Job_ { 

    public static volatile SingularAttribute<Job, Major> majorID;
    public static volatile SingularAttribute<Job, City> cityID;
    public static volatile SingularAttribute<Job, String> salary;
    public static volatile SingularAttribute<Job, District> districID;
    public static volatile SingularAttribute<Job, String> nameJob;
    public static volatile SingularAttribute<Job, Employer> employerID;
    public static volatile SingularAttribute<Job, Date> createdDate;
    public static volatile SingularAttribute<Job, Education> educationID;
    public static volatile SingularAttribute<Job, Typejob> typeJobID;
    public static volatile SetAttribute<Job, Application> applicationSet;
    public static volatile SingularAttribute<Job, String> avatarJob;
    public static volatile SingularAttribute<Job, Integer> kinhNghiem;
    public static volatile SingularAttribute<Job, Integer> id;
    public static volatile SingularAttribute<Job, Integer> soLuongTuyenDung;
    public static volatile SingularAttribute<Job, Integer> age;

}