<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>Danh muc san pham</title>
<style>
.pagination {
	display: inline-block;
	display: flex;
	justify-content: center;
	margin-bottom: 30px;
}

.pagination a {
	color: black;
	float: left;
	padding: 8px 16px;
	text-decoration: none;
	transition: background-color .3s;
	border: 1px solid #ddd;
}

.pagination a.active {
	background-color: #2fdab8;
	color: white;
	border: 1px solid #2fdab8;
}

.pagination a:hover:not(.active) {
	background-color: #ddd;
}
</style>
</head>
<body>
	<div class="page-head_agile_info_w3l">
		<div class="container"></div>
	</div>



	<div class="banner-bootom-w3-agileits">
		<div class="container">
			<!-- mens -->
			<div class="col-md-3 products-left">
				<div class="css-treeview">
					<h4>Danh mục</h4>
					<ul class="tree-list-pad">
						<c:forEach var="item" items="${all_ten_danh_muc}">
							<a
								href='<c:url value="/san-pham/${item.meta_name}-${idDMC}-${item.id_danh_muc}"/>'>
								<li><label for="item-0"><i
										class="fa fa-long-arrow-right" aria-hidden="true"></i>
										${item.ten_danh_muc} </label></li>
							</a>
						</c:forEach>
					</ul>
				</div>
				<div class="community-poll">
					<h4>Lọc sản phẩm</h4>
					<div class="swit form">
						<form>
							<div class="check_box">
								<div class="radio">
									<label><input type="radio" name="radio" checked=""><i></i>More
										convenient for shipping and delivery</label>
								</div>
							</div>
							<div class="check_box">
								<div class="radio">
									<label><input type="radio" name="radio"><i></i>Lower
										Price</label>
								</div>
							</div>
							<div class="check_box">
								<div class="radio">
									<label><input type="radio" name="radio"><i></i>Track
										your item</label>
								</div>
							</div>
							<div class="check_box">
								<div class="radio">
									<label><input type="radio" name="radio"><i></i>Bigger
										Choice</label>
								</div>
							</div>
							<div class="check_box">
								<div class="radio">
									<label><input type="radio" name="radio"><i></i>More
										colors to choose</label>
								</div>
							</div>
							<div class="check_box">
								<div class="radio">
									<label><input type="radio" name="radio"><i></i>Secured
										Payment</label>
								</div>
							</div>
							<div class="check_box">
								<div class="radio">
									<label><input type="radio" name="radio"><i></i>Money
										back guaranteed</label>
								</div>
							</div>
							<div class="check_box">
								<div class="radio">
									<label><input type="radio" name="radio"><i></i>Others</label>
								</div>
							</div>
							<input type="submit" value="SEND">
						</form>
					</div>
				</div>
				<div class="clearfix"></div>
			</div>


			<div class="col-md-9 products-right">
				<h5>
					Sản phẩm <span>(${total})</span>
				</h5>
				<div class="sort-grid">
					<div class="sorting">
						<h6>Sắp xếp theo</h6>
						<select id="country1" onchange="change_country(this.value)"
							class="frm-field required sect">
							<option value="null">Mặc định</option>
							<option value="null">Tên (A - Z)</option>
							<option value="null">Tên (Z - A)</option>
							<option value="null">Giá (cao- thấp)</option>
							<option value="null">Giá (thấp - cao)</option>
						</select>
						<div class="clearfix"></div>
					</div>
					<div class="clearfix"></div>
				</div>


				<div class="tab1">
					<c:if test="${SanPhamPaginate.size() > 0}">
						<c:forEach var="item" items="${SanPhamPaginate}">
							<div class="col-md-4 product-men">
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
					</c:if>
					<div class="clearfix"></div>
				</div>




				<div class="clearfix"></div>
			</div>
			<div class="clearfix"></div>
		</div>
	</div>
	<!-- //mens -->

	<div class="pagination">
		<c:forEach var="item" begin="1" end="${paginatesInfo.totalPage}"
			varStatus="loop">
			<c:if test="${(loop.index) == paginatesInfo.currentPage}">
				<a
					href='<c:url value="/san-pham/${meta_name}-${idDMC}-${idDanhMuc}/${loop.index}"/>'
					class="active">${loop.index}</a>
			</c:if>
			<c:if test="${(loop.index) != paginatesInfo.currentPage}">
				<a
					href='<c:url value="/san-pham/${meta_name}-${idDMC}-${idDanhMuc}/${loop.index}"/>'>${loop.index}</a>
			</c:if>
		</c:forEach>
	</div>

</body>