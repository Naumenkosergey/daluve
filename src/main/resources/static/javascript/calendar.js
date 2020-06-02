$(document).ready(function() {
    var current = null;
    $('div.days').on('click', 'div', function() {
        var id = $(this).attr('id');
        if (id == current) {
            $('#times_' + id).hide();
            current = null;
        } else {
            $('#times_' + current).hide();
            $('#times_' + id).show();
            current = id;
        }
    });
    createTime();
    
        

    });
    //$('div.prev').click(function(para){
   //);
   function RenderDate() {
    dt.setDate(7);
    var day = dt.getDay();
    var endDate = new Date(dt.getFullYear(), dt.getMonth() + 1, 0).getDate();
     var prevDate = new Date(dt.getFullYear(), dt.getMonth(), 0).getDate();
 
     var today = new Date();
    var month = [
     "January", 
     "February",
     "March",
     "April",
     "May",
     "June",
     "July",
     "August",
     "September",
     "October",
     "November",
     "December"];
    
    document.getElementById("date_str").innerHTML = dt.toDateString();
    document.getElementById("month").innerHTML = month[dt.getMonth()];
    var cells = "";
    
     for (x = day; x>0; x-- ) {
        var prevId = 'day_' + dt.getFullYear() + (dt.getMonth() - 1) + (prevDate - x + 1 );
         cells += "<div id='" + prevId + "' class='prev_date'>" + (prevDate - x + 1 )+"</div>";
     }
 
    for (i = 1; i<= endDate; i++) {
        var id = 'day_' + dt.getFullYear() + dt.getMonth() + i;
        if (i == today.getDate() && dt.getMonth() == today.getMonth()  ){
         cells+="<div id='" + id + "' class='today'>" + i + "</div>";
        }
        else{
         cells+="<div id='" + id + "'>" + i + "</div>";
        }
    }
    document.getElementsByClassName("days")[0].innerHTML = cells;
}
var dt = new Date();
function createTime() {
    $('#times div').remove();
    $('div.days div').each(function(i, e) {
        var id = $(this).attr('id');
        var times = $('<div class="hidden">').attr('id', 'times_' + id);
        for (var i = 1; i < 10; i++) {
            var time = $('<div class="talons">').text('1' + i + ':00');
            times.append(time);
        }
        $('#times').append(times);
    });
}
function moveDate(para){
    if(para == 'prev'){
        dt.setMonth(dt.getMonth() - 1);
        
    } else if(para == 'next'){
        dt.setMonth(dt.getMonth() + 1);
        
    }
    RenderDate();
    createTime();
}

