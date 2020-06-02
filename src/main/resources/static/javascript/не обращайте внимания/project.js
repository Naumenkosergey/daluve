class Queue{
constructor (){this._data = [];}
enqueue(v) {this._data.push(v);}
dequeue() {return this._data.shift();}
front(){return this._data[0]}
rear(){return this._data[this._data.length-1]}
isEmpty(){return this._data.length==0}
size(){return this._data.length}
clear(){return this._data=[]}
show(){return this._data.join(" ")}

}
var q= new Queue ();
var n = 0;
function add(){
    n++;
    q.enqueue(n);
    updatePage();
}
function updatePage() {
    var number = document.getElementById('number');
    console.log(n )
    number.innerText = n;
}

