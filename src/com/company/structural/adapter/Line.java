package com.company.structural.adapter;

import java.util.Objects;

public class Line {
    public Point start,end;

    public Line(Point start,Point end){
        this.start=start;
        this.end=end;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Line line = (Line) o;
        if(start!=null?!start.equals(line.start):line.start!=null) return false;
        return end != null ? end.equals(line.end) : line.end==null;
    }

    @Override
    public int hashCode() {
        int result=start!=null?start.hashCode():0;
        result=31*result+(end!=null?end.hashCode():0);
        return result;
    }
}
