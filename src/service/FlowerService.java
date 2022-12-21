package service;

import enams.Color;

import java.util.List;
import java.util.Map;

public interface FlowerService <T> {
    String addFlowers(List<T> t);
    List<T> getAllFlowers();
    List<T> getFlowersFinByColor(String color);
    Map<Color, List<T>> groupingFlowersByColor();
    List<Integer> getSumAllFlowers();
    List<T> getAllFlowersSortByPrice(String ascendingOrDescending);

}
