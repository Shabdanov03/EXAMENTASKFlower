package service;

import enams.Color;
import flowers.Cornation;
import flowers.Flower;
import flowers.Tulyp;

import java.util.*;
import java.util.stream.Collectors;

public class CarnationServiceImpl implements FlowerService<Cornation> {
    private List<Cornation> cornations = new ArrayList<>();

    public List<Cornation> getCornations() {
        return cornations;
    }

    public void setCornations(List<Cornation> cornations) {
        this.cornations = cornations;
    }

    @Override
    public String addFlowers(List<Cornation> t) {
        this.cornations.addAll(t);
        return "Successfully Added ! ";
    }

    @Override
    public List<Cornation> getAllFlowers() {
        return cornations;
    }

    @Override
    public List<Cornation> getFlowersFinByColor(String color) {
        try {
            return cornations.stream().filter(x -> x.getColor().name().equals(color)).toList();
        }catch (Exception e){
            e.getStackTrace();
        }
        return null;
    }

    @Override
    public Map<Color, List<Cornation>> groupingFlowersByColor() {
        try {
            return cornations.stream().collect(Collectors.groupingBy(Flower::getColor));
        }catch (Exception e){
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
        return null;
    }

    @Override
    public List<Integer> getSumAllFlowers() {
        return Collections.singletonList(cornations.stream().mapToInt(x -> x.getPrice().intValue()).sum());
    }

    @Override
    public List<Cornation> getAllFlowersSortByPrice(String ascendingOrDescending) {
        switch (ascendingOrDescending) {
            case "ascending" -> {
                List<Cornation> list = cornations.stream().sorted(Comparator.comparing(x -> x.getPrice().intValue())).toList();
                return list;
            }
            case "descending"->{
                List<Cornation> list = cornations.stream().sorted(Comparator.comparing(Flower::getPrice).reversed()).toList();
                return list;}
        }
        return null;
    }
}
