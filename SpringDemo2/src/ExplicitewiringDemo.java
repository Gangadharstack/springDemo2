import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import entity.Employee;

public class ExplicitewiringDemo 
{
	public static void main(String[] args)
	{
		Resource resource=new ClassPathResource("SpringConfig.xml");
		BeanFactory factory=new XmlBeanFactory(resource);
		
		entity.Employee employeeBean=(Employee)factory.getBean("empBean");
		
		System.out.println("Employee Id:"+employeeBean.getEmployeeId());
		System.out.println("Employee Name:"+employeeBean.getEmployeeName());
		System.out.println("Houseno:"+employeeBean.getAddr().getHouseno());
		System.out.println("Street Name:"+employeeBean.getAddr().getStreetName());
		System.out.println("City:"+employeeBean.getAddr().getCity());
	}
}
