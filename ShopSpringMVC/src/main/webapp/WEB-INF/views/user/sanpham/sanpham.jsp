<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>Chi tiet san pham</title>
</head>

<body>
	<div class="page-head_agile_info_w3l">
		<div class="container"></div>
	</div>

	<!-- banner-bootom-w3-agileits -->
	<div class="banner-bootom-w3-agileits">
		<div class="container">
			<div class="col-md-4 single-right-left ">
				<div class="grid images_3_of_2">
					<div class="flexslider">
						<img
							src="<c:url value="/assets/user/images/sanpham/${sanpham.hinh_anh_sp}"/>"
							data-imagezoom="true" class="img-responsive">
						<!--  ul class="slides">
							<li data-thumb="<c:url value="/assets/user/images/sanpham/${sanpham.hinh_anh_sp}"/>">
								<div class="thumb-image">
									<img src="<c:url value="/assets/user/images/sanpham/${sanpham.hinh_anh_sp}"/>" data-imagezoom="true"
										class="img-responsive">
								</div>
							</li>
							 
							<li data-thumb="<c:url value="/assets/user/images/sanpham/${sanpham.hinh_anh_sp}"/>">
								<div class="thumb-image">
									<img src="<c:url value="/assets/user/images/sanpham/${sanpham.hinh_anh_sp}"/>" data-imagezoom="true"
										class="img-responsive">
								</div>
							</li>
							<li data-thumb="<c:url value="/assets/user/images/sanpham/${sanpham.hinh_anh_sp}"/>">
								<div class="thumb-image">
									<img src="<c:url value="/assets/user/images/sanpham/${sanpham.hinh_anh_sp}"/>" data-imagezoom="true"
										class="img-responsive">
								</div>
							</li>
						</ul>-->
						<div class="clearfix"></div>
					</div>
				</div>
			</div>
			<div class="col-md-8 single-right-left simpleCart_shelfItem">
				<h3 style="margin-bottom: 15px">${sanpham.ten_san_pham }</h3>
				<p>
					<c:choose>
						<c:when test="${sanpham.gia_ban == sanpham.gia_khuyen_mai }">
							<span class="item_price"> <fmt:formatNumber type="number"
									groupingUsed="true" value="${sanpham.gia_ban}" /> đ
							</span>
						</c:when>
						<c:when test="${sanpham.gia_ban != sanpham.gia_khuyen_mai }">
							<span class="item_price"><fmt:formatNumber type="number"
									groupingUsed="true" value="${sanpham.gia_khuyen_mai} " /> đ</span>
							<del>
								<fmt:formatNumber type="number" groupingUsed="true"
									value="${sanpham.gia_ban}" />
							</del>
						</c:when>
					</c:choose>
				</p>


				<form class="form-horizontal qtyFrm">
					<div class="control-group" style="margin-bottom: 15px">
						<label class="control-label"> <span>Số lượng: </span>
						</label>
						<div class="controls" style="display: inline-block;">
							<input type="number" min="0" value="1" class="span6"
								style="width: 40px">
						</div>
					</div>
				</form>

				<form class="form-horizontal qtyFrm">
					<div class="control-group">
						<label class="control-label"> <span>Màu sắc: </span>
						</label>
						<div class="controls"></div>
						<input type="number" min="0" class="span6">
					</div>
				</form>

				<div class="occasional">
					<h5 style="font-weight: bold">Size :</h5>
					<div class="colr ert">
						<label class="radio"><input type="radio" name="radio"
							checked=""><i></i>Casual Shoes</label>
					</div>
					<div class="colr">
						<label class="radio"><input type="radio" name="radio"><i></i>Sneakers
						</label>
					</div>
					<div class="colr">
						<label class="radio"><input type="radio" name="radio"><i></i>Formal
							Shoes</label>
					</div>
					<div class="clearfix"></div>
				</div>

				<form class="form-horizontal qtyFrm" method="get"
					action="<c:url value="/add-cart/${sanpham.id_san_pham}"/>">
					<button type="submit" name="submit"
						style="font-size: 13px; color: #fff; background: #2fdab8; text-decoration: none; position: relative; border: none; border-radius: 0; width: 20%; text-transform: uppercase; padding: .5em 0; outline: none; letter-spacing: 1px; font-weight: 600;">Thêm
						vào giỏ</button>
				</form>




			</div>
		</div>
		<div class="clearfix"></div>
		<!-- /new_arrivals -->
		<div class="container">
			<div class="responsive_tabs_agileits"
				style="padding-left: 15px; padding-right: 15px;">
				<div id="horizontalTab">
					<ul class="resp-tabs-list">
						<li>Thông tin sản phẩm</li>
						<li>Sản phẩm liên quan</li>
					</ul>
					<div class="resp-tabs-container">
						<!--/tab1-->
						<div class="tab1">
							<div class="single_page_agile_its_w3ls">
								<h6>${sanpham.ten_san_pham}</h6>
								<p>${sanpham.mo_ta}</p>
								<p class="w3ls_para"></p>
							</div>
						</div>
						<!--//tab1-->

						<!-- tab sp lien quan -->
						<div class="tab2">
							<div class="single_page_agile_its_w3ls">

								<c:forEach var="item" items="${SanPhamLienQuan}"
									varStatus="index">
									<div class="row" style="margin-top: 15px;">
										<div class="col-sm-3" style="text-align: center;">
											<img
												src="<c:url value="/assets/user/images/sanpham/${item.hinh_anh_sp}"/>"
												class="position: relative;" width="136" height="204">
										</div>

										<div class="col-sm-7">
											<h4 style="font-weight: bold;">${item.ten_san_pham}</h4>
											<p>${item.mo_ta}</p>
										</div>

										<div class="col-sm-2" style="text-align: center;">
											<form class="form-horizontal qtyFrm">
												<p>
													<c:choose>
														<c:when test="${item.gia_ban == item.gia_khuyen_mai }">
															<span class="item_price"> <fmt:formatNumber
																	type="number" groupingUsed="true"
																	value="${sanpham.gia_ban}" /> đ
															</span>
														</c:when>
														<c:when test="${item.gia_ban != item.gia_khuyen_mai }">
															<span class="item_price"><fmt:formatNumber
																	type="number" groupingUsed="true"
																	value="${item.gia_khuyen_mai} " /> đ</span>
															<del>
																<fmt:formatNumber type="number" groupingUsed="true"
																	value="${item.gia_ban}" />
															</del>
														</c:when>
													</c:choose>
												</p>
												<div class="btn-group">
													<a href="#" class="defaultBtn"><span
														class="icon-shopping-cart"></span></a> <a
														href='<c:url value="/chi-tiet-san-pham/${item.meta_name}-${item.id_san_pham}" />'
														class="shopBtn"
														style="min-height: 34px; font-size: 14px; font-weight: bold; line-height: 34px; text-align: center; color: #fff; border-radius: 2px; background: #f89406; display: inline-block; padding: 0 12px; border: 0;">XEM</a>
												</div>

											</form>
										</div>
									</div>
									<hr
										style="height: 2px; border-width: 0; color: gray; background-color: #e2d1d1" />
								</c:forEach>

							</div>
							<!-- //tab sp lien quan -->
						</div>
					</div>
				</div>
			</div>
		</div>
		<!-- //new_arrivals -->
		<!--/slider_owl-->

		<div class="w3_agile_latest_arrivals">
			<h3 class="wthree_text_info">Có thể bạn thích</h3>
			<c:forEach var="item" items="${SanPhamThich}" varStatus="index">
				<div class="col-md-3 product-men single">
					<div class="men-pro-item simpleCart_shelfItem">
						<div class="men-thumb-item">
							<img
								src="<c:url value="/assets/user/images/sanpham/${item.hinh_anh_sp}"/>"
								alt="" class="pro-image-front"> <img
								src="<c:url value="/assets/user/images/sanpham/${item.hinh_anh_sp}"/>"
								alt="" class="pro-image-back">
							<div class="men-cart-pro">
								<div class="inner-men-cart-pro">
									<a
										href='<c:url value="/chi-tiet-san-pham/${item.meta_name}-${item.id_san_pham}" />'
										class="link-product-add-cart">Xem Ngay</a>
								</div>
							</div>
							<span class="product-new-top">New</span>

						</div>
						<div class="item-info-product ">
							<h4>
								<a
									href='<c:url value="/chi-tiet-san-pham/${item.meta_name}-${item.id_san_pham}" />'>${item.ten_san_pham}</a>
							</h4>
							<div class="info-product-price">
								<c:choose>
									<c:when test="${item.gia_ban == item.gia_khuyen_mai }">
										<span class="item_price"> <fmt:formatNumber
												type="number" groupingUsed="true" value="${item.gia_ban}" />
											đ
										</span>
									</c:when>
									<c:when test="${item.gia_ban != item.gia_khuyen_mai }">
										<span class="item_price"><fmt:formatNumber
												type="number" groupingUsed="true"
												value="${item.gia_khuyen_mai} " /> đ</span>
										<del>
											<fmt:formatNumber type="number" groupingUsed="true"
												value="${item.gia_ban}" />
										</del>
									</c:when>
								</c:choose>
							</div>
							<div
								class="snipcart-details top_brand_home_details item_add single-item hvr-outline-out button2">
								<form action="<c:url value="/add-cart/${item.id_san_pham}"/>"
									method="get">
									<input type="submit" name="submit" value="Thêm vào giỏ"
										class="button" />
								</form>
							</div>

						</div>
					</div>
				</div>
			</c:forEach>

			<div class="clearfix"></div>

			<!--//slider_owl-->
		</div>
	</div>
	</div>
	<!--//single_page-->
</body>
