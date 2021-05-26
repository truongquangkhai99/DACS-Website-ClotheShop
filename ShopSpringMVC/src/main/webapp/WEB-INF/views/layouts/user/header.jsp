<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<!-- header -->
<div class="header" id="home">
	<c:if test="${empty LoginInfo}" >
		<div class="container">
			<ul>
				<li><a href='<c:url value="/dang-nhap" />'><i
						class="fa fa-unlock-alt" aria-hidden="true"></i> Đăng Nhập</a></li>
				<li><a href='<c:url value="/dang-ky" />'><i
						class="fa fa-pencil-square-o" aria-hidden="true"></i> Đăng Ký </a></li>
				<li><i class="fa fa-phone" aria-hidden="true"></i> SĐT :
					0983686868</li>
				<li><i class="fa fa-envelope-o" aria-hidden="true"></i> <a
					href="mailto:info@example.com">info@dstruong.com</a></li>
			</ul>
		</div>
	</c:if>
	<c:if test="${not empty LoginInfo}" >
		<div class="container">
			<ul>
				<li><a href="#"><i
						class="fa fa-unlock-alt" aria-hidden="true"></i> ${LoginInfo.username}</a></li>
				<li><a href='<c:url value="/dang-xuat" />'><i
						class="fa fa-pencil-square-o" aria-hidden="true"></i> Đăng Xuất </a></li>
				<li><i class="fa fa-phone" aria-hidden="true"></i> SĐT :
					0983686868</li>
				<li><i class="fa fa-envelope-o" aria-hidden="true"></i> <a
					href="mailto:info@example.com">info@dstruong.com</a></li>
			</ul>
		</div>
	</c:if>
</div>
<!-- //header -->
<!-- header-bot -->
<div class="header-bot">
	<div class="header-bot_inner_wthreeinfo_header_mid">
		<div class="col-md-4 header-middle">
			<form action="#" method="post">
				<input type="search" name="search" placeholder="Tìm kiếm ..."
					required=""> <input type="submit" value=" ">
				<div class="clearfix"></div>
			</form>
		</div>
		<!-- header-bot -->
		<div class="col-md-4 logo_agile">
			<h1>
				<a href='<c:url value="/trang-chu" />'><span>SS</span>Clothes </a>
			</h1>
		</div>
		<!-- header-bot -->

		<div class="clearfix"></div>
	</div>
</div>
<!-- //header-bot -->
<!-- banner -->
<div class="ban-top">
	<div class="container">
		<div class="top_nav_left">
			<nav class="navbar navbar-default">
				<div class="container-fluid">
					<!-- Brand and toggle get grouped for better mobile display -->
					<div class="navbar-header">
						<button type="button" class="navbar-toggle collapsed"
							data-toggle="collapse"
							data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
							<span class="sr-only">Toggle navigation</span> <span
								class="icon-bar"></span> <span class="icon-bar"></span> <span
								class="icon-bar"></span>
						</button>
					</div>
					<!-- Collect the nav links, forms, and other content for toggling -->
					<div class="collapse navbar-collapse menu--shylock"
						id="bs-example-navbar-collapse-1">
						<ul class="nav navbar-nav menu__list">
							<li class="active menu__item menu__item--current"><a
								class="menu__link" href='<c:url value="/trang-chu" />'>Trang
									Chủ<span class="sr-only">(current)</span>
							</a></li>
							<li class="dropdown menu__item"><a href="#"
								class="dropdown-toggle menu__link" data-toggle="dropdown"
								role="button" aria-haspopup="true" aria-expanded="false">Nam
									<span class="caret"></span>
							</a>
								<ul class="dropdown-menu multi-column columns-3">
									<div class="agile_inner_drop_nav_info">
										<c:forEach var="item" items="${danh_muc}">
											<c:if
												test="${item.id_danh_muc_cha == 1 && item.trang_thai == 1}">
												<div class="col-sm-6 multi-gd-img">
													<ul class="multi-column-dropdown">
														<li><a
															href='<c:url value="/san-pham/${item.meta_name}-${item.id_danh_muc_cha}-${item.id_danh_muc}" />'>${item.ten_danh_muc}</a></li>
													</ul>
												</div>
											</c:if>
										</c:forEach>
										<div class="clearfix"></div>
									</div>
								</ul></li>
							<li class="dropdown menu__item"><a href="#"
								class="dropdown-toggle menu__link" data-toggle="dropdown"
								role="button" aria-haspopup="true" aria-expanded="false">Nữ
									<span class="caret"></span>
							</a>
								<ul class="dropdown-menu multi-column columns-3">
									<div class="agile_inner_drop_nav_info">
										<c:forEach var="item" items="${danh_muc}">
											<c:if
												test="${item.id_danh_muc_cha == 2 && item.trang_thai == 1}">
												<div class="col-sm-6 multi-gd-img">
													<ul class="multi-column-dropdown">
														<li><a
															href='<c:url value="/san-pham/${item.meta_name}-${item.id_danh_muc_cha}-${item.id_danh_muc}" />'>
																${item.ten_danh_muc} </a></li>
													</ul>
												</div>
											</c:if>
										</c:forEach>
										<div class="clearfix"></div>
									</div>
								</ul></li>

							<li class="dropdown menu__item"><a href="#"
								class="dropdown-toggle menu__link" data-toggle="dropdown"
								role="button" aria-haspopup="true" aria-expanded="false">Trẻ
									Em <span class="caret"></span>
							</a>
								<ul class="dropdown-menu multi-column columns-3">
									<div class="agile_inner_drop_nav_info">
										<c:forEach var="item" items="${danh_muc}">
											<c:if
												test="${item.id_danh_muc_cha == 3 && item.trang_thai == 1}">
												<div class="col-sm-6 multi-gd-img">
													<ul class="multi-column-dropdown">
														<li><a
															href='<c:url value="/san-pham/${item.meta_name}-${item.id_danh_muc_cha}-${item.id_danh_muc}" />'>${item.ten_danh_muc}</a></li>
													</ul>
												</div>
											</c:if>
										</c:forEach>
										<div class="clearfix"></div>
									</div>
								</ul></li>
							<li class="dropdown menu__item"><a href="#"
								class="dropdown-toggle menu__link" data-toggle="dropdown"
								role="button" aria-haspopup="true" aria-expanded="false">Phụ
									Kiện<span class="caret"></span>
							</a>
								<ul class="dropdown-menu multi-column columns-3">
									<div class="agile_inner_drop_nav_info">
										<c:forEach var="item" items="${danh_muc}">
											<c:if
												test="${item.id_danh_muc_cha == 4 && item.trang_thai == 1}">
												<div class="col-sm-6 multi-gd-img">
													<ul class="multi-column-dropdown">
														<li><a
															href='<c:url value="/san-pham/${item.meta_name}-${item.id_danh_muc_cha}-${item.id_danh_muc}" />'>${item.ten_danh_muc}</a></li>
													</ul>
												</div>
											</c:if>
										</c:forEach>
										<div class="clearfix"></div>
									</div>
								</ul></li>
						</ul>
					</div>
				</div>
			</nav>
		</div>
		<div class="top_nav_right">
			<div class="wthreecartaits wthreecartaits2 cart cart box_1">
				<form action="<c:url value="/gio-hang"/>">
					<button class="w3view-cart">
						<i class="fa" style="font-size: 24px">&#xf07a;</i>
						<c:if test="${TongSLCart == null}">
							<span class='badge badge-warning' id='lblCartCount'> 0</span>
						</c:if>
						<c:if test="${TongSLCart != null}">
							<span class='badge badge-warning' id='lblCartCount'>
								${TongSLCart}</span>
						</c:if>


					</button>
				</form>

			</div>
		</div>
		<div class="clearfix"></div>
	</div>
</div>
<!-- //banner-top -->
<!-- Modal1 -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog">
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>
			<div class="modal-body modal-body-sub_agile">
				<div class="col-md-8 modal_body_left modal_body_left1">
					<h3 class="agileinfo_sign">Đăng Nhập Ngay</h3>
					<form action="#" method="post">
						<div class="styled-input agile-styled-input-top">
							<input type="text" name="Name" required=""> <label>Tên
								đăng nhập</label> <span></span>
						</div>
						<div class="styled-input">
							<input type="password" name="password" required=""> <label>Mật
								khẩu</label> <span></span>
						</div>
						<input type="submit" value="Đăng Nhập">
					</form>
					<ul
						class="social-nav model-3d-0 footer-social w3_agile_social top_agile_third">
						<li><a href="#" class="facebook">
								<div class="front">
									<i class="fa fa-facebook" aria-hidden="true"></i>
								</div>
								<div class="back">
									<i class="fa fa-facebook" aria-hidden="true"></i>
								</div>
						</a></li>
						<li><a href="#" class="twitter">
								<div class="front">
									<i class="fa fa-google" aria-hidden="true"></i>
								</div>
								<div class="back">
									<i class="fa fa-google" aria-hidden="true"></i>
								</div>
						</a></li>
					</ul>
					<div class="clearfix"></div>
					<p>
						<a href="#" data-toggle="modal" data-target="#myModal2"> Bạn
							chưa có tài khoản?</a>
					</p>

				</div>
				<div class="col-md-4 modal_body_right modal_body_right1">
					<img src="<c:url value="/assets/user/images/log/log_pic.jpg"/>" alt="" />
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<!-- //Modal content-->
	</div>
</div>
<!-- //Modal1 -->
<!-- Modal2 -->
<div class="modal fade" id="myModal2" tabindex="-1" role="dialog">
	<div class="modal-dialog">
		<!-- Modal content-->
		<div class="modal-content">
			<div class="modal-header">
				<button type="button" class="close" data-dismiss="modal">&times;</button>
			</div>
			<div class="modal-body modal-body-sub_agile">
				<div class="col-md-8 modal_body_left modal_body_left1">
					<h3 class="agileinfo_sign">Đăng Ký Ngay</h3>
					
					<form>  
						<div class="styled-input agile-styled-input-top">
							<input type="text" name="Name" required=""> <label>Tên
								đăng nhập</label> <span></span>
						</div>
						
						<div class="styled-input">
							
							<input type="email" name="Email" required=""> <label>Email</label>
							<span></span>
						</div>
						
						<div class="styled-input">
							<input type="password" name="password" required=""> <label>Mật
								khẩu</label> <span></span>
						</div>
						
						<div class="styled-input">
							<input type="password" name="Confirm Password" required="">
							<label>Nhập lại mật khẩu</label> <span></span>
						</div>
						
						<input type="submit" value="Đăng Ký">
					</form>
					<ul
						class="social-nav model-3d-0 footer-social w3_agile_social top_agile_third">
						<li><a href="#" class="facebook">
								<div class="front">
									<i class="fa fa-facebook" aria-hidden="true"></i>
								</div>
								<div class="back">
									<i class="fa fa-facebook" aria-hidden="true"></i>
								</div>
						</a></li>
						<li><a href="#" class="twitter">
								<div class="front">
									<i class="fa fa-google" aria-hidden="true"></i>
								</div>
								<div class="back">
									<i class="fa fa-google" aria-hidden="true"></i>
								</div>
						</a></li>
					</ul>
					<div class="clearfix"></div>
				</div>
				<div class="col-md-4 modal_body_right modal_body_right1">
					<img src="<c:url value="/assets/user/images/log/log_pic.jpg"/>" alt="" />
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
		<!-- //Modal content-->
	</div>
</div>
<!-- //Modal2 -->