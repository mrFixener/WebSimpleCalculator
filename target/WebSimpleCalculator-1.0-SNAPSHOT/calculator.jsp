<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <link rel="stylesheet" href="resources/css/bootstrap.min.css">
        <link rel="stylesheet" href="resources/css/font-awesome.min.css">
        <link rel="stylesheet" href="resources/css/style.css">
        <script type="text/javascript" src="resources/js/app/app.js"></script>
        <title>Калькулятор</title>
    </head>
    <body>
        <div class="container">
            <div class="col-md-6 col-md-offset-3"> 
                <form>
            <div class="form-group">
                <label for="input1">Значение 1</label>
                <input type="number" class="form-control" id="value1" placeholder="Значение #1" />
                <small class="form-text text-muted">Введите значение для расчета</small>
                <span id="err1" class="help-block"></span>
            </div>
            <div class="form-group">
                <label>Операция:</label>
                <select class="form-control selcls" id="operation">
                    <option value="mul">Умножение</option>
                    <option value="div">Деление</option>
                    <option value="add">Сумма</option>
                    <option value="sub">Разница</option>
                </select>
                <small class="form-text text-muted">Выберите операцию</small>
             </div>
             <div class="form-group">
                <label for="input1">Значение 2</label>
                <input  path="value2" type="number" class="form-control" id="value2" placeholder="Значение #2" />
                <small class="form-text text-muted">Введите значение для расчета</small>
                <span id="err2" class="help-block"></span>
            </div>
            
            <div class="form-group"><label id="result"></label></div>
                <div class="form-actions">
                    <button onClick="sendToCalc(event)" class="btn btn-primary btn-block">Расчитать</button>
                </div> 
                </form>
            </div>
            
            
        </div>
    </body>
</html>
