<html>
<head>
    <title>Spring MVC Demo</title>
</head>

<body>
<h2>All Students</h2>

<table border="2">
    <tr>
        <th>Student Id</th>
        <th>Student Name</th>
    </tr>
    <tr>
        <th>${students[1].id}</th>
        <th>${students[1].name}</th>
    </tr>
    <tr>
        <th>${students[2].id}</th>
        <th>${students[2].name}</th>
    </tr>
</table>

</body>
</html>