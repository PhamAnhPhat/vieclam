package com.qlvl.pojo;

import com.qlvl.pojo.Job;
import com.qlvl.pojo.User;
import java.util.Date;
import javax.annotation.Generated;
import javax.persistence.metamodel.SingularAttribute;
import javax.persistence.metamodel.StaticMetamodel;

@Generated(value="EclipseLink-2.7.10.v20211216-rNA", date="2023-10-09T11:11:45")
@StaticMetamodel(Application.class)
public class Application_ { 

    public static volatile SingularAttribute<Application, String> sdt;
    public static volatile SingularAttribute<Application, Integer> namKinhNghiem;
    public static volatile SingularAttribute<Application, String> ngheNghiep;
    public static volatile SingularAttribute<Application, String> fileCV;
    public static volatile SingularAttribute<Application, String> ho;
    public static volatile SingularAttribute<Application, Integer> tuoi;
    public static volatile SingularAttribute<Application, User> userID;
    public static volatile SingularAttribute<Application, Job> jobID;
    public static volatile SingularAttribute<Application, String> addressUser;
    public static volatile SingularAttribute<Application, String> trinhDoHocVan;
    public static volatile SingularAttribute<Application, Integer> id;
    public static volatile SingularAttribute<Application, String> ten;
    public static volatile SingularAttribute<Application, String> email;
    public static volatile SingularAttribute<Application, Date> createDate;

}