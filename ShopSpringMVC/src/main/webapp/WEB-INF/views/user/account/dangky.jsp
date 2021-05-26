<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>Dang Ky</title>
<style>
input, select, textarea {
	outline: none;
	appearance: unset !important;
	-moz-appearance: unset !important;
	-webkit-appearance: unset !important;
	-o-appearance: unset !important;
	-ms-appearance: unset !important;
}

input::-webkit-outer-spin-button, input::-webkit-inner-spin-button {
	appearance: none !important;
	-moz-appearance: none !important;
	-webkit-appearance: none !important;
	-o-appearance: none !important;
	-ms-appearance: none !important;
	margin: 0;
}

input:focus, select:focus, textarea:focus {
	outline: none;
	box-shadow: none !important;
	-moz-box-shadow: none !important;
	-webkit-box-shadow: none !important;
	-o-box-shadow: none !important;
	-ms-box-shadow: none !important;
}

input[type=checkbox] {
	appearance: checkbox !important;
	-moz-appearance: checkbox !important;
	-webkit-appearance: checkbox !important;
	-o-appearance: checkbox !important;
	-ms-appearance: checkbox !important;
}

input[type=radio] {
	appearance: radio !important;
	-moz-appearance: radio !important;
	-webkit-appearance: radio !important;
	-o-appearance: radio !important;
	-ms-appearance: radio !important;
}

display-flex, .display-flex, .display-flex-center, .signup-content,
	.signin-content, .social-login, .socials {
	display: flex;
	display: -webkit-flex;
}

.socials {
	list-style-type: none;
	margin: 0;
	padding: 0;
}

h2 {
	line-height: 1.66;
	margin: 0;
	padding: 0;
	font-weight: bold;
	color: #222;
	font-family: Poppins;
	font-size: 36px;
}

.signup {
	margin-bottom: 150px;
}

.signup-content {
	padding: 75px 0;
}

.signup-form, .signup-image, .signin-form, .signin-image {
	overflow: hidden;
}

.signup-image {
	margin: 0 55px;
}

.form-title {
	margin-bottom: 33px;
}

.signup-image {
	margin-top: 95px;
}

figure {
	margin-bottom: 50px;
}

.form-submit {
	display: inline-block;
	background: #6dabe4;
	color: #fff;
	border-bottom: none;
	width: auto;
	padding: 15px 39px;
	border-radius: 5px;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	-o-border-radius: 5px;
	-ms-border-radius: 5px;
	margin-top: 25px;
	cursor: pointer;
}

.form-submit:hover {
	background: #4292dc;
}

#signin {
	margin-top: 16px;
}

.signup-image-link {
	font-size: 14px;
	color: #222;
	display: block;
	text-align: center;
}

.term-service {
	font-size: 13px;
	color: #222;
}

.signup-form {
	/*margin-left: 75px;
	margin-right: 75px;
	padding-left: 34px;*/
	
}

.register-form {
	width: 100%;
}

.form-group {
	position: relative;
	margin-bottom: 25px;
	overflow: hidden;
}

.form-group:last-child {
	margin-bottom: 0px;
}

input {
	width: 100%;
	border: none;
	border-bottom: 1px solid #999;
	padding: 6px 30px;
	font-family: Poppins;
	box-sizing: border-box;
}

input::-webkit-input-placeholder {
	color: #999;
}

input::-moz-placeholder {
	color: #999;
}

input:-ms-input-placeholder {
	color: #999;
}

input:-moz-placeholder {
	color: #999;
}

input:focus {
	border-bottom: 1px solid #222;
}

input:focus::-webkit-input-placeholder {
	color: #222;
}

input:focus::-moz-placeholder {
	color: #222;
}

input:focus:-ms-input-placeholder {
	color: #222;
}

input:focus:-moz-placeholder {
	color: #222;
}

input[type=checkbox]:not(old) {
	width: 2em;
	margin: 0;
	padding: 0;
	font-size: 1em;
	display: none;
}

input[type=checkbox]:not(old)+label {
	display: inline-block;
	line-height: 1.5em;
	margin-top: 6px;
}

input[type=checkbox]:not(old)+label>span {
	display: inline-block;
	width: 13px;
	height: 13px;
	margin-right: 15px;
	margin-bottom: 3px;
	border: 1px solid #999;
	border-radius: 2px;
	-moz-border-radius: 2px;
	-webkit-border-radius: 2px;
	-o-border-radius: 2px;
	-ms-border-radius: 2px;
	background: white;
	background-image: -moz-linear-gradient(white, white);
	background-image: -ms-linear-gradient(white, white);
	background-image: -o-linear-gradient(white, white);
	background-image: -webkit-linear-gradient(white, white);
	background-image: linear-gradient(white, white);
	vertical-align: bottom;
}

input[type=checkbox]:not(old):checked+label>span {
	background-image: -moz-linear-gradient(white, white);
	background-image: -ms-linear-gradient(white, white);
	background-image: -o-linear-gradient(white, white);
	background-image: -webkit-linear-gradient(white, white);
	background-image: linear-gradient(white, white);
}

input[type=checkbox]:not(old):checked+label>span:before {
	content: '\f26b';
	display: block;
	color: #222;
	font-size: 11px;
	line-height: 1.2;
	text-align: center;
	font-family: 'Material-Design-Iconic-Font';
	font-weight: bold;
}

.agree-term {
	display: inline-block;
	width: auto;
}

label {
	position: absolute;
	left: 0;
	top: 50%;
	transform: translateY(-50%);
	-moz-transform: translateY(-50%);
	-webkit-transform: translateY(-50%);
	-o-transform: translateY(-50%);
	-ms-transform: translateY(-50%);
	color: #222;
}

.label-has-error {
	top: 22%;
}

label.error {
	position: relative;
	background: url("../images/unchecked.gif") no-repeat;
	background-position-y: 3px;
	padding-left: 20px;
	display: block;
	margin-top: 20px;
}

label.valid {
	display: block;
	position: absolute;
	right: 0;
	left: auto;
	margin-top: -6px;
	width: 20px;
	height: 20px;
	background: transparent;
}

label.valid:after {
	font-family: 'Material-Design-Iconic-Font';
	content: '\f269';
	width: 100%;
	height: 100%;
	position: absolute;
	/* right: 0; */
	font-size: 16px;
	color: green;
}

.label-agree-term {
	position: relative;
	top: 0%;
	transform: translateY(0);
	-moz-transform: translateY(0);
	-webkit-transform: translateY(0);
	-o-transform: translateY(0);
	-ms-transform: translateY(0);
}

.material-icons-name {
	font-size: 18px;
}

.signin-content {
	padding-left: 210px;
	padding-top: 55px;
	padding-bottom: 87px;
}

.social-login {
	align-items: center;
	-moz-align-items: center;
	-webkit-align-items: center;
	-o-align-items: center;
	-ms-align-items: center;
	margin-top: 80px;
}

.social-label {
	display: inline-block;
	margin-right: 15px;
}

.socials li {
	padding: 5px;
}

.socials li:last-child {
	margin-right: 0px;
}

.socials li a {
	text-decoration: none;
}

.socials li a i {
	width: 30px;
	height: 30px;
	color: #fff;
	font-size: 14px;
	border-radius: 5px;
	-moz-border-radius: 5px;
	-webkit-border-radius: 5px;
	-o-border-radius: 5px;
	-ms-border-radius: 5px;
	transform: translateZ(0);
	-moz-transform: translateZ(0);
	-webkit-transform: translateZ(0);
	-o-transform: translateZ(0);
	-ms-transform: translateZ(0);
	-webkit-transition-duration: 0.3s;
	transition-duration: 0.3s;
	-webkit-transition-property: transform;
	transition-property: transform;
	-webkit-transition-timing-function: ease-out;
	transition-timing-function: ease-out;
}

.socials li:hover a i {
	-webkit-transform: scale(1.3) translateZ(0);
	transform: scale(1.3) translateZ(0);
}

.zmdi-facebook {
	background: #3b5998;
}

.zmdi-twitter {
	background: #1da0f2;
}

.zmdi-google {
	background: #e72734;
}

.signin-form {
	margin-right: 90px;
	margin-left: 80px;
}

.signin-image {
	margin-left: 110px;
	margin-right: 20px;
	margin-top: 10px;
}

@media screen and (max-width: 768px) {
	.signup-content, .signin-content {
		flex-direction: column;
		-moz-flex-direction: column;
		-webkit-flex-direction: column;
		-o-flex-direction: column;
		-ms-flex-direction: column;
		justify-content: center;
		-moz-justify-content: center;
		-webkit-justify-content: center;
		-o-justify-content: center;
		-ms-justify-content: center;
	}
	.signup-form {
		margin-left: 0px;
		margin-right: 0px;
		padding-left: 0px;
		/* box-sizing: border-box; */
		padding: 0 30px;
	}
	.signin-image {
		margin-left: 0px;
		margin-right: 0px;
		margin-top: 50px;
		order: 2;
		-moz-order: 2;
		-webkit-order: 2;
		-o-order: 2;
		-ms-order: 2;
	}
	.signup-form, .signup-image, .signin-form, .signin-image {
		width: auto;
	}
	.social-login {
		justify-content: center;
		-moz-justify-content: center;
		-webkit-justify-content: center;
		-o-justify-content: center;
		-ms-justify-content: center;
	}
	.form-button {
		text-align: center;
	}
	.signin-form {
		order: 1;
		-moz-order: 1;
		-webkit-order: 1;
		-o-order: 1;
		-ms-order: 1;
		margin-right: 0px;
		margin-left: 0px;
		padding: 0 30px;
	}
	.form-title {
		text-align: center;
	}
}

@media screen and (max-width: 400px) {
	.social-login {
		flex-direction: column;
		-moz-flex-direction: column;
		-webkit-flex-direction: column;
		-o-flex-direction: column;
		-ms-flex-direction: column;
	}
	.social-label {
		margin-right: 0px;
		margin-bottom: 10px;
	}
}
</style>


</head>
<body>
<body>
	<c:if test="${not empty statusTC }">
		<div class="alert alert-success alert-dismissible">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>${statusTC}</strong>
		</div>
	</c:if>
	<c:if test="${not empty statusTB }">
		<div class="alert alert-warning alert-dismissible">
			<a href="#" class="close" data-dismiss="alert" aria-label="close">&times;</a>
			<strong>${statusTB}</strong>
		</div>
	</c:if>
	<div class="container">
		<div class="row">
			<div class="col-md-6">
				<div class="signin-content">
					<div class="signup-form">
						<h2 class="form-title" style="text-align: center">Đăng ký tài
							khoản</h2>
						<form:form action="dang-ky" method="POST" modelAttribute="user"
							class="register-form" id="register-form" name="form111"
							onsubmit="return matchpass()">
							<div class="form-group">
								<label for="name"><i class="fa fa-user"></i></label>
								<form:input path="username" type="text" name="name" id="name"
									placeholder="Tên đăng nhập" required="required"
									autocomplete="off" />
							</div>
							<div class="form-group">
								<label for="email"><i class="fa fa-envelope"></i></label>
								<form:input path="email" type="email" name="email" id="email"
									placeholder=" Email" required="required" autocomplete="off" />
							</div>
							<div class="form-group">
								<label for="pass"><i class="fa fa-lock"></i></label>
								<form:input path="password" type="password" name="pass"
									id="pass" placeholder="Mật khẩu" required="required"
									autocomplete="off" />
							</div>
							<div class="form-group">
								<label for="re-pass"><i class="fa fa-lock"></i></label> <input
									type="password" name="re_pass" id="re_pass"
									placeholder="Nhập lại mật khẩu" />
							</div>
							<div class="form-group form-button" style="text-align: center">
								<input type="submit" name="signup" id="signup"
									class="form-submit" value="Đăng ký" />
							</div>
						</form:form>


					</div>
				</div>
			</div>
			<div class="col-md-6">
				<div class="signup-image">
					<figure>
						<img
							src="<c:url value="/assets/user/images/log/signin-image.jpg"/>"
							alt="image">
					</figure>
				</div>
			</div>
		</div>
	</div>
	<content tag="script1"> <script type="text/javascript">
		function matchpass() {
			var firstpassword = document.form111.pass.value;
			var secondpassword = document.form111.re_pass.value;

			if (firstpassword == secondpassword) {
				return true;
			} else {
				alert("Vui lòng xác nhận lại mật khẩu!");
				return false;
			}
		}
	</script></content>
	<content tag="script2"> <script>
		$(document).ready(function() {
			$('input').attr('autocomplete', 'false');
		});
	</script> <script>
		function show_alert(${status}) {

			alert(${status});
		}
	</script> <script>
		$(document).ready(function() {

			//Khi bàn phím được nhấn và thả ra thì sẽ chạy phương thức này
			$("#register-form").validate({
				rules : {
					name : "required",
					email : "required",
					password : "required"
				},
				messages : {
					name : "Vui lòng nhập tên đăng nhập",
					email : "Vui lòng nhập email",
					password : "Vui lòng nhập mật khẩu"
				}
			});
		});
	</script> </content>

</body>