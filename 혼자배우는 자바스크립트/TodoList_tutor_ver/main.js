
//완료
//변수명
let taskInput = document.getElementById("task-input");
let addButton = document.getElementById("add-button");
let taskList = [];
let tabs = document.querySelectorAll('.task-tabs div');
let mode = 'all'; //filter()에서 사용하는 변수
let filterList = [];
let underLine = document.getElementById('under-line');

//작업
    //+버튼 클릭, input창에 입력후 엔터키
addButton.addEventListener("click",addTask);
taskInput.addEventListener("keyup", (event)=>{
    if (event.key === "Enter") {
        addTask();
    }
});
    //3개 탭 클릭해서 task 필터링하기(탭 돌아다니기)
for (let i = 1; i < tabs.length; i++) {
    tabs[i].addEventListener("click", function(event){
        filter(event);
        Indicator(event);
    });
}

//함수
//addTask(): + 버튼 누르면 task블록 추가
function addTask() {
    // task안에 여러 정보가 들어가야 함(task명, 완료여부) -> 객체사용하기!
    let task = {
        id: randomIDGenerate(), //generate random id (구글링으로 코드 가져옴)
        taskContent: taskInput.value,
        isComplete: false, //완료여부
    }
    taskList.push(task); //taskList에 task추가
    filterList.push(task);
    console.log(taskList);
    render();
    taskInput.value='';
}

//render(): 각 task 블록 설정
function render() {
    let list = [];
    if (mode == 'all') {
        list = taskList;
    } else if (mode == 'ongoing' || mode == 'done') {
        list = filterList;
    }
    let resultHTML = '';
    for (let i = 0; i < list.length; i++) {
        if (list[i].isComplete == true) {
            resultHTML += `<div class="task">
            <div class='task-done'>${list[i].taskContent}</div>
            <div>
                <button onclick="toggleComplete('${list[i].id}')">Check</button> <!--이렇게하면 addEventListener 안써도 됨-->
                <button onclick="deleteTask('${list[i].id}')">Delete</button>
            </div>
        </div>`
        } else {
            resultHTML += `<div class="task">
                <div>${list[i].taskContent}</div>
                <div>
                    <button onclick="toggleComplete('${list[i].id}')">Check</button> <!--이렇게하면 addEventListener 안써도 됨-->
                    <button onclick="deleteTask('${list[i].id}')">Delete</button>
                </div>
            </div>`; //``(백틱) 사용해서 감싼것
        }
    }
    document.getElementById("task-board").innerHTML = resultHTML;
}

//체크버튼 누를때 일어나는 일
function toggleComplete(id) {
    for (let i = 0; i < taskList.length; i++) {
        if (taskList[i].id == id) {
            taskList[i].isComplete = !taskList[i].isComplete; // 체크버튼 누를때마다 isComplete 값 바꿈
            for (let j = 0; j < filterList.length; j++) { //필터리스트 업데이트(isComplete변경된 항목 filterlist에서 지움)
                if (filterList[j].id == id) {
                    filterList.splice(j,1);
                }
            }
            break; //for문 종료
        }
    }

    render();
}

//삭제버튼 누를때 일어나는 일
function deleteTask(id) {
    if (mode == 'ongoing' || mode == 'done') {
        for (let i = 0; i < filterList.length; i++) {
            if (filterList[i].id == id) {
                filterList.splice(i, 1);
                break;
            }
        }
    }

    for (let i = 0; i < taskList.length; i++) {
        if (taskList[i].id == id) {
            taskList.splice(i, 1);
            break;
        }
    }
    render();
}

// 각 task의 id 생성하기
function randomIDGenerate() {
    return (Date.now().toString(36) + Math.random().toString(36).substring(2, 5)).toUpperCase();
}

//필터링(탭)하기
function filter(event){
    mode = event.target.id;
    filterList = [];
    if (mode == 'all') {
        render()
    } else if (mode == 'ongoing') {
        for (let i = 0; i < taskList.length; i++) {
            if (taskList[i].isComplete == false) {
                filterList.push(taskList[i]);
            }
        }
        render();
    } else if (mode == 'done') {
        for (let i = 0; i < taskList.length; i++) {
            if (taskList[i].isComplete == true) {
                filterList.push(taskList[i]);
            }
        }
        render();
    }
    
}

//탭 언더라인 움직이게
function Indicator(e) {
    underLine.style.left = e.currentTarget.offsetLeft + 'px';
    underLine.style.width = e.currentTarget.offsetWidth + 'px';
    underLine.style.top = 
        e.currentTarget.offsetTop + e.currentTarget.offsetHeight + 'px';
}
