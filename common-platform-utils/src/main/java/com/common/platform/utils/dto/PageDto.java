package com.common.platform.utils.dto;

import java.util.List;

public class PageDto<T> {

	private PageModel model;
	
	private List<T> data;

	public PageModel getModel() {
		return model;
	}

	public void setModel(PageModel model) {
		this.model = model;
	}

	public List<T> getData() {
		return data;
	}

	public void setData(List<T> data) {
		this.data = data;
	}
	
	
	
}
