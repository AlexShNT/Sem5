package org.example;

import java.util.*;

import static java.util.Arrays.asList;

public class Main {
    public static void main(String[] args) {

        Student std1 = new Student("Vasay", 21);
        Student std2 = new Student("Masha", 20);
        Student std3 = new Student("Petay", 22);
        Student std4 = new Student("Olay", 20);
        Student std5 = new Student("Kolay", 23);
        Student std6 = new Student("Misha", 22);

        System.out.println(std1);

        System.out.println("_".repeat(30));

        List<Student> stdGroup1 = new ArrayList<>(asList(std1, std2, std3, std4, std5));
        List<Student> stdGroup2 = new ArrayList<>(asList(std1, std2, std3, std4, std5, std6));
        List<Student> stdGroup3 = new ArrayList<>(asList(std1, std3, std4, std5, std6));

        for (Student st: stdGroup1) {
            System.out.println(st);
        }


        StudyGroup.StudyGroupIterator studyGroupIterator = new StudyGroup.StudyGroupIterator(stdGroup1);

        while (studyGroupIterator.hasNext()) {
            Student student = studyGroupIterator.next();
            if (student.getName().equals("Masha")) {
                studyGroupIterator.remove();
            }
        }

        System.out.println(stdGroup1);

        StudyGroup studyGroup1 = new StudyGroup(asList(std1, std2, std3, std4, std5));
        StreamGroup streamGroups1 = new StreamGroup(Collections.singletonList(studyGroup1));


        StudyGroup studyGroup2 = new StudyGroup(stdGroup2);
        StreamGroup streamGroups2 = new StreamGroup(Collections.singletonList(studyGroup2));

        List<StreamGroup> streamGroups = new ArrayList<>();
        streamGroups.add(streamGroups1);
        streamGroups.add(streamGroups2);

        System.out.println(streamGroups);

        StreamGroup.StreamSort streamSort = new StreamGroup.StreamSort();
        streamSort.sortStream(streamGroups);

        System.out.println("Отсортированный список потоков:");
        for (StreamGroup group : streamGroups) {
            System.out.println(group);
        }
    }
}