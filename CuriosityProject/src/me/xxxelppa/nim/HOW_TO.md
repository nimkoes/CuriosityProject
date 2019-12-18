### nim 게임 필승 전략
***

##### nim 게임 규칙
* Nim is a mathematical game of strategy in which two players take turns removing (i.e., nimming) objects from distinct heaps or piles. On each turn, a player must remove at least one object, and may remove any number of objects provided they all come from the same heap/pile. Depending on the version being played, the goal of the game is either to avoid taking the last object, or to take the last object.

* 님(Nim)은 수학적 전략 보드 게임이다. 몇개의 줄에 숫자나 자연수개의 돌을 두고 순서대로 돌아가면서 한 줄에서 정해진 수의 숫자를 제거한다. 가져오는 숫자에는 상한이 있으며 무조건 1개는 가져와야 한다. 마지막 돌을 가져오는 사람이 이기거나 진다.

* 마지막 숫자를 부르는 사람이 지는 것으로 간주한다.
***

##### input
1. 타겟 숫자
2. 한 번에 부를 수 있는 수
* 공백으로 구분하여 한번에 입력 받는다.
	
    sample input 1
    31 3
    
    sample input 2
    31 4
    

##### output
1. 선공 후공 여부 (F/L)
2. n번재 불러야 할 숫자

***
##### sample
* case 1
	31 3
	F
    2
    6
    10
    14
    18
    22
    26
    30
    
* case 2
	31 4
    L
    5
    10
    15
    20
    25
    30
