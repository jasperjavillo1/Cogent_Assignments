<!DOCTYPE html>
<html>
    <title>
        Employee Form
    </title>
    <body>
        <h1>Employee Form</h1>
        <hr>
        <form action = "/addEmployee" method = "post">
        	<label for="id">ID:</label>
            <input type="number" id="id" name="id"><br>
            <label for="name">Name:</label>
            <input type="text" id="name" name="name"><br>
            <label for="email">Email:</label>
            <input type="text" id="email" name="email"><br>
            <input type="submit" value="Save">
        </form>
    </body>
</html>