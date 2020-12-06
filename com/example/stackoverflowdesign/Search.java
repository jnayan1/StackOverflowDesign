package com.example.stackoverflowdesign;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public interface Search {
    public static List<Question> search(String query) {
        List<Question> searchResult = new List<Question>() {
            @Override
            public int size() {
                return 0;
            }

            @Override
            public boolean isEmpty() {
                return false;
            }

            @Override
            public boolean contains(Object o) {
                return false;
            }

            @Override
            public Iterator<Question> iterator() {
                return null;
            }

            @Override
            public Object[] toArray() {
                return new Object[0];
            }

            @Override
            public <T> T[] toArray(T[] a) {
                return null;
            }

            @Override
            public boolean add(Question question) {
                return false;
            }

            @Override
            public boolean remove(Object o) {
                return false;
            }

            @Override
            public boolean containsAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean addAll(Collection<? extends Question> c) {
                return false;
            }

            @Override
            public boolean addAll(int index, Collection<? extends Question> c) {
                return false;
            }

            @Override
            public boolean removeAll(Collection<?> c) {
                return false;
            }

            @Override
            public boolean retainAll(Collection<?> c) {
                return false;
            }

            @Override
            public void clear() {

            }

            @Override
            public Question get(int index) {
                return null;
            }

            @Override
            public Question set(int index, Question element) {
                return null;
            }

            @Override
            public void add(int index, Question element) {

            }

            @Override
            public Question remove(int index) {
                return null;
            }

            @Override
            public int indexOf(Object o) {
                return 0;
            }

            @Override
            public int lastIndexOf(Object o) {
                return 0;
            }

            @Override
            public ListIterator<Question> listIterator() {
                return null;
            }

            @Override
            public ListIterator<Question> listIterator(int index) {
                return null;
            }

            @Override
            public List<Question> subList(int fromIndex, int toIndex) {
                return null;
            }
        };
        return searchResult;
    }
}
