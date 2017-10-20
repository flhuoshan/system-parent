<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>积分查询页面</title>
    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">
    <link href="/bootstrap/plugins/dataTables/css/dataTables.bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <!--<script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>-->
    <!--<script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>-->
    <![endif]-->
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">设置查询条件</h3>
    </div>
    <div class="panel-body">
        <form id="jifenDetailForm" class="form-horizontal" >
            <div class="form-group">
                <label for="name" class="control-label col-md-2">账号</label>
                <div class="col-md-3"><input type="text" class="form-control" id="name" name="account_no"></div>
                <label for="process_status" class="control-label col-md-2">处理状态</label>
                <div class="col-md-3">
                    <select class="form-control" name="process_status" id="process_status">
                        <option value="" selected="selected">所有</option>
                        <option value="0">未处理</option>
                        <option value="1">已处理</option>
                    </select>
                </div>
            </div>
            <div class="form-group">
                <div class="col-md-offset-7 col-md-5"><button id="jifenDetailQueryBtn" type="button" class="btn btn-default ">查询</button></div>

            </div>
        </form>
    </div>
</div>

<div class="panel panel-default">
    <div class="panel-heading">
        <h3 class="panel-title">积分数据</h3>
    </div>
    <div class="panel-body">
            <table id="jifenDetailTable" class="table table-bordered table-striped table-hover" cellspacing="0" width="100%">
                <thead>
                <tr>
                    <th>流水号</th>
                    <th>账户号</th>
                    <th>交易金额</th>
                    <th>交易积分</th>
                    <th>交易时间</th>
                </tr>
                </thead>
                <tfoot>
                <tr>
                    <th>流水号</th>
                    <th>账户号</th>
                    <th>交易金额</th>
                    <th>交易积分</th>
                    <th>交易时间</th>
                </tr>
                </tfoot>
            </table>


    </div>
</div>
</body>
<script src="/js/jquery/jquery-2.2.4.min.js"></script>
<script src="/bootstrap/js/bootstrap.min.js"></script>
<script src="/bootstrap/plugins/dataTables/js/jquery.dataTables.min.js"></script>
<script src="/bootstrap/plugins/dataTables/js/dataTables.bootstrap.min.js"></script>
<script type="text/javascript">
    $(document).ready(function() {
        $('#jifenDetailTable').DataTable({
            "processing" : true,
            "serverSide" : false,
            "paging" : true,
            "searching" :true,
            "language": {
                "lengthMenu": '<select class="form-control input-xsmall">' + '<option value="1">1</option>' + '<option value="10">10</option>' + '<option value="20">20</option>' + '<option value="30">30</option>' + '<option value="40">40</option>' + '<option value="50">50</option>' + '</select>条记录',//左上角的分页大小显示。
                "search": '<span class="label label-success">搜索：</span>',//右上角的搜索文本，可以写html标签
                "paginate": {//分页的样式内容。
                    "previous": "上一页",
                    "next": "下一页",
                    "first": "第一页",
                    "last": "最后"
                },
                "zeroRecords": "没有内容",//table tbody内容为空时，tbody的内容。
                //下面三者构成了总体的左下角的内容。
                "info": "总共_PAGES_ 页，显示第_START_ 到第 _END_ ，筛选之后得到 _TOTAL_ 条，初始_MAX_ 条 ",//左下角的信息显示，大写的词为关键字。
                "infoEmpty": "0条记录",//筛选为空时左下角的显示。
                "infoFiltered": ""//筛选之后的左下角筛选提示，
            },
            "pagingType": "full_numbers",//分页样式的类型
            "ajax": {
                "url" : "/demo2/detail",
                "method" : "GET",
                "data" : function(d){
                    var param = {};
                    var formData = $("#jifenDetailForm").serializeArray();
                    formData.forEach(function(e){
                        param[e.name] = e.value;
                    });
                    return param;
                },
                "dataFilter" : function(data){
                    var json = $.parseJSON(data);
                    json.data = json.body.body;
                    return JSON.stringify(json);
                }
            },
            "columns": [
                { "data": "sWaterNo" },
                { "data": "accountNo" },
                { "data": "tradeAmount" },
                { "data": "tradeJifen" },
                { "data": "tradeTime" }
            ]
        } );


    } );

    $(document).on("click", "#jifenDetailQueryBtn", function(){
        $("#jifenDetailTable").DataTable().ajax.reload();
    });

</script>




</html>