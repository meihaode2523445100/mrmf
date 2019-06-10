$(function () {
    $.ajax({
        type:"get",
        url:"../productionType/all.do",
        dataType:"json",
        success:function(data) {
            if (data.code == 1) {
                var info = data.data;
                $(info).each(function (){
                    var html = '<li>';
                    html +=    '<a href="'+this.pr_type_url+'">'+ this.pr_type+'</a>';
                    html +=    '</li>';
                    $("#sc1,#sc2,#aboutProduct,#aboutProduct1").append($(html))
                })

            }
        }
    })
});
