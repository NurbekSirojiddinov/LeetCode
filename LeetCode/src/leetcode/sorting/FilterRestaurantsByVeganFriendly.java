package leetcode.sorting;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FilterRestaurantsByVeganFriendly {
    public static List<Integer> filterRestaurants(int[][] restaurants, int veganFriendly, int maxPrice, int maxDistance) {
        List<RatingAndId> list = new ArrayList<>();

        for (int[] restaurant : restaurants) {
            if (restaurant[2] == 1) {
                if (restaurant[2] == veganFriendly && restaurant[3] <= maxPrice && restaurant[4] <= maxDistance) {
                    list.add(new RatingAndId(restaurant[0], restaurant[1]));
                }
            } else if (restaurant[3] <= maxPrice && restaurant[4] <= maxDistance) {
                list.add(new RatingAndId(restaurant[0], restaurant[1]));
            }
        }
        list.sort(Comparator.comparing(RatingAndId::getRating).thenComparing(RatingAndId::getId).reversed());
        return list.stream().map(RatingAndId::getId).toList();
    }

    public static void main(String[] args) {
        System.out.println(filterRestaurants(new int[][]{{1, 4, 1, 4, 5}}, 1, 10, 10));
    }
}

class RatingAndId {
    int id;
    int rating;

    public RatingAndId(int id, int rating) {
        this.id = id;
        this.rating = rating;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    @Override
    public String toString() {
        return "RatingAndId{" +
                "id=" + id +
                ", rating=" + rating +
                '}';
    }
}
