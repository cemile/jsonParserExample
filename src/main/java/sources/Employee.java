/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package sources;

class Employee {

    private long id;
    private String name;
    private String job;
    private String work_state;
    private long age;
    private String messages;

    public Employee(long id, String name, String job, String work_state, long age, String messages) {
        this.id = id;
        this.name = name;
        this.job = job;
        this.work_state = work_state;
        this.age = age;
        this.messages = messages;

       
    }
    
    
     @Override
     public String toString() {
          return "<" + getId() + ", " + getName() + ", " + getJob() + ", " + getAge() + ", "
                                   + getMessages() + ">";
     }

    /**
     * @return the id
     */
    public long getId() {
        return id;
    }

    /**
     * @param id the id to set
     */
    public void setId(long id) {
        this.id = id;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the job
     */
    public String getJob() {
        return job;
    }

    /**
     * @param job the job to set
     */
    public void setJob(String job) {
        this.job = job;
    }

    /**
     * @return the age
     */
    public long getAge() {
        return age;
    }

    /**
     * @param age the age to set
     */
    public void setAge(long age) {
        this.age = age;
    }

    /**
     * @return the messages
     */
    public String getMessages() {
        return messages;
    }

    /**
     * @param messages the messages to set
     */
    public void setMessages(String messages) {
        this.messages = messages;
    }

    /**
     * @return the work_state
     */
    public String getWork_state() {
        return work_state;
    }

    /**
     * @param work_state the work_state to set
     */
    public void setWork_state(String work_state) {
        this.work_state = work_state;
    }
}
