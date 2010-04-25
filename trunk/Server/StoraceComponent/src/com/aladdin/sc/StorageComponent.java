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

public class StorageComponent {
  public int CreatePatient (Patient patient) {
      Session s = HibernateUtil.getSessionFactory ().openSession ();
      s.beginTransaction ();
      
      s.save (patient);

      s.flush ();
      s.getTransaction ().commit ();
      return 0;
  }
  
  public int CreateS (SystemParameter p) {
     Session s = HibernateUtil.getSessionFactory ().openSession ();
     s.beginTransaction ();
     
     s.save (p);
     
     s.flush ();
     s.getTransaction ().commit ();
  
     return 1;

  }
  
}
