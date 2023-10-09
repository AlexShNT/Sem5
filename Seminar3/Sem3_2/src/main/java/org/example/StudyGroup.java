package org.example;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class StudyGroup implements Iterable<Student> {
    
    protected List<Student> stdGroup;

    public StudyGroup(List<Student> stdGroup) {
        this.stdGroup = stdGroup;
    }

    
    public void addStudent(Student student){
        this.stdGroup.add(student);
    }

    @Override
    public String toString() {
        return "StudyGroup{" +
                "stdGroup=" + this.stdGroup +
                '}';
    }

    public Iterator<Student> iterator(){
        return new  StudyGroupIterator(stdGroup);
    }

    public static class StudyGroupIterator implements Iterator<Student>{

        private List<Student> stdGroup;
        private int index;

        public StudyGroupIterator(List<Student> stdGroup) {
            this.stdGroup = stdGroup;
            this.index = 0;
        }

        @Override
        public boolean hasNext() {
            return index < stdGroup.size();
        }

        @Override
        public Student next() {
            if (hasNext()){
                Student tmp = stdGroup.get(index);
                index ++;
                return tmp;
            } else
                return null;
        }

        @Override
        public void remove() {
            stdGroup.remove(index-1);
            index --;
        }
    }

}
