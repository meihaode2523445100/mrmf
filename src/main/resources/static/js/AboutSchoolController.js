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
                    html +=    '<a href="javascript:loadAboutSchool('+this.id+');">'+ this.c_name+'</a>';
                    html +=    '</li>';
                    $("#sc1,#sc2,#aboutSchool").append($(html));
                    loadschoolpro();
                })

            }
        }
    })
});

function loadschoolpro() {
    $(function () {
        $.ajax({
            type: "get",
            url: "../schoolProfile",
            dataType: "json",
            success: function (data) {
                if (data.code == 1) {
                    var info = data.data;
                    $(".MainContent").empty();
                    $(info).each(function (){
                        var html = ' <p style="padding-bottom:20px;"><img src="../images/Pic20.jpg" /></p>';
                        html +=    '  <p style="font-size:14px;">'+this.sp_introduction+'</p><br>';
                        $(".MainContent").append($(html))
                    })
                }
            }
        })
    });

}

function loadAboutSchool(id) {
    //1学校简介,2校长致辞,3学校环境,4学校荣誉,5学校快讯
    switch (id) {
        case 1:
            loadschoolpro();
            break;
        case 2:
            $(function () {
                $.ajax({
                    type: "get",
                    url: "../schoolMaster",
                    dataType: "json",
                    success: function (data) {
                        if (data.code == 1) {
                            var info = data.data;
                            $(".MainContent").empty();
                            $(info).each(function (){
                                var html = ' <p style="padding-bottom:20px;"><img src="../images/Pic20.jpg" /></p>';
                                html +=    '  <p style="font-size:14px;">'+this.sp_introduction+'</p><br>';
                                $(".MainContent").append($(html))
                            })
                        }
                    }
                })
            });
            break;
        case 3:
            break;
        case 4:
            break;
        case 5:
            break;


    }
}

