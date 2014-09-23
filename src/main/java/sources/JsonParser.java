/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

/**
 *
 * @author cemile
 */
public class JsonParser {

    List<Employee> employees_all = new ArrayList<>();
    List<Employee> employees_up_onsekiz = new ArrayList<>();
    List<Employee> employees_down_onsekiz = new ArrayList<>();
    List<Employee> employees_work_state_retry = new ArrayList<>();
    List<Employee> employees_work_state_work = new ArrayList<>();

    //private static final String filePath = "C:\\Users\\katerina\\Desktop\\jsonTestFile.json";
    public List<Employee> getEmployeeAll(String filePath) throws ParseException {

        List<Employee> employees_all = new ArrayList<>();
        List<Employee> employees_up_onsekiz = new ArrayList<>();
        List<Employee> employees_down_onsekiz = new ArrayList<>();
        List<Employee> employees_work_state_retry = new ArrayList<>();
        List<Employee> employees_work_state_work = new ArrayList<>();

        try {

            // read the json file
            FileReader reader = new FileReader(filePath);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            long id;
            String name;
            String job;
            String work_state;
            long age;
            String messages;

            // get an array from the JSON object
            JSONArray employees = (JSONArray) jsonObject.get("employees");

            Iterator i = employees.iterator();

            // take each value from the json array separately
            while (i.hasNext()) {

                JSONObject innerObj = (JSONObject) i.next();
                id = (long) innerObj.get("id");
                name = (String) innerObj.get("name");
                job = (String) innerObj.get("job");
                work_state = (String) innerObj.get("work_state");
                age = (long) innerObj.get("age");
                messages = (String) innerObj.get("messages");

                employees_all.add(new Employee(id, name, job, work_state, age, messages));

                if (age > 18) {

                    employees_up_onsekiz.add(new Employee(id, name, job, work_state, age, messages));
                } else {
                    employees_down_onsekiz.add(new Employee(id, name, job, work_state, age, messages));
                }

                if ("emekli".equals(work_state)) {
                    employees_work_state_retry.add(new Employee(id, name, job, work_state, age, messages));
                } else {
                    employees_work_state_work.add(new Employee(id, name, job, work_state, age, messages));
                }
            }

            setUp18(employees_up_onsekiz);
            setDown18(employees_down_onsekiz);
            setWork_state_retry(employees_work_state_retry);
            setWork_state_work(employees_work_state_work);



        } catch (FileNotFoundException ex) {
            ex.printStackTrace();
        } catch (IOException ex) {
            ex.printStackTrace();
        } catch (ParseException ex) {
            ex.printStackTrace();
        } catch (NullPointerException ex) {
            ex.printStackTrace();
        }


        return employees_all;
    }

    public List<Employee> setUp18(List<Employee> employee) {


        return employee;
    }

    public List<Employee> setDown18(List<Employee> employee) {


        return employee;
    }

    public List<Employee> setWork_state_retry(List<Employee> employee) {


        return employee;
    }

    public List<Employee> setWork_state_work(List<Employee> employee) {


        return employee;
    }

    public List<Employee> getUp18(String filePath) throws FileNotFoundException, IOException, ParseException {
        
         // read the json file
            FileReader reader = new FileReader(filePath);

            JSONParser jsonParser = new JSONParser();
            JSONObject jsonObject = (JSONObject) jsonParser.parse(reader);

            long id;
            String name;
            String job;
            String work_state;
            long age;
            String messages;

            // get an array from the JSON object
            JSONArray employees = (JSONArray) jsonObject.get("employees");

            Iterator i = employees.iterator();

            // take each value from the json array separately
            while (i.hasNext()) {

                JSONObject innerObj = (JSONObject) i.next();
                id = (long) innerObj.get("id");
                name = (String) innerObj.get("name");
                job = (String) innerObj.get("job");
                work_state = (String) innerObj.get("work_state");
                age = (long) innerObj.get("age");
                messages = (String) innerObj.get("messages");

                employees_all.add(new Employee(id, name, job, work_state, age, messages));

                if (age > 18) {

                    employees_up_onsekiz.add(new Employee(id, name, job, work_state, age, messages));
                } else {
                    employees_down_onsekiz.add(new Employee(id, name, job, work_state, age, messages));
                }

            }

            
            
            return employees_up_onsekiz;

   
         
}
    
    
    
    
    
    public List<Employee> getDown18(List<Employee> employee) {


        return employee;
    }

    public List<Employee> getWork_state_retry(List<Employee> employee) {


        return employee;
    }

    public List<Employee> getWork_state_work(List<Employee> employee) {


        return employee;
    }
}