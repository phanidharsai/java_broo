package com.phanidharsai.interviewquestions;

public final class ImmutableClassV2 {
    private final String name;
    private final Integer weight;

    public ImmutableClassV2(String name, Integer weight) {
        this.name = name;
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public Integer getWeight() {
        return weight;
    }

    @Override
    public String toString() {
        return "ImmutableClassV2{" +
                "name='" + name + '\'' +
                ", weight=" + weight +
                '}';
    }
}
