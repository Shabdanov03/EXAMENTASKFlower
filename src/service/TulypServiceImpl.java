package service;

import enams.Color;
import flowers.Flower;
import flowers.Tulyp;

import java.util.*;
import java.util.stream.Collectors;

public class TulypServiceImpl implements FlowerService<Tulyp>{
    List<Tulyp> tulyps  = new ArrayList<>();

    @Override
    public String addFlowers(List<Tulyp> t) {
        this.tulyps.addAll(t);
        return "Successfully Added ! ";
    }

    @Override
    public List<Tulyp> getAllFlowers() {
        return tulyps;
    }

    @Override
    public List<Tulyp> getFlowersFinByColor(String color) {
        return tulyps.stream().filter(x->x.getColor().name().equals(color)).toList();
    }

    @Override
    public Map<Color, List<Tulyp>> groupingFlowersByColor() {
        Map<Color, List<Tulyp>> map = tulyps.stream().collect(Collectors.groupingBy(Flower::getColor));
        return map;
    }

    @Override
    public List<Integer> getSumAllFlowers() {
     return Collections.singletonList(tulyps.stream().mapToInt(x -> x.getPrice().intValue()).sum());
    }

    @Override
    public List<Tulyp> getAllFlowersSortByPrice(String ascendingOrDescending) {
        switch (ascendingOrDescending) {
        case "ascending"->  {  List<Tulyp> list = tulyps.stream().sorted(Comparator.comparing(x -> x.getPrice().intValue())).toList();
            return list;}
            case "descending"->{
            List<Tulyp> list = tulyps.stream().sorted(Comparator.comparing(Flower::getPrice).reversed()).toList();
            return list;}
        }
        return null;
    }
}
