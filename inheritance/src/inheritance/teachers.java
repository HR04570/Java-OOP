/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package inheritance;

/**
 *
 * @author hp
 */
public class teachers extends school{
    String subject;
    String section;

    public teachers(String subject, String section, String name, String name1, String address, String phoneno, String principle) {
        super(name, address, phoneno, principle);
        this.subject = subject;
        this.section = section;
        this.name = name1;
    }
    String name;

    @Override
    public String toString() {
        return "teachers{" + "subject=" + subject + ", section=" + section + ", name=" + name + '}';
    }

    public String getSubject() {
        return subject;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public String getSection() {
        return section;
    }

    public void setSection(String section) {
        this.section = section;
    }
    
}
