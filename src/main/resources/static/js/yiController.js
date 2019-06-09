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

                    //0创业之星，1就业之星，2就业服务
                    if (this.c_id == 0) {
                        $(function () {
                            $.ajax({
                                type: "get",
                                url: "../CStar",
                                dataType: "json",
                                success: function (data) {
                                    if (data.code == 1) {
                                        var info = data.data;
                                        $(info).each(function (){
                                            var html ='<li>';
                                            html += ' <div class="pic"><img src="../images/Pic21.jpg" /></div>';
                                            html +=    '  <h5>'+this.js_name+'</h5><br>';
                                            html +=    '  <h5>'+this.js_time+'</h5>';
                                            html +=    '</li>';
                                            $(".Honor_list").append($(html))
                                        })
                                    }
                                }
                            })
                        })



                    } else if (this.c_id == 1) {


                    } else if (this.c_id == 2) {

                    }

                })

            }
        }
    })
});