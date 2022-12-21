package service;

import enams.Color;
import flowers.Flower;
import flowers.Roz;
import flowers.Tulyp;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RozServiceImpl implements FlowerService<Roz>{
    private List<Roz> rozs = new ArrayList<>() ;
    @Override
    public String addFlowers(List<Roz> t) {
        this.rozs.addAll(t);
        return "Successfully Added !";
    }

    @Override
    public List<Roz> getAllFlowers() {
        return rozs;
    }

    @Override
    public List<Roz> getFlowersFinByColor(String color) {
        return rozs.stream().filter(x->x.getColor().name().equals(color)).toList();
    }

    @Override
    public Map<Color, List<Roz>> groupingFlowersByColor() {
        Map<Color, List<Roz>> map = rozs.stream().collect(Collectors.groupingBy(Flower::getColor));
        return map;
    }

    @Override
    public List<Integer> getSumAllFlowers() {
        return Collections.singletonList(rozs.stream().mapToInt(x -> x.getPrice().intValue()).sum());
    }

    @Override
    public List<Roz> getAllFlowersSortByPrice(String ascendingOrDescending) {
        switch (ascendingOrDescending) {
            case "ascending"->  {  List<Roz> list = rozs.stream().sorted(Comparator.comparing(x -> x.getPrice().intValue())).toList();
                return list;}
            case "descending"->{
                List<Roz> list = rozs.stream().sorted(Comparator.comparing(Flower::getPrice).reversed()).toList();
                return list;}
        }
        return null;
    }
}
