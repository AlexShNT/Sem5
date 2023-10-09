package org.example;

import java.util.Comparator;
import java.util.List;
import java.util.Iterator;

public class StreamGroup implements Iterable<StudyGroup>{

    private List<StudyGroup> streamGroup;

    public StreamGroup(List<StudyGroup> streamGroup) {
        this.streamGroup = streamGroup;
    }

    public void addGroup(StudyGroup studyGroup){
        streamGroup.add(studyGroup);
    }

    public List<StudyGroup> getStreamGroup() {
        return streamGroup;
    }

    public void setStreamGroup(List<StudyGroup> streamGroup) {
        this.streamGroup = streamGroup;
    }

    public int getSize(){
        return this.streamGroup.size();
    }

    public void sortStream(List<StreamGroup> streamGroups){
        streamGroups.sort(new StreamComparator());
    }

    @Override
    public String toString() {
        return "StreamGroup{" +
                "streamGroup=" + streamGroup +
                '}';
    }

    @Override
    public Iterator<StudyGroup> iterator() {
        return new streamGroupIterator(streamGroup);
    }

    private class streamGroupIterator implements Iterator<StudyGroup>{
        private List<StudyGroup> streamGroup;
        private int index;



        public streamGroupIterator(List<StudyGroup> streamGroup) {
            this.streamGroup =streamGroup;
            index = 0;
        }


        @Override
        public boolean hasNext() {
            return index < streamGroup.size();
        }

        @Override
        public StudyGroup next() {
            if (hasNext()){
                return streamGroup.get(index ++);
            }
            return null;
        }
    }

    public static class StreamComparator implements Comparator<StreamGroup> {

        @Override
        public int compare(StreamGroup o1, StreamGroup o2) {
            return (int) (o1.getSize() - o2.getSize());
        }
    }

    public static class StreamSort{
        public void sortStream(List<StreamGroup> streamGroups) {
            streamGroups.sort(new StreamComparator());
        }

    }
}
