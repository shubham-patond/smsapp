<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<link href="https:/cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css"
            rel="stylesheet"integrity="sha384-T3c6CoIi6uLrA9TneNEoa7RxnatzjcDSCmG1MXxSR1GAsXEV/Dwwykc2MPK8M2HN"
            crossorigin="anonymous">
            
</head>
<body>

 <marquee class="bg-primary">
  <h2 class="text-white">${login_fail}</h2>
 </marquee>
   <h1 style="position: absolute;margin-left:335px;font-size:60px;color:green;margin-top: 38px">Welcome To Cjc Class</h1>
   
   <section class=" gradient-custom" style="background-image: url(images/login.webp);
                                    background-size:cover;background-repeat:no-repeat;height:800px">
   <div class="container py-5 ">
   <div class="row d-flex justify-content-center align-items-center "> 
   <div class="col-12 col-md-8 col-lg-6 col-xl-5">
   <div class="card bg-dark text-white" style="border-radius: 3rem; margin-top: 100px"> 
   <div class="card-body p-5 text-center">
   <div class="mb-md-2 mt-md-2 pb-2">
   
 <form action="login"> 
   <h2 class="fw-bold mb-2 text-uppercase">Login</h2> 
   <p class="text-white-50 mb-2">Please enter your login and password!</p> 
   
   <div class="form-outline form-white mb-4"> 
     <input type="text" id="typeEmailX" name="username" class="form-control formcontrol-lg" />
     <label class="form-label" for="typeEmailX" >Username</label>
   </div>
   
  <div class="form-outline form-white mb-4">
    <input type="text" id="typePasswordX" name="password" class="form-control formcontrol-lg" />
    <label class="form-label" for="typePasswordX" >Password</label> 
  </div>

    <button class="btn btn-outline-light btn-lg " type="submit">Login</button> 
 </form>
</div>
</div>
</div>
</div> 
</div> 
</div>
</section>

</body>
</html>