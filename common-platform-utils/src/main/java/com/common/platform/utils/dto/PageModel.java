package com.common.platform.utils.dto;

public class PageModel {
	private long allRecorder;

	private Integer currentPage = 1;

	private Integer pageSize = 2; // 一页显示的数量大小 ,经过测试每页显示10条数据正好合适

	private Integer totalPage;

	public PageModel() {

	}

	public PageModel(int pageSize) {
		this.pageSize = pageSize;
	}

	public long getAllRecorder() {
		return allRecorder;
	}

	public void setAllRecorder(long allRecorder) {
		this.totalPage = (int) ((allRecorder + pageSize - 1) / pageSize);
		this.allRecorder = allRecorder;
	}

	public Integer getCurrentPage() {
		if (currentPage < 1) {
			return 1;
		}
		return currentPage;
	}

	public void setStrCurrentPage(String str) {
		try {
			this.currentPage = Integer.parseInt(str);
		} catch (Exception e) {
			this.currentPage = 1;
		}
		;
		if (this.currentPage < 1)
			this.currentPage = 1;
	}

	public Integer getStart() {
		return this.getPageSize() * (this.getCurrentPage() - 1);
	}

	public void setCurrentPage(Integer currentPage) {
		this.currentPage = currentPage;
	}

	public Integer getPageSize() {
		return pageSize;
	}

	public void setPageSize(Integer pageSize) {
		this.pageSize = pageSize;
	}

	public Integer getTotalPage() {
		return totalPage;
	}

	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	
	public Integer getPre(){
		if(this.currentPage==1){
			return 1;
		}else{
			return this.currentPage-1;
		}
	}
	
	public Integer getNext(){
		if(this.currentPage==this.totalPage){
			return this.totalPage;
		}
		else{
			return this.currentPage+1;
		}
	}
}
