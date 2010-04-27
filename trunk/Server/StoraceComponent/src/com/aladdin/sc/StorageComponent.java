package com.aladdin.sc;

import java.util.List;
import java.util.Iterator;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import java.util.HashSet;
import java.util.Set;
import com.aladdin.xsd.*;
//import org.apache.axis2.description.AxisService;
//import org.apache.axis2.context.MessageContext;
//import java.net.URL;

import org.apache.log4j.Logger;
import org.apache.log4j.BasicConfigurator;


public class StorageComponent {

static Logger logger = Logger.getLogger(StorageComponent.class);

  public java.lang.Integer CreatePatient (Patient patient) {
      Session s = HibernateUtil.getSessionFactory ().openSession ();
      s.beginTransaction ();
      
     BasicConfigurator.configure();
     logger.warn (patient.getM_SocioDemographicData().getAge());

//      s.save (patient);

      s.flush ();
      s.getTransaction ().commit ();
      return 0;
  }
  
  public java.lang.Integer mtest (java.lang.Integer a) { return a * 2; }
  
  public int CreateS (com.aladdin.xsd.SystemParameter p) {
     Session s = HibernateUtil.getSessionFactory ().openSession ();
     s.beginTransaction ();
     
     BasicConfigurator.configure();
     logger.warn (p.getCode());
     logger.warn (p.getDescription().toString ());
     
     
     s.save (p);
     
     s.flush ();
     s.getTransaction ().commit ();
  
     return 1;

  }
  
}
