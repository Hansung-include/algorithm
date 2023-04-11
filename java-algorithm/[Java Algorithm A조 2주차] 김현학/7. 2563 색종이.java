//
// #2563 - 색종이
// 작성자: 김현학
// 작성일자: 2023-03-26
//
// 문제 - https://www.acmicpc.net/problem/2563
// 가로, 세로의 크기가 각각 100인 정사각형 모양의 흰색 도화지가 있다.
// 이 도화지 위에 가로, 세로의 크기가 각각 10인 정사각형 모양의 검은색 색종이를 색종이의 변과 도화지의 변이 평행하도록 붙인다.
// 이러한 방식으로 색종이를 한 장 또는 여러 장 붙인 후 색종이가 붙은 검은 영역의 넓이를 구하는 프로그램을 작성하시오.
// 예를 들어 흰색 도화지 위에 세 장의 검은색 색종이를 그림과 같은 모양으로 붙였다면 검은색 영역의 넓이는 260이 된다.
//
// 입력
// 첫째 줄에 색종이의 수가 주어진다.
// 둘째 줄부터 한 줄에 하나씩 색종이를 붙인 위치가 주어진다.
// 색종이를 붙인 위치는 두 개의 자연수로 주어지는데
// 첫 번째 자연수는 색종이의 왼쪽 변과 도화지의 왼쪽 변 사이의 거리이고,
// 두 번째 자연수는 색종이의 아래쪽 변과 도화지의 아래쪽 변 사이의 거리이다.
// 색종이의 수는 100 이하이며, 색종이가 도화지 밖으로 나가는 경우는 없다
//
// 출력
// 첫째 줄에 색종이가 붙은 검은 영역의 넓이를 출력한다.
//

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> coordinates = new ArrayList<Integer>();
        while (sc.hasNext())
            for (int n : Arrays.stream(sc.nextLine().split(System.lineSeparator().toString() + "| ")).mapToInt(Integer::parseInt).toArray()
            ) coordinates.add(n);

        int[][] map = new int[100][100];
        for (int[] x : map) Arrays.fill(x, 0);
        sc.close();

        for (int i = 1; i <= coordinates.get(0); ++i) {
            int x_from = coordinates.get(i * 2 - 1), y_from = coordinates.get(i * 2);
            for (int x = x_from; x < x_from + 10; ++x)
                for (int y = y_from; y < y_from + 10; ++y)
                    map[x][y] = 1;
        }
        int sum = 0;
        for (int[] m : map) sum += Arrays.stream(m).sum();
        System.out.println(sum);
    }
}
