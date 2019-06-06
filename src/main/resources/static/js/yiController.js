$(function () {
    $.ajax({
        type:"get",
        url:"../aboutSchool",
        dataType:"json",
        success:function(data) {
            if (data.code == 1) {
                var info = data.data;
                $(info).each(function (){
                    var html = '<li>';
                    html +=    '<a href="'+this.c_url+'">'+ this.c_name+'</a>';
                    html +=    '</li>';
                    $("#sc1,#sc2,#aboutSchool").append($(html))
                })

            }
        }
    })
});

$(function () {
    $.ajax({
        type:"get",
        url:"../job",
        dataType:"json",
        success:function(data) {
            if (data.code == 1) {
                var info = data.data;
                $(info).each(function (){
                    var html = '<li>';
                    html +=    '<a href="'+this.c_url+'">'+this.c_name+'</a>';
                    html +=    '</li>';
                    $("#js1,#js2").append($(html))
                })

            }
        }
    })
});