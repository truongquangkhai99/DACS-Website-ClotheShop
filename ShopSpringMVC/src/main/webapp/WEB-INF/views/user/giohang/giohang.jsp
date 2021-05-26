<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@include file="/WEB-INF/views/layouts/user/taglib.jsp"%>

<head>
<meta charset="UTF-8">
<title>Gio hang</title>
<style>
.summary {
	background-color: #ddd;
	border-top-right-radius: 1rem;
	border-bottom-right-radius: 1rem;
	padding: 4vh;
	color: rgb(65, 65, 65)
}

@media ( max-width :767px) {
	.summary {
		border-top-right-radius: unset;
		border-bottom-left-radius: 1rem
	}
}

.summary .col-2 {
	padding: 0
}

.summary .col-10 {
	padding: 0
}

.btn:focus {
	box-shadow: none;
	outline: none;
	box-shadow: none;
	color: white;
	-webkit-box-shadow: none;
	-webkit-user-select: none;
	transition: none
}

.btn:hover {
	color: white
}

select {
	border: 1px solid rgba(0, 0, 0, 0.137);
	padding: 1.5vh 1vh;
	margin-bottom: 4vh;
	outline: none;
	width: 100%;
	background-color: rgb(247, 247, 247)
}

.txt {
	text-align: center;
	vertical-align: top;
}
</style>
</head>
<body>
	
	<div class="container">
		<div class="row"
			style="border: 1px solid #d2d2d2; margin-top: 20px; margin-bottom: 20px; border-top-right-radius: 1rem; border-bottom-right-radius: 1rem;">
			<div>
				<div class="title">
					<div class="row">
						<div class="col-md-4">
							<h4 style="margin-top: 20px; margin-left: 20px">
								<b>Giỏ hàng</b>
							</h4>
						</div>
						<div class="col-md-4">
							<c:if test="${TongSLCart == null}">
								<h5 style="margin-top: 25px; text-align: center;">0 sản
									phẩm trong giỏ hàng</h5>
							</c:if>
							<c:if test="${TongSLCart != null}">
								<h5 style="margin-top: 25px; text-align: center;">${TongSLCart}
									sản phẩm trong giỏ hàng</h5>
							</c:if>

						</div>
						<div class="col-md-4">
							<c:if test="${TongGiaCart == null}">
								<h5
									style="margin-top: 25px; text-align: right; margin-right: 20px">
									<fmt:formatNumber type="number" groupingUsed="true" value="0" />
									đ
								</h5>
							</c:if>
							<c:if test="${TongGiaCart != null}">
								<h5
									style="margin-top: 25px; text-align: right; margin-right: 20px">
									<fmt:formatNumber type="number" groupingUsed="true"
										value="${TongGiaCart}" />
									đ
								</h5>
							</c:if>
						</div>
					</div>
				</div>
				<hr
					style="height: 2px; border-width: 0; color: gray; background-color: #e2d1d1" />
				<table class="table table-bordered">
					<thead>
						<tr>
							<th class="txt">Hình ảnh</th>
							<th class="txt">Tên sản phẩm</th>
							<th class="txt">Màu sắc</th>
							<th class="txt">Giá bán</th>
							<th class="txt">Số lượng</th>
							<th class="txt">Sửa</th>
							<th class="txt">Xóa</th>
							<th class="txt">Tổng tiền</th>
						</tr>
					</thead>
					<tbody>
						<c:forEach var="item" items="${ Cart }">
							<tr>
								<td class="txt"><img width="100"
									src="<c:url value="/assets/user/images/sanpham/${item.value.sanpham.hinh_anh_sp}"/>"
									alt="anh-san-pham"></td>

								<td class="txt"><a
									href='<c:url value="/chi-tiet-san-pham/${item.value.sanpham.meta_name}-${item.value.sanpham.id_san_pham}" />'>${item.value.sanpham.ten_san_pham}</a>
								</td>

								<td class="txt"><span
									style="min-height: 34px;font-size: 14px;font-weight: bold;line-height: 34px;text-align: center;color: #fff;border-radius: 2px;background: #f89406;display:inline-block;padding:0 12px;border:0;;background-color: ${item.value.sanpham.code}"><span
										class="icon-ok"></span></span></td>

								<td class="txt"><fmt:formatNumber type="number"
										groupingUsed="true"
										value="${item.value.sanpham.gia_khuyen_mai}" /></td>

								<td class="txt"><input class="span1"
									style="max-width: 60px" min="0" max="100" type="number"
									value="${item.value.soluong}" id="soluong-gh-${item.key}"></td>

								<td class="txt"><button data-id="${item.key}"
										class="btn btn-danger edit-cart" type="button">
										<i class="fad fa-minus-octagon">Sửa</i>
									</button></td>

								<td class="txt"><a
									href="<c:url value="/delete-cart/${item.key}"/>"
									class="btn btn-danger" type="button" style="margin-left: 5px">
										<i class="fad fa-minus-octagon">Xóa</i>
								</a></td>

								<td><fmt:formatNumber type="number" groupingUsed="true"
										value="${item.value.tonggia}" /></td>
							</tr>
						</c:forEach>

					</tbody>
				</table>
			</div>
		</div>
		<div class="row">
			<div class="col-md-6" style="text-align: left; margin-bottom: 20px">
				<a href='<c:url value="/trang-chu"/>'>
					<button class="btn">&larr; Tiếp tục mua hàng</button>
				</a>
			</div>
			<c:if test="${empty LoginInfo}">
				<div class="col-md-6" style="text-align: right; margin-bottom: 20px">
					<a href='<c:url value="/dang-nhap"/>'>
						<button class="btn">Thanh toán &rarr;</button>
					</a>
				</div>
			</c:if>
			<c:if test="${not empty LoginInfo}">
				<div class="col-md-6" style="text-align: right; margin-bottom: 20px">
					<a href='<c:url value="/check-out"/>'>
						<button class="btn">Thanh toán &rarr;</button>
					</a>
				</div>
			</c:if>
		</div>
	</div>
	<content tag="script"> <script>
		$(".edit-cart").on("click", function name() {
			var id = $(this).data("id");
			var soluong = $("#soluong-gh-" + id).val();
			window.location = "edit-cart/" + id + "/" + soluong;
		});
	</script></content>

</body>