package ShopSpringMVC.Service.User;

import org.springframework.stereotype.Service;

import ShopSpringMVC.Dto.PaginatesDto;

@Service
public class PaginatesServiceImpl {
	
	
	public PaginatesDto GetInfoPaginates(int totalData, int limit, int currentPage) {
		PaginatesDto paginates = new PaginatesDto();
		paginates.setLimit(limit);// gioi han san pham tren trang
		paginates.setTotalPage(SetInfoTotalPage(totalData, limit));
		paginates.setCurrentPage(CheckCurrentPage(currentPage, paginates.getTotalPage()));

		int start = FindStart(paginates.getCurrentPage(), limit);
		paginates.setStart(start);
		int end = FindEnd(paginates.getStart(), limit, totalData);
		paginates.setEnd(end);

		return paginates;
	}

	// get tong so trang san pham
	private int SetInfoTotalPage(int totalData, int limit) {
		Integer totalPage = 0;
		totalPage = totalData / limit;
		totalPage = totalPage * limit < totalData ? totalPage + 1 : totalPage;
		return totalPage;
	}

	// kiem tra trang hien tai
	//
	private int CheckCurrentPage(int currentPage, int totalPage) {
		if (currentPage < 1) {
			return 1;
		}
		if (currentPage > totalPage) {
			return totalPage;
		}
		return currentPage;
	}

	// xac dinh san pham bat dau cua trang
	// 1-2-3-4-5-6
	// 7-8-9-10-11-12
	// kiem tra hang 2: ((2-1)*6) +1 = 7
	private int FindStart(int currentPage, int limit) {
		return ((currentPage - 1) * limit) + 1;
	}

	//
	private int FindEnd(int start, int limit, int totalData) {
		return start + limit > totalData ? totalData : (start + limit - 1);
	}

}
