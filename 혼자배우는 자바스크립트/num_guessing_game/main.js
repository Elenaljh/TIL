//변수칸
let randomNum = MakeRandomNum(); //랜덤숫자
let input = document.getElementById('user-input'); //input 연결
let goButton = document.getElementById('go-button'); //go 연결
let resetButton = document.getElementById('reset-button'); //reset 연결
let chanceArea = document.getElementById('chance-area'); //chance-area 연결
let directionArea = document.getElementById('direction-area'); //direction-area 연결
let chance = 5;
let history = [];


//기능구현
goButton.addEventListener('click', go); //go 클릭하면 go함수 실행
resetButton.addEventListener('click', reset) //reset 클릭하면 reset함수 실행
input.addEventListener('focus',function(){input.value=''}); //입력창에 focus두면 입력창이 빈칸이 됨

//함수칸
//MakeRandomNum(): 랜덤숫자만들기
function MakeRandomNum() {
    let num = Math.floor(Math.random()*100)+1;
    console.log('정답:', num);
    return num;
}

//go()
function go() {
    let inputNum = input.value; //이거 주의하자!!
    console.log(inputNum);
    //유효성검사
    if (inputNum < 1 || inputNum > 100) {
        directionArea.textContent = '1~100 입력하세요';
        return 1;
    } else if (history.includes(inputNum)) {
        directionArea.textContent = '이미 입력했던 숫자입니다';
        return 1;
    } 
    //게임진행
    if (inputNum < randomNum) {
        directionArea.textContent = 'UP';
        chance--;
        chanceArea.textContent = `chances: ${chance}`
        history.push(inputNum)
    } else if (inputNum > randomNum) {
        directionArea.textContent = 'DOWN';
        chance--;
        chanceArea.textContent = `chances: ${chance}`
        history.push(inputNum)
    } else if (inputNum == randomNum) {
        directionArea.textContent = 'Correct!';
        chanceArea.textContent = 'Congratulation!';
        goButton.disabled = true;
        return 0
    }
    // chance: 1 -> 0
    if (chance == 0) {
        goButton.disabled = true;
        directionArea.textContent = '기회를 모두 사용했습니다';
    }
}

//reset()
function reset() {
    inputNum = null;
    goButton.disabled = false;
    randomNum = MakeRandomNum();
    chance = 5;
    history =[];
    directionArea.textContent = '숫자를 입력하세요';
    chanceArea.textContent = 'chances: 5';
    input.value = '';
}
    
