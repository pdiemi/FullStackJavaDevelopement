package onetomany;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;  
import javax.persistence.GeneratedValue;  
import javax.persistence.GenerationType;  
import javax.persistence.Id;
import javax.persistence.OneToMany;  
  
@Entity  
public class Employer  
{  
    private Long id;  
    private String employerName;  
    private Set<Employee> employees;  
      
    @Id  
    @GeneratedValue(strategy=GenerationType.AUTO)  
    public Long getId()  
    {  
        return id;  
    }  
    public void setId(Long id)  
    {  
        this.id = id;  
    }  
    public String getEmployerName()  
    {  
        return employerName;  
    }  
    public void setEmployerName(String employerName)  
    {  
        this.employerName = employerName;  
    }  
      
    @OneToMany(cascade=CascadeType.ALL)  
    public Set<Employee> getEmployees()  
    {  
        return employees;  
    }  
    public void setEmployees(Set<Employee> employees)  
    {  
        this.employees = employees;  
    }  
}  