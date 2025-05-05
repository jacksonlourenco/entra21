package exercicios_arrayList.ex01_02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ex01 {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>();

        nums.add(1);
        nums.add(20);
        nums.add(300);
        nums.add(02);
        nums.add(350);
        nums.add(15);
        nums.add(56);
        System.out.println(nums);

        // Ordenar o array - Exercicio 1
        nums.sort(null);
        System.out.println(nums);

        // Crie um Array e inverta-a - Exercicio 2
        nums.sort(Collections.reverseOrder());
        System.out.println(nums);

    }
}
