<html>
     <head>
         <title>Amazon-Atlas-Practice</title>
         <link href="https://fonts.googleapis.com/css2?family=Roboto:wght@400;700&display=swap" rel="stylesheet">
         <style>
             body {
                 font-family: 'Roboto', sans-serif;
                 background-color: #f5f6f5;
                 color: #232F3E;
                 margin: 0;
                 padding: 20px;
                 display: flex;
                 flex-direction: column;
                 min-height: 100vh;
             }
             h1 {
                 color: #FF9900;
                 text-align: center;
             }
             h2 {
                 color: #0066C0;
                 text-align: center;
             }
             .form-container {
                 background-color: #ffffff;
                 padding: 20px;
                 border-radius: 8px;
                 box-shadow: 0 2px 4px rgba(0, 0, 0, 0.1);
                 max-width: 500px;
                 margin: 0 auto;
             }
             label {
                 display: block;
                 margin: 10px 0 5px;
                 font-weight: bold;
                 color: #232F3E;
             }
             input[type="text"], input[type="number"], input[type="email"] {
                 width: 100%;
                 padding: 8px;
                 margin-bottom: 10px;
                 border: 1px solid #DDDDDD;
                 border-radius: 4px;
                 font-size: 16px;
             }
             input[type="submit"] {
                 background-color: #FF9900;
                 color: #ffffff;
                 padding: 10px 20px;
                 border: none;
                 border-radius: 4px;
                 cursor: pointer;
                 font-size: 16px;
                 width: 100%;
             }
             input[type="submit"]:hover {
                 background-color: #e68a00;
             }
             .footer {
                 text-align: center;
                 margin-top: auto;
                 padding: 20px 0;
                 color: #555555;
                 font-size: 14px;
             }
         </style>
     </head>
     <body>
         <h1>Amazon-Atlas-Practice</h1>
         <h2>Employee Information</h2>
         <div class="form-container">
             <form action="hello" method="post">
                 <label for="empName">Employee Name:</label>
                 <input type="text" id="empName" name="empName" required>
                 
                 <label for="empId">Employee ID:</label>
                 <input type="text" id="empId" name="empId" required>
                 
                 <label for="department">Department:</label>
                 <input type="text" id="department" name="department" required>
                 
                 <label for="yearsExp">Years of Experience:</label>
                 <input type="number" id="yearsExp" name="yearsExp" min="0" required>
                 
                 <label for="email">Company Mail ID:</label>
                 <input type="email" id="email" name="email" required>
                 
                 <input type="submit" value="Submit">
             </form>
         </div>
         <div class="footer">
             © Sushma Mainampati, 2025
         </div>
     </body>
     </html>