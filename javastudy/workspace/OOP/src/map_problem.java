import java.util.*;
public class map_problem {
    public static void main(String[] args) {
        //옷과 종류 (안경, 상의, 하의, 겉옷)이 주어짐
        //옷을 조합하여 입을 수 있는 조합의 수를 구하여라
        //옷은 반드시 하나는 입어야 함 - 안, 상, 하, 겉 중 적어도 하나 이상만 입으면 됨
        //입력: 옷 5개를 받는 것으로 한다.
        //옷은 중복되어 입력되지 않음
        Scanner sc = new Scanner(System.in);
        Map<String, Integer> map = new HashMap<>();
        for (int i = 0; i < 5; i++) {
            System.out.println("종류를 입력하세요(안경, 상의, 하의, 겉옷):");
            String category = sc.nextLine();
            int value = map.containsKey(category) ? map.get(category) + 1 : 1;
            map.put(category, value);
            System.out.println("이름을 입력하세요:");
            sc.nextLine();
        }

        int result = 1;

        Set set = map.keySet();
        Iterator<String> it = set.iterator();

        while(it.hasNext()) {
            result *= (map.get(it.next()) + 1);
        }
        result--;
        System.out.println(result);


    }
}
