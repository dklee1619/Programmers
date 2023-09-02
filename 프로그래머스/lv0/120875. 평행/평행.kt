class Solution {
    fun solution(dots: Array<IntArray>): Int {
        var answer: Int = 0
        var xArray: IntArray = IntArray(dots.size)
        var yArray: IntArray = IntArray(dots.size)
        var count = 0
        for (a in 0..3) {
            xArray[a] = dots[a][0].toInt()
            yArray[a] = dots[a][1].toInt()
        } // 1차원 배열화 2개로 나누기 완료
        for (b in 0..0) {
            var c = if (b + 1 >= 4) {
                b + 1 - 3
            } else {
                b + 1
            }
            var d = if (b + 2 >= 4) {
                b + 2 - 3
            } else {
                b + 2
            }
            var e = if (b + 3 >= 4) {
                b + 3 - 3
            } else {
                b + 3
            }
            if (answer == 1) {
                break
            }
            if (((yArray[b] - yArray[c]) * (xArray[d] - xArray[e]) == (yArray[d] - yArray[e]) * (xArray[b] - xArray[c])) && ((yArray[b] - yArray[c]) != 0)) {
                answer = 1
            } else if (((yArray[b] - yArray[d]) * (xArray[c] - xArray[e]) == (yArray[c] - yArray[e]) * (xArray[b] - xArray[d])) && ((yArray[b] - yArray[d]) != 0)) {
                answer = 1
            } else if (((yArray[b] - yArray[e]) * (xArray[d] - xArray[c]) == (yArray[d] - yArray[c]) * (xArray[b] - xArray[e])) && ((yArray[b] - yArray[e]) != 0)) {
                answer = 1
            }

        }
        // 12 34 , 23 41 , 34 12 , 41 23
        // 13 24 , 24 31 , 31 42 , 42 13
        // 14 23 , 21 34 , 32 41 , 43 12 반만해도 된다
        return answer
    }
}

// 1. 평행의 조건은? 기울기가 같음 => 
// (y2 - y1) / (x2 - x1) == (y4 - y3) / (x4 - x3)
// 2. 한번 검사한 배열은 검사 안하게끔
// 3. 내가 다룰수있는 배열로 만들기 위해 2차원배열 -> 1차원 배열화
// 4. for 2번으로 기울기를 기울기배열에 저장하고
// 5. 기울기배열에서 for 2번이용해서 동일한 경우가 있는지 확인한다.
// 6. 근데 이제 x가 겹치거나 x,y모두 겹치는 경우 때문에 에러가 뜸
// 7. 배열의 원소크기나 for의 범위 조절 실수를 해결
// 8. 그래도 문제가 발생함. 어떤 문제가 있을까.
// 9. 아..  for(j in (i+1)..count-1) 이거  for(j in i..count-1) 로 했다. 그럼 무조건 같지.
// 10. 근데 이거해도 문제 발생. 음 아무래도 몫으로 해서, 그런듯?
// 11. 소수 생각안하니까. 그래서 100을곱하니까 41.2에서 64.7로 올르긴함.
// 12. 아예 더확실하게하려고 Double로해도 64.7 그대로
// 13. 또 뭐가 문제가 되는게 있을까? 0이 문제가 되지않을까?
// 14. y2-y1가 0이 되는 경우가 2개이상면 그거도 일치한다고 뜨고
// 15. x2-x1이 0이 되는 경우가 있으면 분모에 문제가 될꺼. 이걸 해결해보자.
// 16. 근데 생각해보니까 14,15는 제한사항의 x축또는y축과 평행한경우 없다했으니 생각안해도됨.
// 17. 그러면 기울기가 1,-1 이렇게있어서 서로 교차하는걸 잘못구해서 같다고 되면서 평행하다고 하는게 떠오르는데..
// 18. x,y축과 평행한건 주어지지않지만 x,y축과 겹치는건 존재할수있지 않을까. 이걸 생각해보자.
// 19. 그래서 y2-y1 x2-x1 모두 0이아니여야 기울기 계산할 수 있도록 해줫는데 안됨.
// 20. 직접 그려보니까 느낀게 만약 4개의 점을 2개씩 이어서 평행이 되는경우가 있다면
// 20. 두 기울기의 곱이 -1이됨.
// 21. 나누기 말고 다른방식으로 해보자.

// 22. (y2-y1) / (x2 - x1) = (y4 - y3) / (x4 - x3) 으로부터
// 23. (y2-y1) * (x4-x3) = (y4 - y3) * (x2-x1) 을 얻을수 있음. 나눗셈 말고 곱셈으로 해보자
// 24. 이러면 기울기 하나하나를 저장할 수 없어서 수식 변경이 불가피함.
// 25. 구현후에 직접 나열해보니 인덱스 반으로 만줄여도 되고,
// 26. 기울기가 0이되면 안되므로 != 0 을 추가해줌
// 27. 그래도 오류발생 .. 뭐가 또 문제일까?




